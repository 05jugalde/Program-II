package ClasesObjetos;

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
	
	/**
	 * Método que calcula el valor estimado del usuario en función de sus seguidores.
	 */
	public double calcularValorEstimado() {
		// No es necesario usar 'this' aquí porque no hay ambigüedad.
		return VALOR_POR_USUARIO * this.numSeguidores; 
	}
	
	/**
	 * Metodo que consulta el numero de seguidores de un usuario
	 */
	public int getNumSeguidores() {
		return numSeguidores;
	}
	
	/**
	 * Metodo que consulta el nombre de un usuario
	 */
	public String getNombre() {
		return nombre;
	}
	
	/*
	public String aString() {
		return this.nombre + " - " + this.numSeguidores;
	}
	
	public String toString() {
		return aString();
	}
	*/
	
	public String toString() {
		return this.nombre + " - " + this.numSeguidores;
	}
	
	/**
	 * Consulta si el usuario "this" se ordena despues de "u2".
	 * Es decir, si "this" tiene menos seguidores que "u2".
	 * @param u2 Segundo usuario para la comparacion.
	 * @return Devuelve true si "this" thiene que ir despues que "u2", false en caso contrario.
	 */
	
	public boolean vaDespues(UsuarioRedSocial u2) {
		return this.numSeguidores < u2.numSeguidores;
	}
	
	
	//Modificadores:
	
	/**
	 * Modificar el nombre y el numero de seguidores de un usuario
	 * @param nombre Nuevo nombre de usuario
	 * @param numSeguidores Nuevo numero de seguidores
	 */
	public void setNuevosDatos(String nombre, int numSeguidores) {
		this.nombre = nombre;
		this.numSeguidores = numSeguidores;
	}
	
	
	/**
	 * Modifica el nombre de un suauario
	 * @param nombre Nuevo nombre de usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Modifica el numero de seguidores de un suauario
	 * @param numSeguidores Nuevo numero de seguidores
	 */
	public void setNumSeguidores(int numSeguidores) {
		this.numSeguidores = numSeguidores;
	}
	
	
	/**
	 * Calcula el numero de seguirdores restantes tras la resta de un "num" numero.
	 * @param num Valor que se lerstara al numero tal de seguidores del Usuario.
	 */
	public void restaSeguidores(int num) {
		if (this.numSeguidores - num < 0) {
			this.numSeguidores = 0;
		} 
		else {
			this.numSeguidores = this.numSeguidores - num;
		}
	}
	
} 
