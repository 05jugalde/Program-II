package ClasesObjeto;

/**
 * @author [Jon Ugalde]
 * @version 1.0
 * @since [27/02/2025]
 * @description Esta clase representa un jugador de fútbol.
 */

public class Jugador {
	
    // Atributos de la clase Jugador:
    private String nombre; // Nombre del jugador
    private String apellido; // Apellido del jugador
    private String equipo; // Equipo al que pertenece el jugador
    private int dorsal; // Número de dorsal del jugador
    private int pConvocado; // Partidos en los que el jugador ha sido convocado
    private int pTitular; // Partidos en los que el jugador ha sido titular
    private int pSuplente; // Partidos en los que el jugador ha sido suplente
    private int pJugados; // Partidos jugados por el jugador
    private int totalGoles; // Total de goles marcados por el jugador
    private double mediaGoles; // Media de goles por partido del jugador
    private int amarillas; // Número de tarjetas amarillas recibidas por el jugador
    private int rojas; // Número de tarjetas rojas recibidas por el jugador
    private int dobleAmarilla; // Número de doble amarillas recibidas por el jugador

    // Constructores:
    /**
     * CONSTRUCTOR DE LA CLASE JUGADOR
     * Este constructor se utiliza para crear un objeto Jugador con todos los atributos.
     * Recibe el nombre, apellido, dorsal y equipo del jugador como parámetros.
     *
     * @param nombre Nombre del jugador.
     * @param apellido Apellido del jugador.
     * @param dorsal Número de dorsal del jugador.
     * @param equipo Equipo al que pertenece el jugador.
     */
    public Jugador(String nombre, String apellido, int dorsal, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dorsal = dorsal;
        this.equipo = equipo;
    }

    /**
     * CONSTRUCTOR DE LA CLASE JUGADOR (SOBRECARGADO)
     * Este constructor se utiliza para crear un objeto Jugador con solo el nombre, dorsal y equipo.
     * Recibe el nombre, dorsal y equipo del jugador como parámetros.
     * El apellido se inicializa como una cadena vacía.
     *
     * @param nombre Nombre del jugador.
     * @param dorsal Número de dorsal del jugador.
     * @param equipo Equipo al que pertenece el jugador.
     */
    public Jugador(String nombre, int dorsal, String equipo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.equipo = equipo;
        this.apellido = ""; // Inicializamos el apellido como cadena vacía
    }

    /**
     * MÉTODO toString()
     * Este método devuelve una representación en cadena del objeto Jugador.
     * Se utiliza para imprimir la información del jugador de forma legible.
     * Devuelve una cadena con el nombre y el dorsal del jugador.
     *
     * @return Cadena con el nombre y el dorsal del jugador.
     */
    public String toString() {
        return "Nombre: " + this.nombre + "\t| " + "Dorsal: " + this.dorsal;
    }

    // Métodos de acceso (Getters):
    /**
     * MÉTODO getNombre()
     * Este método devuelve el nombre del jugador.
     * Se utiliza para acceder al atributo 'nombre' del objeto Jugador.
     *
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * MÉTODO getApellido()
     * Este método devuelve el apellido del jugador.
     * Se utiliza para acceder al atributo 'apellido' del objeto Jugador.
     *
     * @return El apellido del jugador.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * MÉTODO getEquipo()
     * Este método devuelve el equipo al que pertenece el jugador.
     * Se utiliza para acceder al atributo 'equipo' del objeto Jugador.
     *
     * @return El equipo al que pertenece el jugador.
     */
    public String getEquipo() {
        return this.equipo;
    }

    /**
     * MÉTODO getDorsal()
     * Este método devuelve el dorsal del jugador.
     * Se utiliza para acceder al atributo 'dorsal' del objeto Jugador.
     *
     * @return El dorsal del jugador.
     */
    public int getDorsal() {
        return this.dorsal;
    }

    /**
     * MÉTODO getJugados()
     * Este método devuelve los partidos jugados por el jugador.
     * Se utiliza para acceder al atributo 'pJugados' del objeto Jugador.
     *
     * @return Los partidos jugados por el jugador.
     */
    public int getJugados() {
        return this.pJugados;
    }

    /**
     * MÉTODO getSuplente()
     * Este método devuelve los partidos en los que el jugador ha sido suplente.
     * Se utiliza para acceder al atributo 'pSuplente' del objeto Jugador.
     *
     * @return Los partidos en los que el jugador ha sido suplente.
     */
    public int getSuplente() {
        return this.pSuplente;
    }

    /**
     * MÉTODO getConvocado()
     * Este método devuelve los partidos en los que el jugador ha sido convocado.
     * Se utiliza para acceder al atributo 'pConvocado' del objeto Jugador.
     *
     * @return Los partidos en los que el jugador ha sido convocado.
     */
    public int getConvocado() {
        return this.pConvocado;
    }

    /**
     * MÉTODO getTitular()
     * Este método devuelve los partidos en los que el jugador ha sido titular.
     * Se utiliza para acceder al atributo 'pTitular' del objeto Jugador.
     *
     * @return Los partidos en los que el jugador ha sido titular.
     */
    public int getTitular() {
        return this.pTitular;
    }

    /**
     * MÉTODO getTotalGoles()
     * Este método devuelve el total de goles marcados por el jugador.
     * Se utiliza para acceder al atributo 'totalGoles' del objeto Jugador.
     *
     * @return El total de goles marcados por el jugador.
     */
    public int getTotalGoles() {
        return this.totalGoles;
    }

    /**
     * MÉTODO getMediaGoles()
     * Este método devuelve la media de goles por partido del jugador.
     * Se utiliza para acceder al atributo 'mediaGoles' del objeto Jugador.
     *
     * @return La media de goles por partido del jugador.
     */
    public double getMediaGoles() {
        return this.mediaGoles;
    }

