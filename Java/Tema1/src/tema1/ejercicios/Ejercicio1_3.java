package tema1.ejercicios;

import ClasesObjetos.Vaca;

public class Ejercicio1_3 {
	
	public static void main(String[] args) {
		
		Vaca v1 = new Vaca("Mahala", 5, "motedado");
		Vaca v2 = new Vaca("Lola", 10, "marron");
		
		v1.muu();
		v1.compare(v2);
		
		v2.setEdad(5);
		v1.compare(v2);
		
		v2.setEdad(10);
		v1.setEdad(15);
		v1.compare(v2);
		
		v1.setEdad(5);
		
		System.out.println("Ganado: ");
		Vaca[] ganado = {v1,v2};
		
		for (Vaca vaca : ganado) {
			System.out.println(vaca);
		}
	}
	
	
}
