package ClasesObjeto;

import java.util.List;
import java.util.ArrayList;
import ClasesObjeto.Jugador;

@SuppressWarnings("unused")
public class Equipo {
    // Atributos de la clase Equipo
    String categoria; // Categoría del equipo (por ejemplo, "Juvenil", "Senior")
    String nombreEquipo; // Nombre del equipo
    String competicion; // Competición en la que participa el equipo
    int pts; // Puntos del equipo
    int pj; // Partidos jugados del equipo
    int pg; // Partidos ganados del equipo
    int pe; // Partidos empatados del equipo
    int pp; // Partidos perdidos del equipo
    int gf; // Goles a favor del equipo
    int gc; // Goles en contra del equipo
    ArrayList<Jugador> jugadores; // Lista de jugadores del equipo

    // Constructores:
    /**
     * CONSTRUCTOR DE LA CLASE EQUIPO
     * Este constructor se utiliza para crear un objeto Equipo con todos los atributos.
     * Recibe el nombre del equipo, la categoría y la competición como parámetros.
     * Inicializa la lista de jugadores como un ArrayList vacío.
     *
     * @param nombreEquipo Nombre del equipo.
     * @param categoria Categoría del equipo.
     * @param competicion Competición en la que participa el equipo.
     */
    public Equipo(String nombreEquipo, String categoria, String competicion) {
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.competicion = competicion;
        this.jugadores = new ArrayList<>();
    }

    public Equipo() {
		// TODO Auto-generated constructor stub
	}

	// Consultores (Getters):
    /**
     * MÉTODO getEquipo()
     * Este método devuelve el nombre del equipo.
     * Se utiliza para acceder al atributo 'nombreEquipo' del objeto Equipo.
     *
     * @return El nombre del equipo.
     */
    public String getEquipo() {
        return this.nombreEquipo;
    }

    /**
     * MÉTODO getCategoria()
     * Este método devuelve la categoría del equipo.
     * Se utiliza para acceder al atributo 'categoria' del objeto Equipo.
     *
     * @return La categoría del equipo.
     */
    public String getCategoria() {
        return this.categoria;
    }

    /**
     * MÉTODO getCompeticion()
     * Este método devuelve la competición en la que participa el equipo.
     * Se utiliza para acceder al atributo 'competicion' del objeto Equipo.
     *
     * @return La competición en la que participa el equipo.
     */
    public String getCompeticion() {
        return this.competicion;
    }

    /**
     * MÉTODO getJugadores()
     * Este método devuelve la lista de jugadores del equipo.
     * Se utiliza para acceder al atributo 'jugadores' del objeto Equipo.
     *
     * @return La lista de jugadores del equipo.
     */
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * MÉTODO getPts()
     * Devuelve los puntos del equipo como una cadena de texto.
     *
     * @return Los puntos del equipo.
     */
    public String getPts() {
        return "Puntos: " + this.pts;
    }

    /**
     * MÉTODO getPj()
     * Devuelve los partidos jugados del equipo como una cadena de texto.
     *
     * @return Los partidos jugados del equipo.
     */
    public String getPj() {
        return "Partidos Jugados: " + this.pj;
    }

    /**
     * MÉTODO getPg()
     * Devuelve los partidos ganados del equipo como una cadena de texto.
     *
     * @return Los partidos ganados del equipo.
     */
    public String getPg() {
        return "Partidos Ganados: " + this.pg;
    }

    /**
     * MÉTODO getPe()
     * Devuelve los partidos empatados del equipo como una cadena de texto.
     *
     * @return Los partidos empatados del equipo.
     */
    public String getPe() {
        return "Partidos Empatados: " + this.pe;
    }

    /**
     * MÉTODO getPp()
     * Devuelve los partidos perdidos del equipo como una cadena de texto.
     *
     * @return Los partidos perdidos del equipo.
     */
    public String getPp() {
        return "Partidos Perdidos: " + this.pp;
    }

    /**
     * MÉTODO getGf()
     * Devuelve los goles a favor del equipo como una cadena de texto.
     *
     * @return Los goles a favor del equipo.
     */
    public String getGf() {
        return "Goles a Favor: " + this.gf;
    }

    /**
     * MÉTODO getGc()
     * Devuelve los goles en contra del equipo como una cadena de texto.
     *
     * @return Los goles en contra del equipo.
     */
    public String getGc() {
        return "Goles en Contra: " + this.gc;
    }

    /**
     * MÉTODO buscarJugadoresPorNombre()
     * Este método busca jugadores en el equipo por su nombre.
     * Devuelve una lista de jugadores que coinciden con el nombre especificado.
     *
     * @param nombre Nombre del jugador a buscar.
     * @return Una lista de jugadores que coinciden con el nombre.
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

    /**
     * MÉTODO buscarJugadorPorDorsal()
     * Este método busca un jugador en el equipo por su dorsal.
     * Devuelve el jugador con el dorsal especificado, o null si no se encuentra.
     *
     * @param dorsal Dorsal del jugador a buscar.
     * @return El jugador con el dorsal especificado, o null si no se encuentra.
     */
    public Jugador buscarJugadorPorDorsal(int dorsal) {
        for (Jugador jugador : this.getJugadores()) {
            if (jugador.getDorsal() == dorsal) {
                return jugador;
            }
        }
        return null;
    }

