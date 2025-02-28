package ClasesObjetos;

import java.util.ArrayList;

public class ListaReproduccion {
    private String nombre;
    private ArrayList<Cancion> canciones;
    private ArrayList<Cancion> cancionesEliminadas;
    private int cancionActual;
    private boolean reproduciendo;

    /**
     * Constructor que inicializa una nueva lista de reproducción con un nombre dado.
     * @param nombre Nombre de la lista de reproducción.
     */
    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
        this.cancionesEliminadas = new ArrayList<>();
        this.cancionActual = 0;
    }

    /**
     * Método para obtener el nombre de la lista de reproducción.
     * @return Nombre de la lista de reproducción.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para obtener la lista de canciones en la lista de reproducción.
     * @return Lista de canciones.
     */
    public ArrayList<Cancion> getCanciones() {
        return this.canciones;
    }

    /**
     * Método para obtener el nombre de la canción que se está reproduciendo actualmente.
     * @return Nombre de la canción actual o null si no hay canción actual.
     */
    public String getNombreCancionActual() {
        if (canciones.isEmpty() || !reproduciendo || this.cancionActual < 0 || this.cancionActual >= canciones.size()) {
            return null;
        }
        return canciones.get(this.cancionActual).getNombre();
    }

    /**
     * Método para obtener la canción que se está reproduciendo actualmente.
     * @return Canción actual o null si no hay canción actual.
     */
    public Cancion getCancionActual() {
        if (canciones.isEmpty() || !reproduciendo) {
            return null;
        }
        return canciones.get(cancionActual);
    }

    /**
     * Método para establecer el nombre de la lista de reproducción.
     * @param nombre Nuevo nombre de la lista de reproducción.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para agregar una canción a la lista de reproducción.
     * @param cancion Canción a agregar.
     */
    public void add(Cancion cancion) {
        canciones.add(cancion);
    }

    /**
     * Método para eliminar una canción de la lista de reproducción.
     * @param cancion Canción a eliminar.
     */
    public void remove(Cancion cancion) {
        cancionesEliminadas.add(cancion);
        canciones.remove(cancion);
    }

    /**
     * Método para recuperar una canción eliminada y agregarla de nuevo a la lista de reproducción.
     * @param cancion Canción a recuperar.
     */
    public void recuperarCancion(Cancion cancion) {
        canciones.add(cancion);
        cancionesEliminadas.remove(cancion);
    }

    /**
     * Método para buscar una canción en la lista de reproducción por su nombre.
     * @param cancion Canción a buscar.
     * @return Canción encontrada o null si no se encuentra.
     */
    public Cancion buscarCancion(Cancion cancion) {
        if (canciones != null && !canciones.isEmpty()) {
            for (Cancion cancion2 : canciones) {
                if (cancion.getNombre().equals(cancion2.getNombre())) {
                    return cancion2;
                }
            }
        }
        return null;
    }

    /**
     * Método para calcular el tiempo total de reproducción de las canciones en la lista.
     * @return Tiempo total de reproducción en segundos.
     */
    public double tiempoDeRepro() {
        double tiempoDeRepro = 0;
        if (canciones != null && !canciones.isEmpty()) {
            for (Cancion cancion : canciones) {
                tiempoDeRepro += cancion.getDuracion();
            }
        }
        return tiempoDeRepro;
    }

    /**
     * Método para iniciar la reproducción de la lista de reproducción.
     */
    public void reproducir() {
        if (canciones.isEmpty() || reproduciendo) {
            return;
        }
        reproduciendo = true;
        reproducirCancionActual();
    }

    /**
     * Método para detener la reproducción de la lista de reproducción.
     */
    public void parar() {
        reproduciendo = false;
    }

    /**
     * Método para reiniciar la reproducción de la lista de reproducción desde el principio.
     */
    public void reiniciar() {
        this.cancionActual = 0;
        if (reproduciendo) {
            reproducirCancionActual();
        }
    }

    /**
     * Método privado para reproducir la canción actual y avanzar a la siguiente.
     */
    private void reproducirCancionActual() {
        if (this.cancionActual >= 0 && this.cancionActual < canciones.size()) {
            Cancion cancion = canciones.get(cancionActual);
            System.out.println("Reproduciendo: " + cancion.getNombre());
            if (this.cancionActual + 1 >= canciones.size()) {
                parar();
            } else {
                this.cancionActual++;
            }
        }
    }

    /**
     * Método para intercambiar la posición de dos canciones en la lista de reproducción.
     * @param cancion1 Índice de la primera canción.
     * @param cancion2 Índice de la segunda canción.
     */
    public void intercambiar(int cancion1, int cancion2) {
        Cancion temp = canciones.get(cancion1);
        canciones.set(cancion1, canciones.get(cancion2));
        canciones.set(cancion2, temp);
    }
    
    /**
     * Método para visualizar todas las canciones en la lista de reproducción.
     */
    public void visualizarCanciones() {
        if (canciones.isEmpty()) {
            System.out.println("La lista de reproducción está vacía.");
            return;
        }

        // Calcular el ancho máximo de cada columna
        int maxNumero = 3;
        int maxNombre = 6;
        int maxCantante = 8;
        int maxDuracion = 8;
        int maxEstado = 6;
        int maxPuntoRepro = 19;

        for (Cancion cancion : canciones) {
            maxNombre = Math.max(maxNombre, cancion.getNombre().length());
            maxCantante = Math.max(maxCantante, cancion.getCantante().length());
        }

        // Imprimir encabezado
        System.out.printf("%-" + maxNumero + "s | %-" + maxNombre + "s | %-" + maxCantante + "s | %-" + maxDuracion + "s | %-" + maxEstado + "s | %-" + maxPuntoRepro + "s%n",
                "Num", "Nombre", "Cantante", "Duracion", "Estado", "Punto Reproduccion");

        // Imprimir canciones
        for (int i = 0; i < canciones.size(); i++) {
            Cancion cancion = canciones.get(i);
            System.out.printf("%-" + maxNumero + "d | %-" + maxNombre + "s | %-" + maxCantante + "s | %-" + maxDuracion + ".2f | %-" + maxEstado + "b | %-" + maxPuntoRepro + ".2f%n",
                    i + 1, cancion.getNombre(), cancion.getCantante(), cancion.getDuracion(), cancion.getEstado(), cancion.getPuntoDeRepro());
        }
    }
}