package tema1.ejercicios;

// Importa la clase Dimension desde el paquete java.awt
import java.awt.Dimension;

public class Ejercicio1_0m {
    public static void main(String[] args) {
    	
        /*
         * Crea una instancia de Dimension con las medidas de la pantalla (ancho y alto).
         * Imprime las medidas de la pantalla.
         */
    	
        Dimension pantalla = new Dimension(1920, 1080);
        System.out.println("Las medidas de la pantalla son: " + pantalla.getWidth() + " x " + pantalla.getHeight());

        /*
         * Cambia las medidas de la pantalla a 1360x768.
         * Imprime las nuevas medidas de la pantalla.
         * Llama al método esPantallaGrande para verificar si la pantalla es grande.
         * Esta condición debería devolver False.
         */
        
        pantalla.setSize(1360, 768);
        System.out.println("Las medidas de la pantalla son: " + pantalla.getWidth() + " x " + pantalla.getHeight());
        esPantallaGrande(pantalla);

        /*
         * Cambia las medidas de la pantalla a 2040x1920.
         * Llama al método esPantallaGrande para verificar si la pantalla es grande.
         * Esta condición debería devolver True.
         */
        
        pantalla.setSize(2040, 1920);
        esPantallaGrande(pantalla);
    }
  
    /**
     * Método que verifica si una pantalla es grande.
     * Una pantalla se considera grande si su ancho es mayor o igual a 1920 y su alto es mayor o igual a 1080.
     * Imprime True si la pantalla es grande, de lo contrario imprime False.
     * @param d Objato que contiene los datos de las dimensiones de una pantalla (ancho y alto) 
     */
    public static void esPantallaGrande(Dimension d) {
        int ancho = (int) (d.getWidth());
        int alto = (int) (d.getHeight());
        boolean condicion;

        if (ancho >= 1920 && alto >= 1080) {
            condicion = true;
            System.out.println(condicion);
        } else {
            condicion = false;
            System.out.println(condicion);
        }
    }
}
