package ClasesObjetos;

public class Cancion {
    private String nombre;
    private String cantante;
    private double duracion; // Duración de la canción en segundos
    private boolean estado; // Estado de la canción (por ejemplo, disponible o no)
    private double puntoDeRepro; // Punto de reproducción actual en segundos
    private boolean reproduciendo = false; // Indica si la canción se está reproduciendo

    /**
     * Constructor que inicializa la canción con nombre y cantante.
     * @param nombre Nombre de la canción.
     * @param cantante Cantante de la canción.
     */
    public Cancion(String nombre, String cantante) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.puntoDeRepro = 0;
        this.estado = false;
        this.duracion = 3.50;
    }

    /**
     * Constructor que inicializa la canción con nombre, cantante, duración y punto de reproducción.
     * @param nombre Nombre de la canción.
     * @param cantante Cantante de la canción.
     * @param duracion Duración de la canción en segundos.
     * @param puntoDeRepro Punto de reproducción inicial en segundos.
     */
    public Cancion(String nombre, String cantante, int duracion, double puntoDeRepro) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.duracion = (double) duracion;
        this.estado = false;
        this.puntoDeRepro = puntoDeRepro;
    }

    /**
     * Constructor que inicializa la canción con todos los atributos.
     * @param nombre Nombre de la canción.
     * @param cantante Cantante de la canción.
     * @param duracion Duración de la canción en segundos.
     * @param estado Estado de la canción.
     * @param puntoDeRepro Punto de reproducción inicial en segundos.
     */
    public Cancion(String nombre, String cantante, int duracion, boolean estado, double puntoDeRepro) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.duracion = (double) duracion;
        this.estado = estado;
        this.puntoDeRepro = puntoDeRepro;
    }

    /**
     * Método para obtener una representación en cadena de la canción.
     * @return Cadena que representa la canción.
     */
    public String toString() {
        return "Cancion: " + this.nombre + "\t| " + "Cantante: " + this.cantante + "\t| " + "Duracion: " + this.duracion + "\t| " + "Estado: " + this.estado + "\t| " + "Punto de Reproduccion: " + this.puntoDeRepro;
    }

    /**
     * Método para obtener el nombre de la canción.
     * @return Nombre de la canción.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para obtener el cantante de la canción.
     * @return Cantante de la canción.
     */
    public String getCantante() {
        return this.cantante;
    }

    /**
     * Método para obtener la duración de la canción.
     * @return Duración de la canción en segundos.
     */
    public double getDuracion() {
        return this.duracion;
    }

    /**
     * Método para obtener el estado de la canción.
     * @return Estado de la canción.
     */
    public boolean getEstado() {
        return this.estado;
    }

    /**
     * Método para obtener el punto de reproducción actual.
     * @return Punto de reproducción actual en segundos.
     */
    public double getPuntoDeRepro() {
        return this.puntoDeRepro;
    }

    /**
     * Método para establecer el nombre de la canción.
     * @param nombre Nuevo nombre de la canción.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para establecer el cantante de la canción.
     * @param cantante Nuevo cantante de la canción.
     */
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    /**
     * Método para establecer la duración de la canción.
     * @param duracion Nueva duración de la canción en segundos.
     */
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    /**
     * Método para establecer el estado de la canción.
     * @param estado Nuevo estado de la canción.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Método para establecer el punto de reproducción actual.
     * @param puntoDeRepro Nuevo punto de reproducción en segundos.
     */
    public void setPuntoDeRepro(double puntoDeRepro) {
        this.puntoDeRepro = puntoDeRepro;
    }

    /**
     * Método privado para simular la reproducción de la canción.
     */
    private void lineaDeTiempo() {
        while (this.puntoDeRepro < this.duracion && this.reproduciendo) {
            this.puntoDeRepro += 0.01;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.puntoDeRepro >= this.duracion) {
            this.reproduciendo = false;
        }
    }

    /**
     * Método para iniciar la reproducción de la canción.
     */
    public void reproduce() {
        if (!this.reproduciendo) {
            this.reproduciendo = true;
            lineaDeTiempo();
        }
    }

    /**
     * Método para detener la reproducción de la canción.
     */
    public void para() {
        this.reproduciendo = false;
    }

    /**
     * Método para reiniciar la reproducción de la canción.
     */
    public void reinicia() {
        this.puntoDeRepro = 0;
    }

    /**
     * Método para avanzar la reproducción de la canción en una cantidad de segundos.
     * @param num Cantidad de segundos a avanzar.
     */
    public void avanza(double num) {
        double nuevoPunto = this.puntoDeRepro + num;
        if (this.reproduciendo == true) {
            if (nuevoPunto < 0) {
                this.puntoDeRepro = 0;
            } else if (nuevoPunto < this.duracion) {
                this.puntoDeRepro = nuevoPunto;
            } else {
                this.puntoDeRepro = this.duracion;
                para();
            }
        }
    }

    /**
     * Método para comprobar si la canción ha finalizado.
     * @return true si la canción ha finalizado, false en caso contrario.
     */
    public boolean compruebaFinal() {
        if (this.reproduciendo == true) {
            if (this.puntoDeRepro >= this.duracion) {
                this.puntoDeRepro = this.duracion;
                para();
                return true;
            }
        }
        return false;
    }
    
    public void visualizarCancion() {

        // Calcular el ancho máximo de cada columna
        int maxNombre = 6;
        int maxCantante = 8;
        int maxDuracion = 8;
        int maxEstado = 6;
        int maxPuntoRepro = 19;

        maxNombre = Math.max(maxNombre, this.nombre.length());
        maxCantante = Math.max(maxCantante, this.cantante.length());

        // Imprimir encabezado
        System.out.printf("%-" + maxNombre + "s | %-" + maxCantante + "s | %-" + maxDuracion + "s | %-" + maxEstado + "s | %-" + maxPuntoRepro + "s%n",
                "Nombre", "Cantante", "Duracion", "Estado", "Punto Reproduccion");

        // Imprimir canción
        System.out.printf("%-" + maxNombre + "s | %-" + maxCantante + "s | %-" + maxDuracion + ".2f | %-" + maxEstado + "b | %-" + maxPuntoRepro + ".2f%n",
                this.nombre, this.cantante, this.duracion, this.estado, this.puntoDeRepro);
    }
}