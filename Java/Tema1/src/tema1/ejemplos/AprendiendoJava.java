package tema1.ejemplos;

public class AprendiendoJava {
	

	public static void main (String[] args) {
		inicializar();
		verTodo();
		verHastaMayorQue(25);
		int mayor = 0;
		calcularElMayor( mayor );
		System.out.println( "Mayor: " + mayor );  // No funciona
		System.out.println( "Mayor: " + mayor() );
		// sumaimparesrestapares (devolviendo esa suma)
		System.out.println( "Suma impares-pares = " + sumaImparesRestaPares() );
		// visualizahastaqueunoseamenor
		visualizaHastaQueUnoSeaMenor();
	}
	
	static int[] vector;
	
	/** 
	 * Inicializa un vector de 20 posiciones con valores aleatorioas de 1 a 50
	 */
	
	static void inicializar() {
		
//		int i = 0;
//		while (i<20) {
//			/*...*/
//			i++;
//		}
		
		vector = new int[20]; //Crea un vector de 20 posiciones. Asigna una memoria de 20 posiciones al vector.
		for (int i=0 /*Inicializazion*/; i<20 /*Condicion De Continuacion*/; i++ /* Actualizacion*/) {
			vector[i] = (int)/*Casting explicito, de doblue (decimales), a int (Entero)*/(Math.random() * 50/*Rango entre 0 y 49*/) + 1 /*Para hacer de 50*/;		
		}
		
	}
	
	
	/**
	 * Saca a consola el vector en una sola linea separando los elementos por espacio
	 */
	
	static void verTodo() {
		for (int valor: vector) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	/**
	 * Saca a consola el vector de izquierda a derecha avado en el ultimo valor inferior o igual al umbral
	 *  En una sola linea separando valores por espacios
	 * @param umbralMayor Valor del umbral, debe ser positivo
	 */
	
	static void verHastaMayorQue( int umbralMayor) {
		int indice = 0;
		while (vector[indice] <= umbralMayor) {
		  System.out.print(vector[indice] + " ");
		  indice++;
		  
		}
		
//		for (int indice = 0; vector[indice] <= umbralMayor; indice++) {
//			System.out.print(vector[indice] + " ");
//		}
		
		System.out.println();	
		
	}
	
	/** Calcula el valor mayor del vector y lo devuelve
	 * @return	El valor mayor
	 */
	static int mayor() {
		int mayor = 0;
		for (int dato : vector) {
			if (dato > mayor) {
				mayor = dato;
			}
		}
		return mayor;
	}
		
	
	// Java pasa los parámetros por VALOR (copia), no por REFERENCIA
	// el método NUNCA puede cambiar mis variables
	// Andoni nos está engañando???
	
	static void calcularElMayor( int mayor ) {
		for (int dato : vector) {
			if (dato > mayor) {
				mayor = dato;
				// System.out.println( "Cambio: " + mayor );
			}
		}
		// System.out.println( "Mayor total:" + mayor );
	}	

	/** Calcula la suma de todos los impares restando todos los pares
	 * @return	Resultado
	 */
	
	public static int sumaImparesRestaPares() {
		int suma = 0;
		for (int dato : vector) {
			if (dato % 2 == 1) {
				suma += dato;
			} else {
				suma -= dato;
			}
		}
		return suma;
	}

	/** Visualiza en consola los elementos del vector hasta que uno sea menor que el anterior. Ese no lo saca y finaliza
	 */
	
	public static void visualizaHastaQueUnoSeaMenor() {
		int i=0;
		do {
			System.out.print( vector[i] + " " );
			i++;
		} while (i<vector.length && vector[i] > vector[i-1]);
	}
		
}
