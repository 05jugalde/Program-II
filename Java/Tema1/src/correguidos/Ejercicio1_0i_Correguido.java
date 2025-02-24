package correguidos;

import ClasesObjetos.UsuarioRedSocial;
import java.util.Arrays;

/** 
 * Solución ejercicio 1.0j  -  https://docs.google.com/document/d/1IjFLFCttA1PXIQjiK4nFGRaCODdvbT61_SRniIY6o1s/edit?tab=t.0
 */

public class Ejercicio1_0i_Correguido {
	//	Crea dos arrays, uno con los nombres de 4 o 5 usuarios de cualquier red social que uses,
	//	y otro con sus seguidores. Realiza un programa que muestre por consola esos usuarios 
	//  primero sin ordenar y luego ordenados por número de seguidores 
	//	(de mayor a menor).

	public static void main(String[] args) {
		
		UsuarioRedSocial[] usuarios = {
				
				new UsuarioRedSocial("@sama", 3400),
				new UsuarioRedSocial("@BillGates", 66000),
				new UsuarioRedSocial("@JeffBezos", 6700),
				new UsuarioRedSocial("@elonmusk", 217700)
				
		};
		
		System.out.println("Lista Desordenada:");
		System.out.println();
		visualizarUsuariosYSeguidores(usuarios);
		
		for (int i=0; i<3; i++) {System.out.println();}
		ordenaUsuariosPorSeguidores(usuarios);
		
		System.out.println("Lista Ordenada:");
		System.out.println();
		visualizarUsuariosYSeguidores(usuarios);
		
		for (UsuarioRedSocial usuario : usuarios) {
			usuario.restaSeguidores(3500);
		}
		
		for (int i=0; i<3; i++) {System.out.println();}
		System.out.println("Lista con 3500 usuarios menos: ");
		
		System.out.println();
		visualizarUsuariosYSeguidores(usuarios); 
		
		
	}
	
	// Visualiza línea a línea usuario tabulador nº seguidores
	private static void visualizarUsuariosYSeguidores(UsuarioRedSocial[] usuarios) {
		for (int i=0; i<usuarios.length; i++) {
			System.out.println( usuarios[i].toString());
		}
	}
	
	private static void ordenaUsuariosPorSeguidores(UsuarioRedSocial[] usuarios) {
		for (int pasada=0; pasada<usuarios.length-1; pasada++) {
			for (int comp=0; comp<usuarios.length-1; comp++) {  // TODO mejorar que solo se hagan las comparaciones necesarias
				boolean hayQueIntercambiar = usuarios[comp].vaDespues(usuarios[comp+1]);
				if (hayQueIntercambiar) {
					
					/*
					int aux = usuarios[comp].numSeguidores;
					usuarios[comp].numSeguidores = usuarios[comp+1].numSeguidores;
					usuarios[comp+1].numSeguidores = aux;
					String auxNombre = usuarios[comp].nombre;
					usuarios[comp].nombre = usuarios[comp+1].nombre;
					usuarios[comp+1].nombre = auxNombre;
					*/
					
					UsuarioRedSocial aux = usuarios[comp];
					usuarios[comp] = usuarios[comp+1];
					usuarios[comp+1] = aux;
					
				}
			}
		}
	}
	
}

