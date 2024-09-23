import java.util.Scanner;

public class Actividadsesion4_03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Ingresar un número entero entre 1 y 6
        System.out.print("Ingrese un número entero (1-6): ");
        int numero = scanner.nextInt();

        // Convertir el número a inglés usando switch
        String ingles;
        switch (numero) {
            case 1:
                ingles = "one";
                break;
            case 2:
                ingles = "two";
                break;
            case 3:
                ingles = "three";
                break;
            case 4:
                ingles = "four";
                break;
            case 5:
                ingles = "five";
                break;
            case 6:
                ingles = "six";
                break;
            default:
                ingles = "Número no válido. Ingrese un número entre 1 y 6.";
        }

        // Mostrar el resultado
        System.out.println("Número en inglés: " + ingles);

        // Cerrar el Scanner
        scanner.close();
    }
}
