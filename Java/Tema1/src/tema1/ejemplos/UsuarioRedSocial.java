package tema1.ejemplos;
/**
 * Plantilla para objetos nuevos
 * Si es modulo de ejecuccion todo Static, plantillas (moldes) no es Static.
 */

public class UsuarioRedSocial {
	
	// Datos (atributos):
	
	// Esta variable es constante y compartida por todas las instancias de la clase.
	// Es 'static' porque su valor es el mismo para todos los objetos de UsuarioRedSocial.
	private static final double VALOR_POR_USUARIO = 3.5;
	
	// Estas variables son específicas de cada instancia de la clase.
	// Por eso estas variables no son 'static', a diferencia de la de arriba.
	public String nombre = "";
	public int numSeguidores;

	// Funciones (métodos):
	
	// Constructor que inicializa los atributos con valores proporcionados.
	public UsuarioRedSocial(String nombre, int numSeguidores) {
		// 'this' se usa para referirse al atributo de la instancia actual.
		this.nombre = nombre;
		this.numSeguidores = numSeguidores;
	}
		
	// Constructor por defecto que no hace nada, dejando los valores por defecto.
	public UsuarioRedSocial() {
		// Nada - valores por defecto
	}
	
	
	// Consultores:
	
	// Método que calcula el valor estimado del usuario en función de sus seguidores.
	public double calcularValor() {
		// No es necesario usar 'this' aquí porque no hay ambigüedad.
		return VALOR_POR_USUARIO * this.numSeguidores; 
	}
	
	
	//Modificadores:
	/*...*/
	
}
