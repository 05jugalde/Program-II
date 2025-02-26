package ClasesObjeto;

import java.util.List;
import java.util.ArrayList;
import ClasesObjeto.Jugador;

@SuppressWarnings("unused") // Esto evita advertencias sobre variables no usadas.
public class Equipo {
    // Atributos de la clase Equipo
    String categoria; // Categoría del equipo (por ejemplo, "Juvenil", "Senior")
    String nombreEquipo; // Nombre del equipo
    String competicion; // Competición en la que participa el equipo
    int pts; // Puntos del equipo
    int pj; // Partidos jugados
    int pg; // Partidos ganados
    int pe; // Partidos empatados
    int pp; // Partidos perdidos
    int gf; // Goles a favor
    int gc; // Goles en contra
    ArrayList<Jugador> jugadores; // Lista de jugadores del equipo

    /*
     * CONSTRUCTOR DE LA CLASE EQUIPO
     * Este constructor se utiliza para crear un objeto Equipo con todos los atributos.
     * Recibe el nombre del equipo, la categoría y la competición como parámetros.
     * Inicializa la lista de jugadores como un ArrayList vacío.
     */
    public Equipo(String nombreEquipo, String categoria, String competicion) {
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.competicion = competicion;
        this.jugadores = new ArrayList<>();
    }

    /*
     * MÉTODO toString() (CON ERROR TIPOGRÁFICO)
     * Este método debería devolver una representación en cadena del objeto Equipo.
     * Tiene un error tipográfico en el nombre (toStrign en lugar de toString).
     * Devuelve una cadena con el nombre del equipo, la categoría y la competición.
     */
    public String toStrign() { // DEBERÍA SER toString()
        return "Nombre del Equipo: " + this.nombreEquipo + "\t| " + "Categoria: " + this.categoria + "\t| " + "Competicion: " + this.competicion + "\t|";
    }

    /*
     * MÉTODO getEquipo()
     * Este método devuelve el nombre del equipo.
     * Se utiliza para acceder al atributo 'nombreEquipo' del objeto Equipo.
     */
    public String getEquipo() {
        return this.nombreEquipo;
    }

    /*
     * MÉTODO getCategoria()
     * Este método devuelve la categoría del equipo.
     * Se utiliza para acceder al atributo 'categoria' del objeto Equipo.
     */
    public String getCategoria() {
        return this.categoria;
    }

    /*
     * MÉTODO getCompeticion()
     * Este método devuelve la competición en la que participa el equipo.
     * Se utiliza para acceder al atributo 'competicion' del objeto Equipo.
     */
    public String getCompeticion() {
        return this.competicion;
    }

    /*
     * MÉTODO getJugadores()
     * Este método devuelve la lista de jugadores del equipo.
     * Se utiliza para acceder al atributo 'jugadores' del objeto Equipo.
     */
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public String getPts() {
        return "Puntos: " + this.pts;
    }

    public String getPj() {
        return "Partidos Jugados: " + this.pj;
    }

    public String getPg() {
        return "Partidos Ganados: " + this.pg;
    }

    public String getPe() {
        return "Partidos Empatados: " + this.pe;
    }

    public String sgetPp() {
        return "Partidos Perdidos: " + this.pp;
    }

    public String getGf() {
        return "Goles a Favor: " + this.gf;
    }

    public String getGc() {
        return "Goles en Contra: " + this.gc;
    }

    /*
     * MÉTODO add()
     * Este método añade un jugador al equipo.
     * Verifica si el jugador pertenece al equipo antes de añadirlo.
     * Muestra un mensaje si el jugador no pertenece al equipo.
     */
    public void add(Jugador jugador) {
        if (jugador.getEquipo().equals(this.nombreEquipo)) {
            jugadores.add(jugador);
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no pertenece al equipo " + this.nombreEquipo);
        }
    }

    /*
     * MÉTODO remove()
     * Este método elimina un jugador del equipo.
     * Elimina el jugador especificado de la lista de jugadores.
     */
    public void remove(Jugador jugador) {
        jugadores.remove(jugador);
    }

    /*
     * MÉTODO eliminarJugadorPorNombre()
     * Este método elimina un jugador del equipo por su nombre.
     * Utiliza la expresión lambda removeIf para eliminar el jugador con el nombre especificado.
     */
    public void eliminarJugadorPorNombre(String nombreJugador) {
        jugadores.removeIf(jugador -> jugador.getNombre().equals(nombreJugador));
    }

    /*
     * MÉTODO buscarJugadoresPorNombre()
     * Este método busca jugadores en el equipo por su nombre.
     * Devuelve una lista de jugadores que coinciden con el nombre especificado.
     */
    public List<Jugador> buscarJugadoresPorNombre(String nombre) {
        List<Jugador> jugadoresEncontrados = new ArrayList<>();
        for (Jugador jugador : this.getJugadores()) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                jugadoresEncontrados.add(jugador);
            }
        }
        return jugadoresEncontrados;
    }

    /*
     * MÉTODO buscarJugadorPorDorsal()
     * Este método busca un jugador en el equipo por su dorsal.
     * Devuelve el jugador con el dorsal especificado, o null si no se encuentra.
     */
    public Jugador buscarJugadorPorDorsal(int dorsal) {
        for (Jugador jugador : this.getJugadores()) {
            if (jugador.getDorsal() == dorsal) {
                return jugador;
            }
        }
        return null;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }
}