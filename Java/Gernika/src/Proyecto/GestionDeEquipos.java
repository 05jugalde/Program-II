package Proyecto;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.spi.FileSystemProvider;

import com.google.gson.Gson;
import java.io.File;

import ClasesObjeto.Equipo;
import ClasesObjeto.Jugador;

@SuppressWarnings("unused") // Esto evita una advertencia sobre variables no usadas.
public class GestionDeEquipos {

    public static void main(String[] args) {

        Equipo e1 = cargarEquipo("CadeteA");
        Equipo e2 = cargarEquipo("Alevin2014B");
        
        Equipo[] equipos = {e1, e2};
        for(Equipo equipo: equipos) {System.out.println(equipo.toStrign());}
        
        visualizarJugadores(e1);
    }

    /*
     * FUNCIÓN PARA MOSTRAR LOS JUGADORES
     * Este método recibe un objeto 'Equipo' como parámetro y muestra la información de cada jugador en un formato de tabla.
     * Utiliza 'System.out.printf()' para formatear la salida y alinear las columnas.
     */
    private static void visualizarJugadores(Equipo equipo) {
        // Verifica si el equipo es null antes de intentar mostrar los jugadores.
        if (equipo != null) {
        	for(int i=0;i<2;i++) {System.out.println();}
            System.out.println(equipo.getEquipo() + ":");
            System.out.println();

            for (Jugador jugador : equipo.getJugadores()) {
                System.out.printf("Nombre: %-15s | Apellido: %-15s | Dorsal: %-3d\n",
                        jugador.getNombre(), jugador.getApellido(), jugador.getDorsal());
            }
        } else {
            System.out.println("No se pudo cargar el equipo, no hay jugadores para mostrar.");
        }
    }

    /*
     * FUNCIÓN PARA GUARDAR UN EQUIPO EN UN ARCHIVO JSON
     * Este método recibe un objeto 'Equipo' y el nombre del archivo donde se guardará.
     * Utiliza la librería Gson para convertir el objeto 'Equipo' a formato JSON y escribirlo en el archivo.
     */
    public static void guardarEquipo(Equipo equipo, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo + ".json")) {
            Gson gson = new Gson();
            gson.toJson(equipo, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
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

    /*
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
                System.out.println("No se pudo eliminar el archivo " + nombreArchivo + ".json.");
            }
        } else {
            System.out.println("El archivo " + nombreArchivo + ".json no existe.");
        }
    }

    /*
     * FUNCIÓN PARA VERIFICAR SI UN ARCHIVO JSON EXISTE
     * Este método recibe el nombre del archivo que se verificará.
     * Devuelve true si el archivo existe, false si no.
     */
    public static boolean existeArchivoJSON(String nombreArchivo) {
        File archivo = new File(nombreArchivo + ".json");
        return archivo.exists();
    }

}