    // Modificadores (Setters): 
    /**
     * MÉTODO setPts()
     * Establece los puntos del equipo.
     *
     * @param pts Los puntos del equipo.
     */
    public void setPts(int pts) {
        this.pts = pts;
    }

    /**
     * MÉTODO setPj()
     * Establece los partidos jugados del equipo.
     *
     * @param pj Los partidos jugados del equipo.
     */
    public void setPj(int pj) {
        this.pj = pj;
    }

    /**
     * MÉTODO setPg()
     * Establece los partidos ganados del equipo.
     *
     * @param pg Los partidos ganados del equipo.
     */
    public void setPg(int pg) {
        this.pg = pg;
    }

    /**
     * MÉTODO setPe()
     * Establece los partidos empatados del equipo.
     *
     * @param pe Los partidos empatados del equipo.
     */
    public void setPe(int pe) {
        this.pe = pe;
    }

    /**
     * MÉTODO setPp()
     * Establece los partidos perdidos del equipo.
     *
     * @param pp Los partidos perdidos del equipo.
     */
    public void setPp(int pp) {
        this.pp = pp;
    }

    /**
     * MÉTODO setGf()
     * Establece los goles a favor del equipo.
     *
     * @param gf Los goles a favor del equipo.
     */
    public void setGf(int gf) {
        this.gf = gf;
    }

    /**
     * MÉTODO setGc()
     * Establece los goles en contra del equipo.
     *
     * @param gc Los goles en contra del equipo.
     */
    public void setGc(int gc) {
        this.gc = gc;
    }
    
    // Otros Metodos: 
    /**
     * MÉTODO add()
     * Este método añade un jugador al equipo.
     * Verifica si el jugador pertenece al equipo antes de añadirlo.
     * Muestra un mensaje si el jugador no pertenece al equipo.
     *
     * @param jugador El jugador a añadir al equipo.
     */
    public void add(Jugador jugador) {
        if (jugador.getEquipo().equals(this.nombreEquipo)) {
            jugadores.add(jugador);
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no pertenece al equipo " + this.nombreEquipo);
        }
    }

    /**
     * MÉTODO remove()
     * Este método elimina un jugador del equipo.
     * Elimina el jugador especificado de la lista de jugadores.
     *
     * @param jugador El jugador a eliminar del equipo.
     */
    public void remove(Jugador jugador) {
        jugadores.remove(jugador);
    }

    /**
     * MÉTODO eliminarJugadorPorNombre()
     * Este método elimina un jugador del equipo por su nombre.
     * Utiliza la expresión lambda removeIf para eliminar el jugador con el nombre especificado.
     *
     * @param nombreJugador El nombre del jugador a eliminar.
     */
    public void eliminarJugadorPorNombre(String nombreJugador) {
        jugadores.removeIf(jugador -> jugador.getNombre().equals(nombreJugador));
    }
    
    /**
     * FUNCIÓN PARA MOSTRAR LOS JUGADORES
     * Este método muestra la información de cada jugador del equipo en un formato de tabla.
     * Utiliza 'System.out.printf()' para formatear la salida y alinear las columnas.
     */
    public void visualizarJugadores() {
        if (this.jugadores != null && !this.jugadores.isEmpty()) {
            for (int i = 0; i < 2; i++) {
                System.out.println();
            }
            System.out.println(this.nombreEquipo + ":");
            System.out.println();

            for (Jugador jugador : this.jugadores) {
                System.out.printf("Nombre: %-15s | Apellido: %-15s | Dorsal: %-3d\n",
                        jugador.getNombre(), jugador.getApellido(), jugador.getDorsal());
            }
        } else {
            System.out.println("El equipo no tiene jugadores para mostrar.");
        }
    }
    
    public void visualizarEstadisticasEquipo() {
        System.out.println("Estadísticas del equipo " + this.nombreEquipo + ":\n");
        System.out.printf("%-20s | %-10s\n", "Categoría", this.categoria);
        System.out.printf("%-20s | %-10s\n", "Competición", this.competicion);
        System.out.printf("%-20s | %-10d\n", "Puntos", this.pts);
        System.out.printf("%-20s | %-10d\n", "Partidos Jugados", this.pj);
        System.out.printf("%-20s | %-10d\n", "Partidos Ganados", this.pg);
        System.out.printf("%-20s | %-10d\n", "Partidos Empatados", this.pe);
        System.out.printf("%-20s | %-10d\n", "Partidos Perdidos", this.pp);
        System.out.printf("%-20s | %-10d\n", "Goles a Favor", this.gf);
        System.out.printf("%-20s | %-10d\n", "Goles en Contra", this.gc);
    }
    
    @Override
    public String toString() {
        return "Nombre del Equipo: " + this.nombreEquipo + "\t| " + "Categoria: " + this.categoria + "\t| " + "Competicion: " + this.competicion + "\t|";
    }
}