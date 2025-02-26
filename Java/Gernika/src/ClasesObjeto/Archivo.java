package ClasesObjeto;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Archivo {
	
	  /**
	  * FUNCIÓN PARA CARGAR UN EQUIPO DESDE UN ARCHIVO JSON
	  * Este método recibe el nombre del archivo desde donde se cargará el equipo.
	  * Utiliza la librería Gson para convertir el contenido del archivo JSON a un objeto 'Equipo'.
	  * Si ocurre un error, devuelve null.
	  */
	  public static Equipo cargarEquipo(String nombreArchivo) {
	      try (FileReader reader = new FileReader(nombreArchivo + ".json")) {
	          Gson gson = new Gson();
	          return gson.fromJson(reader, Equipo.class);
	      } catch (IOException e) {
	          e.printStackTrace();
	          return null;
	      }
	  }

	  /**
	  * FUNCIÓN PARA ELIMINAR UN ARCHIVO JSON
	  * Este método recibe el nombre del archivo que se eliminará.
	  * Verifica si el archivo existe y, si existe, lo elimina.
	  * Muestra mensajes informativos sobre el resultado de la operación.
	  */
	  public static void eliminarArchivo(String nombreArchivo) {
	      File archivo = new File(nombreArchivo + ".json");

	      if (archivo.exists()) {
	          if (archivo.delete()) {
	              System.out.println("Archivo " + nombreArchivo + ".json eliminado correctamente.");
	          } else {
	              System.out.println("No se pudo eliminar el archivo " + nombreArchivo + ".json.");}
	      } else {
	    	  System.out.println("El archivo " + nombreArchivo + ".json no existe.");
	      }
	    }

	 /**
	 * FUNCIÓN PARA VERIFICAR SI UN ARCHIVO JSON EXISTE
	 * Este método recibe el nombre del archivo que se verificará.
	 * Devuelve true si el archivo existe, false si no.
	 */
	 public static boolean existeArchivoJSON(String nombreArchivo) {
		 File archivo = new File(nombreArchivo + ".json");
	     return archivo.exists();
	 }
	    
    /**
     * FUNCIÓN PARA EDITAR EL NOMBRE DE UN ARCHIVO JSON
     * Este método recibe el nombre actual y el nuevo nombre del archivo.
     * Renombra el archivo si existe.
     * Muestra mensajes informativos sobre el resultado de la operación.
     */
    public static void editarNombreArchivo(String nombreActual, String nuevoNombre) {
         File archivoAntiguo = new File(nombreActual + ".json");
         File archivoNuevo = new File(nuevoNombre + ".json");

         if (archivoAntiguo.exists()) {
             if (archivoAntiguo.renameTo(archivoNuevo)) {
                 System.out.println("Archivo " + nombreActual + ".json renombrado a " + nuevoNombre + ".json correctamente.");
             } else {
                 System.out.println("No se pudo renombrar el archivo " + nombreActual + ".json.");
             }
         } else {
             System.out.println("El archivo " + nombreActual + ".json no existe.");
         }
     }
}
