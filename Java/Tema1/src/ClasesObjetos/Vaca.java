package ClasesObjetos;

public class Vaca {
    /* Atributos de la clase Vaca */
    public String colorDePelo; // Almacena el color del pelo de la vaca
    public int edad; // Almacena la edad de la vaca
    public String nombre; // Almacena el nombre de la vaca

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
            System.out.println("La vaca " + this.getNombre() + " es más vieja que la vaca " + b.getNombre() + ".");
        } else if (this.edad < b.edad) {
            System.out.println("La vaca " + b.getNombre() + " es más vieja que la vaca " + this.getNombre() + ".");
        } else if (this.edad == b.edad) {
            System.out.println("Las vacas " + this.getNombre() + " y " + b.getNombre() + " tienen la misma edad.");
        }
    }

    /* Método que imprime un mensaje con el sonido de la vaca */
    public void muu() {
        System.out.println("Muuu... mi nombre es " + this.getNombre() + " y mi color de pelo es " + this.getColorDePelo() + ".");
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
