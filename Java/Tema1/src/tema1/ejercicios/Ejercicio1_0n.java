package tema1.ejercicios;

// Importa la clase Rectangle desde el paquete java.awt
import java.awt.Rectangle;

public class Ejercicio1_0n {
	
	public static void main(String[] args) {
		
		/*
		 * Crea una instancia de Rectangle con las coordenadas (10, 10) y dimensiones (50, 100).
		 * rect1 es un objeto Rectangle que representa un rectángulo.
		 */
		
		Rectangle rect1 = new Rectangle(10, 10, 50, 100);
		
		/*
		 * Asigna rect1 a rect2. Esto no crea un nuevo objeto, sino que rect2 referencia al mismo
		 * objeto que rect1. Ambos rect1 y rect2 apuntan al mismo rectángulo en la memoria.
		 */
		
		Rectangle rect2 = rect1;
		
		/*
		 * Cambia las dimensiones del rectángulo referenciado por rect2 a (200, 400).
		 * Debido a que rect1 y rect2 referencian al mismo objeto, este cambio también afecta a rect1.
		 */
		
		rect2.setSize(200, 400);
		
		// Imprime las dimensiones y coordenadas del rectángulo referenciado por rect1.
		System.out.println(rect1);
		// Imprime las dimensiones y coordenadas del rectángulo referenciado por rect2.
		System.out.println(rect2);
		
		/*
		 * Debido al aliasing, podemos deducir que el objeto no almacena el valor directamente,
		 * sino la dirección de memoria. Por lo tanto, al asignar nuevas dimensiones a rect2,
		 * también se altera rect1, ya que ambos referencian al mismo objeto almacenado en la
		 * misma dirección de memoria.
		 */
	}
}