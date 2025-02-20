package pruebas;

public class Pruebas {
	static int n3;
	static float result1;
	static double result2;

	public static void main (String[] args){
		System.out.println(n3);
		a();
		System.out.println(n3);
		b();
		System.out.println(n3);
		c();
		
	}
	
	public static void a() {
		
		int n1;
		int n2;
		
		n1 = 10;
		n2 = 10;
		n3 = n1 * n2;
	}
	
	public static void b() {
		int n4;
		int n5;
		int n6;
		
		n4 = 100;
		n5 = 5;
		n6 = n3;
		
		n3 = (n6 + n5) - n4;
		
	}
	
	public static void c() {
		result1 = n3 / 47;
		result2 = n3 / 4;
		
		System.out.println(result1);
		System.out.println(result2);
	}
}

