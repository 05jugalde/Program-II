import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        menu();
    }

    // Función que muestra un menú de opciones al usuario
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean condicion = true;  // Variable para controlar el bucle del menú
        while (condicion) {  // Bucle que se repite mientras 'condicion' sea true
            clearScreen();  // Limpia la pantalla
            System.out.println("1.- Calcular la resistencia");  // Opción 1 del menú
            System.out.println("2.- Calcular voltaje");  // Opción 2 del menú
            System.out.println("3.- Calcular intensidad");  // Opción 3 del menú
            System.out.println("4.- Salir");  // Opción 4 del menú para salir
            System.out.println();
            System.out.print("Que desea hacer: ");
            int opcion = scanner.nextInt();  // Pide al usuario que elija una opción
            System.out.println();
            switch (opcion) {
                case 1:  // Si elige la opción 1
                    clearScreen();  // Limpia la pantalla
                    calcularResistencia(scanner);  // Llama a la función para calcular la resistencia
                    break;
                case 2:  // Si elige la opción 2
                    clearScreen();  // Limpia la pantalla
                    calcularVoltaje(scanner);  // Llama a la función para calcular el voltaje
                    break;
                case 3:  // Si elige la opción 3
                    clearScreen();  // Limpia la pantalla
                    calcularIntensidad(scanner);  // Llama a la función para calcular la intensidad
                    break;
                case 4:  // Si elige la opción 4
                    clearScreen();  // Limpia la pantalla
                    condicion = false;  // Cambia 'condicion' a false para salir del bucle
                    break;
                default:  // Si elige una opción no válida
                    clearScreen();  // Limpia la pantalla
                    System.out.println("Opcion no valida");  // Muestra un mensaje de error
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();  // Espera a que el usuario presione Enter
                    scanner.nextLine();  // Espera a que el usuario presione Enter
                    break;
            }
        }
        scanner.close();
    }

    // Función para calcular la resistencia
    public static void calcularResistencia(Scanner scanner) {
        System.out.print("Ingresa el valor del voltaje: ");
        double voltage = scanner.nextDouble();  // Pide el valor del voltaje
        System.out.print("Ingresa el valor de la intensidad: ");
        double intensidad = scanner.nextDouble();  // Pide el valor de la intensidad
        double resistencia = voltage / intensidad;  // Calcula la resistencia usando la fórmula R = V / I
        System.out.println();
        System.out.println("El valor de la resistencia es: " + resistencia);  // Muestra el valor de la resistencia
        System.out.println("Presione enter para continuar");
        scanner.nextLine();  // Espera a que el usuario presione Enter
        scanner.nextLine();  // Espera a que el usuario presione Enter
    }

    // Función para calcular el voltaje
    public static void calcularVoltaje(Scanner scanner) {
        System.out.print("Ingresa el valor de la resistencia: ");
        double resistencia = scanner.nextDouble();  // Pide el valor de la resistencia
        System.out.print("Ingresa el valor de la intensidad: ");
        double intensidad = scanner.nextDouble();  // Pide el valor de la intensidad
        double voltage = resistencia * intensidad;  // Calcula el voltaje usando la fórmula V = R * I
        System.out.println();
        System.out.println("El valor del voltaje es: " + voltage);  // Muestra el valor del voltaje
        System.out.println("Presione enter para continuar");
        scanner.nextLine();  // Espera a que el usuario presione Enter
        scanner.nextLine();  // Espera a que el usuario presione Enter
    }

    // Función para calcular la intensidad
    public static void calcularIntensidad(Scanner scanner) {
        System.out.print("Ingresa el valor del voltaje: ");
        double voltage = scanner.nextDouble();  // Pide el valor del voltaje
        System.out.print("Ingresa el valor de la resistencia: ");
        double resistencia = scanner.nextDouble();  // Pide el valor de la resistencia
        double intensidad = voltage / resistencia;  // Calcula la intensidad usando la fórmula I = V / R
        System.out.println();
        System.out.println("El valor de la intensidad es: " + intensidad);  // Muestra el valor de la intensidad
        System.out.println("Presione enter para continuar");
        scanner.nextLine();  // Espera a que el usuario presione Enter
        scanner.nextLine();  // Espera a que el usuario presione Enter
    }

    // Función para limpiar la pantalla (simulación para Eclipse)
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
