package tema1.ejemplos;

public class PruebaDeUsuarioRedSocial {
	 public static void main(String[] args) {
		 UsuarioRedSocial u1 = new UsuarioRedSocial();
		 UsuarioRedSocial u2 = new UsuarioRedSocial();
		 System.out.println(u1.nombre + " - " + u1.numSeguidores);
		 u1.nombre = "Jugalde";
		 u1.numSeguidores = 2268;
		 System.out.println(u1.nombre + " - " + u1.numSeguidores);
		 
		 u2 = new UsuarioRedSocial("Rosa", 24);
		 System.out.println(u1.nombre);
		 
		 System.out.println(u2.calcularValor());
	 }
}
