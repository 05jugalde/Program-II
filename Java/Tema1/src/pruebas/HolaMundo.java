package pruebas;

public class HolaMundo {
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.err.println("Adios");
		System.out.println(variable);
		a();
	}
	
	public static void a() {
		System.out.println("a");
	}
	
	//Se puede llamar a nombre que todavia no se hayan creado
	public static void b() {
		a();
		
		//Simpre hay que declarar las variables
		variable = 7;
		//Variable Local -> Pertenece al modulom (Color Gris)
		int variable2 = 5;
		System.out.println(variable + variable2);
	}
	
	public static void c() {
		//No se puede alterar la variable2, porque no es acesble desde otro metodo, devido a que es una variable local
	
	}
	
	//Las variables siempre perteneces a un unico tipo, no puede ser int y alvergar un string
	//Variable Glbal -> Pertenece a la clase (Color Azul)
	static int variable;

}