package tema1.ejercicios;
import java.math.BigInteger;
public class Ejircicio1_0o {
	
	
    public static void main(String[] args) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger limite = BigInteger.valueOf(100);
		
		int repeticiones = 50;
		int numParaFactorial = 100;
		BigInteger factorial = calcularFactorial(numParaFactorial);
		
		
		
	
		calcularSerieDeFibonacci(a, b, limite);
		System.out.println("50(100!) = " + factorial.multiply(BigInteger.valueOf(repeticiones)));
	}
    
    public static void calcularSerieDeFibonacci(BigInteger a, BigInteger b, BigInteger limite){
    	System.out.print(a + ", " + b);
    	while(true) {
    		BigInteger siguiente = a.add(b);
    		if (siguiente.compareTo(limite) > 0) {
    			break;
    		}
    		else {
    			System.out.print(", " + siguiente);
    			a = b;
    			b = siguiente;
    		}
    	}
    	System.out.println();
    }
    
    public static BigInteger calcularFactorial(int n) {
    	BigInteger result = BigInteger.ONE;
    	for (int i = 1;  i < n; i++ ) {
    		result = result.multiply(BigInteger.valueOf(i));
    	}
    	return result;
    }
}
