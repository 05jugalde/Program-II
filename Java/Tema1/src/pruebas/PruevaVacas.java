package pruebas;

import ClasesObjetos.Pelota;
import ClasesObjetos.Vaca;

public class PruevaVacas {
	
	public static void main(String[] args) {
		Vaca v1 = new Vaca("Pepe", 5, "marron rojizo");
		Vaca v2 = new Vaca("Eguzki", 5, "moteado");
		Vaca v3 = new Vaca("Zuri", 2, "negro");
		
		Vaca[] ganado = {v1,v2,v3};
		
		System.out.println("Ganado: ");
		System.out.println();
		
		for (Vaca v : ganado) {
			System.out.println(v);
		}
		
		Pelota p1 = new Pelota(30,2,200, 'a');
		System.out.println(p1);
	}
	
}
