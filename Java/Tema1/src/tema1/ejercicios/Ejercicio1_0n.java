package tema1.ejercicios;
import java.awt.Rectangle;

public class Ejercicio1_0n {
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10, 10, 50, 100);
		Rectangle rect2 = rect1;
		rect2.setSize(200,400);
		
		System.out.println(rect1);
		System.out.println(rect2);
		
		/*
		 * Debido al aliasing, podemos deducir que el objeto no almacena el valor directamente,
		 * sino la dirección de memoria. Por lo tanto, al asignar nuevas dimensiones a rect2,
		 * también se altera rect1, ya que ambos referencian al mismo objeto almacenado en la
		 * misma dirección de memoria.
		 */

	}
}
