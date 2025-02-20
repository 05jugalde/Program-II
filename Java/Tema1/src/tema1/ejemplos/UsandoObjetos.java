package tema1.ejemplos;

import java.awt.Point;

public class UsandoObjetos {
	public static void main(String[] args) {
		usandoPoints();
	}
	
	public static void usandoPoints() {
		Point punto1 = new Point(5,2);
		Point punto2 = new Point(5,8);
		System.out.println("Punto 1 = " + punto1 + " / Punto 2 = " + punto2);
		System.out.println("Distancia = " + punto1.distance(punto2.x, punto2.y)); // No se pueden usar operadores comunes. Se deven usar metodos.
			//Sintaxis siempre la misma, objeto.atributo o objeto.metodo(...)
		punto1.translate(+3, +3);
		System.out.println("Punto 1 tras trasladar +3, +3 = " + punto1);
		   // Hay metodos que CONSULTAN (distance, ...) y metodos que MODIFICAN (translate, ...)
		
		// ¿Como se consultan los datos basicos de un objeto?
		// A veces con atributos directos
		
		System.out.println("Punto 1 tiene x = " + punto1.x + "e y =" + punto1.y);
		// Mediante atributos podria modificar p1.x = 7
		
		// La mayoria de veces con metodos de consulta
		System.out.println("Punto 1 tiene x = " + punto1.getX() + "e y" + punto1.getY());
		
		// Modificadores set...
		//punto1.setLocation(4, 5);
		
		// Y se puede modificar edesde otro metodo?
		muevemeEstePunto(punto1, -11, 3);
		
		Point punto3 = null; // Si no se inicialica y se usa, da error de compilacion
			// las variables locales objetos deben inicializarse
			// los atributos objetos se inicializan por defecto con null
			// null es una referencia NULA, es como decir que la variable no referencia a NINGÚN objeto
		System.out.println( "El punto 3 está con valor... " + punto3 );
		
		creameEstePunto( punto3 );
		System.out.println( "Punto 3 nuevo creado: " + punto3 );
		// Sin embargo, el método NO PUEDE CAMBIAR nuestra referencia (recuerda: se COPIA)
		// Si el objeto está creado, lo puede consultar y modificar. Pero no puede CAMBIAR de objeto.
		// Si el objeto no está creado, no lo puede crear

		Point punto4 = punto2;  // Esto se llama aliasing
		System.out.println( "Puntos 2,4 = " + punto2 + " / " + punto4 );
		System.out.println( "Cambiamos el 4" );
		punto4.x = -3;
		System.out.println( "Puntos 2,4 = " + punto2 + " / " + punto4 );
		// ¿POR QUÉ ha cambiado el 2 además del 4?
		// Porque son el mismo. Solo hay un punto, referenciado por dos variables.
		// Cuidado con esto, hay que tener conciencia de cuántos objetos tenemos y cuántas variables los referencian. 
		// Con primitivos, variable = dato. Una variable, un dato. Dos variables, dos datos.
		// Con objetos, Variable no es lo mismo que dato. Una variable puede ser un dato o ninguno (null). Dos variables pueden referenciar a solo un dato.
		// Con objetos la variable es la referencia a un dato(objeto) (o a ninguno).
		
		// ¿Son iguales, ya puestos?
		System.out.println( "Valores 1-2-3-4: " + punto1 + " / " + punto2 + " / " + punto3 + " / " + punto4 );
		System.out.println( "punto1 == punto2? " + (punto1==punto2) );
		System.out.println( "punto4 == punto2? " + (punto4==punto2) );
		// ¿Por qué 1==2 es false?  == compara las REFERENCIAS de los objetos
		System.out.println( "punto1 equals punto2? " + (punto1.equals(punto2)) );
		System.out.println( "punto4 equals punto2? " + (punto4.equals(punto2)) );
		// equals es un método en todos los objetos y compara el CONTENIDO de los objetos

		// Y en ese tiempo en el que la variable tiene null en lugar de objeto asociado... qué peligro hay?
		// Por ejemplo intentemos visualizar el punto si está en coordenadas positivas
		// Código incorrecto
		/*if (punto3.getX() >= 0 && punto3.getY() >= 0) {
			System.out.println( punto3 );
		}*/
		// ERROR DE EJECUCIÓN!!!  NullPointerException
		// Recordáis la "cláusula de protección" del && con falso (en cortocircuito)?
		// Código correcto:
		if (punto3!=null && punto3.getX() >= 0 && punto3.getY() >= 0) {
			System.out.println( punto3 );
		}
			
	}
	
	/**
	 * Modifica la informacion del punto
	 * @param p Punto a modificar
	 * @param x Nueva coordenada x
	 * @param y Nueva coordenada y
	 */
	
	private static void muevemeEstePunto(Point punto, int x, int y) {
		System.out.println("Punto original: " + punto);
		punto.setLocation(x, y);
		// p.x = x; p.y=y;
		System.out.println("Punto moduficado: " + punto);
	}
	
	private static void creameEstePunto(Point punto) {
		punto = new Point(-4,2);
	}
}	