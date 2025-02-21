package tema1.ejercicios;

// Importa la clase BigInteger desde el paquete java.math
import java.math.BigInteger;

public class Ejircicio1_0o {
	
    public static void main(String[] args) {
    	
        /*
         * Inicializa dos BigInteger a y b con los valores 0 y 1, respectivamente.
         * Estos representan los dos primeros números de la serie de Fibonacci.
         */
    	
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        
        // Define el límite hasta el cual se calculará la serie de Fibonacci.
        BigInteger limite = BigInteger.valueOf(100);
        
        // Define el número de repeticiones y el número para calcular el factorial.
        int repeticiones = 50;
        int numParaFactorial = 100;
        
        // Calcula el factorial del número especificado.
        BigInteger factorial = calcularFactorial(numParaFactorial);
        
        // Calcula e imprime la serie de Fibonacci hasta el límite especificado.
        calcularSerieDeFibonacci(a, b, limite);
        
        // Imprime el resultado de multiplicar el factorial por el número de repeticiones.
        System.out.println("50(100!) = " + factorial.multiply(BigInteger.valueOf(repeticiones)));
    }
    
    
    
    /**
     * Método para calcular e imprimir la serie de Fibonacci hasta un límite especificado.
     * Toma tres parámetros: los dos primeros números de la serie y el límite.
     * @param a Valor inicial = 0
     * @param b Valor inicial = 1
     * @param limite Valor limie.
     */
    public static void calcularSerieDeFibonacci(BigInteger a, BigInteger b, BigInteger limite) {
        // Imprime los dos primeros números de la serie.
        System.out.print(a + ", " + b);
        
        // Bucle para calcular los siguientes números de la serie.
        while (true) {
            // Calcula el siguiente número de la serie sumando los dos anteriores.
            BigInteger siguiente = a.add(b);
            
            // Si el siguiente número supera el límite, se detiene el bucle.
            if (siguiente.compareTo(limite) > 0) {
                break;
            } else {
                // Imprime el siguiente número de la serie.
                System.out.print(", " + siguiente);
                
                // Actualiza los valores de a y b para el siguiente cálculo.
                a = b;
                b = siguiente;
            }
        }
        
        // Imprime una nueva línea al final de la serie.
        System.out.println();
    }
    
    /**
     * Método para calcular el factorial de un número.
     * @param n Número para el cual se calculará el factorial.
     * @return Devuelve el factorial como un BigInteger.
     */
    public static BigInteger calcularFactorial(int n) {
        // Inicializa el resultado como 1.
        BigInteger result = BigInteger.ONE;
        
        // Bucle para multiplicar los números sucesivos hasta n.
        for (int i = 1; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        // Devuelve el resultado final.
        return result;
    }
}
