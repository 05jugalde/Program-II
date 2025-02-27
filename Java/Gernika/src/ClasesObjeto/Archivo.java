package ClasesObjeto;

import com.google.gson.Gson;
import java.io.*;

/**
 * @author [Jon Ugalde]
 * @version 1.0
 * @since [27/02/2025]
 * @description Clase Archivo: esta clase proporciona métodos estáticos para la manipulación de archivos, incluyendo la carga y guardado de objetos Equipo y Jugador en formato JSON, así como la eliminación, verificación y edición de nombres de archivos.
 */

public class Archivo {
    private static final String CARPETA_ESTADISTICAS = "estadisticas/";
    private static final Gson gson = new Gson();

    /**
     * FUNCIÓN PARA CARGAR UN EQUIPO DESDE UN ARCHIVO JSON
     * Este método recibe el nombre del archivo desde donde se cargará el equipo.
     * Utiliza la librería Gson para convertir el contenido del archivo JSON a un objeto 'Equipo'.
     * Si ocurre un error, devuelve null.
     *
     * @param nombreArchivo El nombre del archivo (sin la extensión .json).
     * @return El objeto Equipo cargado desde el archivo, o null si ocurre un error.
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
     *
     * @param nombreArchivo El nombre del archivo (sin la extensión .json).
     */
    public static void eliminarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo + ".json");

        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Archivo " + nombreArchivo + ".json eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo " + nombreArchivo + ".json.");
            }
        } else {
            System.out.println("El archivo " + nombreArchivo + ".json no existe.");
        }
    }

    /**
     * FUNCIÓN PARA GUARDAR UN EQUIPO EN UN ARCHIVO JSON
     * Este método recibe un objeto 'Equipo' y el nombre del archivo donde se guardará.
     * Utiliza la librería Gson para convertir el objeto 'Equipo' a formato JSON y guardarlo en el archivo.
     *
     * @param equipo El objeto Equipo a guardar.
     * @param nombreArchivo El nombre del archivo (sin la extensión .json).
     */
    public static void guardarEquipo(Equipo equipo, String nombreArchivo) {
        Gson gson = new Gson();
        String json = gson.toJson(equipo);

        try (FileWriter writer = new FileWriter(nombreArchivo + ".json")) {
            writer.write(json);
            System.out.println("Equipo guardado en " + nombreArchivo + ".json");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar el equipo en " + nombreArchivo + ".json");
        }
    }

    /**
     * FUNCIÓN PARA VERIFICAR SI UN ARCHIVO JSON EXISTE
     * Este método recibe el nombre del archivo que se verificará.
     * Devuelve true si el archivo existe, false si no.
     *
     * @param nombreArchivo El nombre del archivo (sin la extensión .json).
     * @return true si el archivo existe, false si no.
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
     *
     * @param nombreActual El nombre actual del archivo (sin la extensión .json).
     * @param nuevoNombre El nuevo nombre del archivo (sin la extensión .json).
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

    /**
     * FUNCIÓN PARA GUARDAR LAS ESTADÍSTICAS DE UN JUGADOR EN UN ARCHIVO JSON
     * Este método recibe un objeto 'Jugador' y guarda sus estadísticas en un archivo JSON.
     * El nombre del archivo se genera a partir del nombre y apellido del jugador.
     *
     * @param jugador El objeto Jugador cuyas estadísticas se guardarán.
     */
    public static void guardarEstadisticas(Jugador jugador) {
        // Asegurarse de que el directorio exista
        File directorio = new File(CARPETA_ESTADISTICAS);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        // Crear el nombre del archivo con el nombre del jugador
        String nombreArchivo = CARPETA_ESTADISTICAS + jugador.getNombre() + "_" + jugador.getApellido() + "_estadisticas.json";

        try (Writer writer = new FileWriter(nombreArchivo)) {
            gson.toJson(jugador, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * FUNCIÓN PARA CARGAR LAS ESTADÍSTICAS DE UN JUGADOR DESDE UN ARCHIVO JSON
     * Este método recibe el nombre y apellido del jugador y carga sus estadísticas desde un archivo JSON.
     *
     * @param nombreJugador El nombre del jugador.
     * @param apellido El apellido del jugador.
     * @return El objeto Jugador con las estadísticas cargadas, o null si ocurre un error o el archivo no existe.
     */
    public static Jugador cargarEstadisticas(String nombreJugador, String apellido) {
        // Crear el nombre del archivo con el nombre del jugador
        String nombreArchivo = CARPETA_ESTADISTICAS + nombreJugador + "_" + apellido + "_estadisticas.json";

        try (Reader reader = new FileReader(nombreArchivo)) {
            return gson.fromJson(reader, Jugador.class);
        } catch (FileNotFoundException e) {
            return null; // Retorna null si el archivo no existe
        } catch (IOException e) {
            e.printStackTrace(); // Maneja la IOException
            return null; // O lanza una excepción personalizada, o retorna un valor por defecto.
        }
    }
}