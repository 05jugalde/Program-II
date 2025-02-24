package ClasesObjetos;

public class Vaca {
    /* Atributos de la clase Vaca */
    String colorDePelo; // Almacena el color del pelo de la vaca
    int edad; // Almacena la edad de la vaca
    String nombre; // Almacena el nombre de la vaca

    /* Constructores */
    public Vaca(String nombre, int edad, String colorDePelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorDePelo = colorDePelo;
    }

    public Vaca() {
        // Constructor por defecto - no inicializa ningún atributo
    }

    public Vaca(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorDePelo = "No definido"; // Establece el color de pelo como "No definido"
    }

    /* Métodos Consultores (Getters) */
    public String getColorDePelo() {
        return colorDePelo; // Devuelve el color del pelo de la vaca
    }

    public String getNombre() {
        return nombre; // Devuelve el nombre de la vaca
    }

    public int getEdad() {
        return edad; // Devuelve la edad de la vaca
    }

    /* Método para comparar la edad de dos vacas */
    public void compare(Vaca b) {
        if (this.edad > b.edad) {
            System.out.println("La vaca " + this.nombre + " es más vieja que la vaca " + b.nombre + ".");
        } else if (this.edad < b.edad) {
            System.out.println("La vaca " + b.nombre + " es más vieja que la vaca " + this.nombre + ".");
        } else if (this.edad == b.edad) {
            System.out.println("Las vacas " + this.nombre + " y " + b.nombre + " tienen la misma edad.");
        }
    }

    /* Método que imprime un mensaje con el sonido de la vaca */
    public void muu() {
        System.out.println("Muuu... mi nombre es " + this.nombre + " y mi color de pelo es " + this.colorDePelo + ".");
    }

    /* Métodos Modificadores (Setters) */
    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo; // Establece el color del pelo de la vaca
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nombre de la vaca
    }

    public void setEdad(int edad) {
        this.edad = edad; // Establece la edad de la vaca
    }
}
