package tema1.ejercicios;

import ClasesObjetos.*;

public class Ejercicio1_15b {	
	public static void main(String[] args) {
		Cancion c1 = new Cancion("Mr Moondial", "Quevedo");
		Cancion c2 = new Cancion("Halo", "Quevedo y La Pantera");
		ListaReproduccion l1 = new ListaReproduccion("Quevedo");
		
		l1.add(c1);
		l1.add(c2);
		
		l1.intercambiar(1, 0);
		l1.intercambiar(0, 1);
		
		c1.visualizarCancion();
		
	}
}
