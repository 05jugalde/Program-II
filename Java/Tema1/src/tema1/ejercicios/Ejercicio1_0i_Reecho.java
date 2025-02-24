package tema1.ejercicios;

// Importa las clases necesarias para trabajar con arrays y comparadores
import java.util.Arrays;
import java.util.Comparator;

import ClasesObjetos.UsuarioRedSocial;

public class Ejercicio1_0i_Reecho {
    public static void main(String[] args) {
        
    	/*
         * Crea instancias de UsuarioRedSocial con diferentes nombres y números de seguidores.
         * Los usuarios se inicializan con valores predeterminados o se les asignan valores específicos.
         */
    	
        UsuarioRedSocial u1 = new UsuarioRedSocial();
        UsuarioRedSocial u2 = new UsuarioRedSocial();
        UsuarioRedSocial u3 = new UsuarioRedSocial("uugaitz_7", 1871);
        UsuarioRedSocial u4 = new UsuarioRedSocial("pelloaranceta", 717);
        UsuarioRedSocial u5 = new UsuarioRedSocial("uaietxebeee_", 527);

        // Asigna valores a las propiedades de los usuarios
        u1.nombre = "gartzi_18";
        u1.numSeguidores = 1726;

        u2 = new UsuarioRedSocial("asier.c1", 784);
        

        // Imprime la lista de usuarios sin ordenar
        System.out.println("Lista Sin Ordenar: ");
        System.out.println();
        crearListaDeUsuarios(u1, u2, u3, u4, u5);

        // Imprime dos líneas en blanco para separar las listas
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }

        // Crea un array con los usuarios
        UsuarioRedSocial[] usuarios = {u1, u2, u3, u4, u5};
        // Ordena los usuarios por número de seguidores en orden descendente
        ordenarUsuariosPorSeguidores(usuarios);

        // Imprime la lista de usuarios ordenada
        System.out.println("Lista Ordenada: ");
        System.out.println();
        for (UsuarioRedSocial usuario : usuarios) {
            System.out.println(usuario.nombre + " - " + usuario.numSeguidores);
        }
    }
    
    /**
     * Método para imprimir la lista de usuarios.
     * Recorre cada usuario y imprime su nombre y número de seguidores.
     * @param usuarios Lista Usuarios, min = 1. 
     */
    public static void crearListaDeUsuarios(UsuarioRedSocial... usuarios) {
        for (UsuarioRedSocial usuario : usuarios) {
            String nombre = usuario.nombre;
            int numeroDeS = usuario.numSeguidores;
            System.out.println(nombre + " - " + numeroDeS);
        }
    }

    
    
    
    /**
     * Método para ordenar los usuarios por número de seguidores en orden descendente.
     * Utiliza Arrays.sort con un comparador que compara el número de seguidores de cada usuario.
     * @param usuarios Array de usuarios definida en la clase Main
     */
    public static void ordenarUsuariosPorSeguidores(UsuarioRedSocial[] usuarios) {
        Arrays.sort(usuarios, Comparator.comparingInt(UsuarioRedSocial::getNumSeguidores).reversed());
    }
}