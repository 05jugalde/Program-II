package tema1.ejemplos;
import java.util.ArrayList;

import ClasesObjetos.UsuarioRedSocial; 


public class PruebaDeUsuarioRedSocial {
	 public static void main(String[] args) {
		 UsuarioRedSocial u1 = new UsuarioRedSocial();
		 UsuarioRedSocial u2 = new UsuarioRedSocial();
		 UsuarioRedSocial u3 = new UsuarioRedSocial("uugaitz_7", 1871);
		 UsuarioRedSocial u4= new UsuarioRedSocial("pelloaranceta", 717);
		 UsuarioRedSocial u5 = new UsuarioRedSocial("uaietxebeee_", 527);
		 
		 
		 
		 System.out.println(u1.nombre + " - " + u1.numSeguidores);
		 u1.nombre = "gartzi_18";
		 u1.numSeguidores = 1726;
		 System.out.println(u1.nombre + " - " + u1.numSeguidores);
		 
		 u2 = new UsuarioRedSocial("asier.c1", 784);
		 System.out.println(u3.nombre);
		 
		 System.out.println(u2.calcularValor());
		 
		 crearListaDeUsuarios(u1, u2, u3, u4, u5); 
		 
		 UsuarioRedSocial u6 = new UsuarioRedSocial("Atharratze", 1342);
		 System.out.println(u6.nombre + " - " + u6.numSeguidores);
		 u6.setNombre("asiermendibe");
		 System.out.println(u6.nombre + " - " + u6.numSeguidores);
		 u6.setNumSeguidores(438);
		 System.out.println(u6.nombre + " - " + u6.numSeguidores);
		 u6.setNuevosDatos("egurrolamarkel", 333);
		 System.out.println(u6.nombre + " - " + u6.numSeguidores);
	 }
	 
	 public static void crearListaDeUsuarios(UsuarioRedSocial... usuarios){
		 
		for (UsuarioRedSocial usuario: usuarios) {
			
			String nombre = usuario.nombre;
			int numeroDeS = usuario.numSeguidores;
			
			System.out.println(nombre + " - " + numeroDeS);
			
		}	
	 }
	 
}
