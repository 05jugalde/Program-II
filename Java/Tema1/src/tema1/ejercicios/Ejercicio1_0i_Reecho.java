package tema1.ejercicios;

import tema1.ejemplos.UsuarioRedSocial;
import java.util.Arrays;
import java.util.Comparator;


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
		 
		 System.out.println("Lista Sin Ordenar: ");
		 System.out.println();
		 crearListaDeUsuarios(u1, u2, u3, u4, u5);
		 
		 for (int i = 0; i<2; i++) {
			 System.out.println();
		 }
		 
		 
		 UsuarioRedSocial[] usuarios = {u1, u2, u3, u4, u5};
	     ordenarUsuariosPorSeguidores(usuarios);
		 
	     System.out.println("Lista Ordenada: ");
	     System.out.println();
	     for (UsuarioRedSocial usuario : usuarios) {
	            System.out.println(usuario.nombre + " - " + usuario.numSeguidores);
	        }
	}
	
	public static void crearListaDeUsuarios(UsuarioRedSocial... usuarios){
		
		for (UsuarioRedSocial usuario: usuarios) {
			
			String nombre = usuario.nombre;
			int numeroDeS = usuario.numSeguidores;
			
			System.out.println(nombre + " - " + numeroDeS);
			
		}	
	 }
	
	public static void ordenarUsuariosPorSeguidores(UsuarioRedSocial[] usuarios) {
	        Arrays.sort(usuarios, Comparator.comparingInt(UsuarioRedSocial::getNumSeguidores).reversed());
	}

}
