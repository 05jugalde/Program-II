package tema1.ejercicios;
import java.awt.Dimension;

public class Ejercicio1_0m {
    public static void main(String[] args) {
    	Dimension pantalla = new Dimension(1920, 1080);
    	System.out.println("Las medidas de la pantalla son: " + pantalla.getWidth() + " x " + pantalla.getHeight() );
    	
    	
    	// Condicion que devuelve False 
    	pantalla.setSize(1360, 768);;
    	System.out.println("Las medidas de la pantalla son: " + pantalla.getWidth() + " x " + pantalla.getHeight() );
    	esPantallaGrande(pantalla);
    	
    	
    	// Condicion que devuelce True
    	pantalla.setSize(2040, 1920);
    	esPantallaGrande(pantalla);
	}
    
    // Queda pendiente de revisar
    public static void esPantallaGrande(Dimension d) {
    	int ancho = (int)(d.getWidth());
    	int alto = (int)(d.getHeight());
    	boolean condicion;
    	
    	if (ancho >= 1920 && alto >= 1080) {
    		condicion = true;
    		System.out.println(condicion);
    	}
    	else {
    		condicion = false;
    		System.out.println(condicion);
    	}
    }
}
