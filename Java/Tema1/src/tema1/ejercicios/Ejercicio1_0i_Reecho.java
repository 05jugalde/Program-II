package tema1.ejercicios;

import tema1.ejemplos.UsuarioRedSocial;
import java.util.ArrayList;

public class Ejercicio1_0i_Reecho {
	public static void main(String[] args) {
		 UsuarioRedSocial u1 = new UsuarioRedSocial();
		 UsuarioRedSocial u2 = new UsuarioRedSocial();
		 UsuarioRedSocial u3 = new UsuarioRedSocial("uugaitz_7", 1871);
		 UsuarioRedSocial u4= new UsuarioRedSocial("pelloaranceta", 717);
		 UsuarioRedSocial u5 = new UsuarioRedSocial("uaietxebeee_", 527);
		 	 
	     u1.nombre = "gartzi_18";
	     u1.numSeguidores = 1726;
	     
		 u2 = new UsuarioRedSocial("asier.c1", 784);
		 
		 crearListaDeUsuarios(u1, u2, u3, u4, u5);
		 
	}
	
	public static void crearListaDeUsuarios(UsuarioRedSocial... usuarios){
		 
		for (UsuarioRedSocial usuario: usuarios) {
			
			String nombre = usuario.nombre;
			int numeroDeS = usuario.numSeguidores;
			
			System.out.println(nombre + " - " + numeroDeS);
			
		}	
	 }
	 
	// Falta ordenarlo del mayor al menor
	 
}
