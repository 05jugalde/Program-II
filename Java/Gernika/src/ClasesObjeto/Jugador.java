package ClasesObjeto;

public class Jugador {
    // Atributos de la clase Jugador
    String nombre; // Nombre del jugador
    String equipo; // Equipo al que pertenece el jugador
    String apellido; // Apellido del jugador
    int dorsal; // Número de dorsal del jugador

    /*
     * CONSTRUCTOR DE LA CLASE JUGADOR
     * Este constructor se utiliza para crear un objeto Jugador con todos los atributos.
     * Recibe el nombre, apellido, dorsal y equipo del jugador como parámetros.
     */
    public Jugador(String nombre, String apellido, int dorsal, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dorsal = dorsal;
        this.equipo = equipo;
    }

    /*
     * CONSTRUCTOR DE LA CLASE JUGADOR (SOBRECARGADO)
     * Este constructor se utiliza para crear un objeto Jugador con solo el nombre, dorsal y equipo.
     * Recibe el nombre, dorsal y equipo del jugador como parámetros.
     * El apellido se inicializa como null o una cadena vacía.
     */
    public Jugador(String nombre, int dorsal, String equipo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.equipo = equipo;
    }

    /*
     * MÉTODO toString()
     * Este método devuelve una representación en cadena del objeto Jugador.
     * Se utiliza para imprimir la información del jugador de forma legible.
     * Devuelve una cadena con el nombre y el dorsal del jugador.
     */
    public String toString() {
        return "Nombre: " + this.nombre + "\t| " + "Dorsal: " + this.dorsal;
    }

    /*
     * MÉTODO getNombre()
     * Este método devuelve el nombre del jugador.
     * Se utiliza para acceder al atributo 'nombre' del objeto Jugador.
     */
    public String getNombre() {
        return this.nombre;
    }

    /*
     * MÉTODO getApellido()
     * Este método devuelve el apellido del jugador.
     * Se utiliza para acceder al atributo 'apellido' del objeto Jugador.
     */
    public String getApellido() {
        return this.apellido;
    }

    /*
     * MÉTODO getEquipo()
     * Este método devuelve el equipo al que pertenece el jugador.
     * Se utiliza para acceder al atributo 'equipo' del objeto Jugador.
     */
    public String getEquipo() {
        return this.equipo;
    }

    /*
     * MÉTODO getDorsal()
     * Este método devuelve el dorsal del jugador.
     * Se utiliza para acceder al atributo 'dorsal' del objeto Jugador.
     */
    public int getDorsal() {
        return this.dorsal;
    }
}