    /**
     * MÉTODO getAmarillas()
     * Este método devuelve el número de tarjetas amarillas recibidas por el jugador.
     * Se utiliza para acceder al atributo 'amarillas' del objeto Jugador.
     *
     * @return El número de tarjetas amarillas recibidas por el jugador.
     */
    public int getAmarillas() {
        return this.amarillas;
    }

    /**
     * MÉTODO getRojas()
     * Este método devuelve el número de tarjetas rojas recibidas por el jugador.
     * Se utiliza para acceder al atributo 'rojas' del objeto Jugador.
     *
     * @return El número de tarjetas rojas recibidas por el jugador.
     */
    public int getRojas() {
        return this.rojas;
    }

    /**
     * MÉTODO getDobleAmarilla()
     * Este método devuelve el número de doble amarillas recibidas por el jugador.
     * Se utiliza para acceder al atributo 'dobleAmarilla' del objeto Jugador.
     *
     * @return El número de doble amarillas recibidas por el jugador.
     */
    public int getDobleAmarilla() {
        return this.dobleAmarilla;
    }

    // Métodos de modificación (Setters):
    /**
     * MÉTODO setJugados()
     * Este método establece los partidos jugados por el jugador.
     * Se utiliza para modificar el atributo 'pJugados' del objeto Jugador.
     *
     * @param pJugados Los partidos jugados por el jugador.
     */
    public void setJugados(int pJugados) {
        this.pJugados = pJugados;
    }

    /**
     * MÉTODO setSuplente()
     * Este método establece los partidos en los que el jugador ha sido suplente.
     * Se utiliza para modificar el atributo 'pSuplente' del objeto Jugador.
     *
     * @param pSuplente Los partidos en los que el jugador ha sidosuplente.
     */
    public void setSuplente(int pSuplente) {
        this.pSuplente = pSuplente;
    }

    /**
     * MÉTODO setConvocado()
     * Este método establece los partidos en los que el jugador ha sido convocado.
     * Se utiliza para modificar el atributo 'pConvocado' del objeto Jugador.
     *
     * @param pConvocado Los partidos en los que el jugador ha sido convocado.
     */
    public void setConvocado(int pConvocado) {
        this.pConvocado = pConvocado;
    }

    /**
     * MÉTODO setTitular()
     * Este método establece los partidos en los que el jugador ha sido titular.
     * Se utiliza para modificar el atributo 'pTitular' del objeto Jugador.
     *
     * @param pTitular Los partidos en los que el jugador ha sido titular.
     */
    public void setTitular(int pTitular) {
        this.pTitular = pTitular;
    }

    /**
     * MÉTODO setTotalGoles()
     * Este método establece el total de goles marcados por el jugador.
     * Se utiliza para modificar el atributo 'totalGoles' del objeto Jugador.
     *
     * @param totalGoles El total de goles marcados por el jugador.
     */
    public void setTotalGoles(int totalGoles) {
        this.totalGoles = totalGoles;
    }

    /**
     * MÉTODO setMediaGoles()
     * Este método establece la media de goles por partido del jugador.
     * Se utiliza para modificar el atributo 'mediaGoles' del objeto Jugador.
     *
     * @param mediaGoles La media de goles por partido del jugador.
     */
    public void setMediaGoles(double mediaGoles) {
        this.mediaGoles = mediaGoles;
    }
    
    /**
     * MÉTODO setAmarillas()
     * Este método establece el número de tarjetas amarillas recibidas por el jugador.
     * Se utiliza para modificar el atributo 'amarillas' del objeto Jugador.
     *
     * @param amarillas El número de tarjetas amarillas recibidas por el jugador.
     */
    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    /**
     * MÉTODO setRojas()
     * Este método establece el número de tarjetas rojas recibidas por el jugador.
     * Se utiliza para modificar el atributo 'rojas' del objeto Jugador.
     *
     * @param rojas El número de tarjetas rojas recibidas por el jugador.
     */
    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    /**
     * MÉTODO setDobleAmarilla()
     * Este método establece el número de doble amarillas recibidas por el jugador.
     * Se utiliza para modificar el atributo 'dobleAmarilla' del objeto Jugador.
     *
     * @param dobleAmarilla El número de doble amarillas recibidas por el jugador.
     */
    public void setDobleAmarilla(int dobleAmarilla) {
        this.dobleAmarilla = dobleAmarilla;
    }

    // Métodos de información:

    /**
     * MÉTODO visualizarEstadisticasJugador()
     * Este método imprime las estadísticas del jugador en la consola.
     * Muestra información como equipo, partidos jugados, goles, tarjetas, etc.
     */
    public void visualizarEstadisticasJugador() {
        System.out.println("Estadísticas de " + this.nombre + " " + this.apellido + ":\n");
        System.out.printf("%-20s | %-10s\n", "Equipo", this.equipo);
        System.out.printf("%-20s | %-10s\n", "Partidos Convocado", this.pConvocado);
        System.out.printf("%-20s | %-10d\n", "Partidos Jugados", this.pJugados);
        System.out.printf("%-20s | %-10d\n", "Partidos Titular", this.pTitular);
        System.out.printf("%-20s | %-10d\n", "Partidos Suplente", this.pSuplente);
        System.out.printf("%-20s | %-10d\n", "Goles Totales", this.totalGoles);
        System.out.printf("%-20s | %-10.1f\n", "Media de Goles", this.mediaGoles);
        System.out.printf("%-20s | %-10d\n", "Amarillas", this.amarillas);
        System.out.printf("%-20s | %-10d\n", "Rojas", this.rojas);
        System.out.printf("%-20s | %-10d\n", "Doble Amarilla", this.dobleAmarilla);
    }
}