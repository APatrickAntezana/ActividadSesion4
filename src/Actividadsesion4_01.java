import java.util.Scanner;

public class Actividadsesion4_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ingresar un número entero entre 1 y 5
        System.out.print("Ingrese un número entero (1-5): ");
        int numero = scanner.nextInt();

        // Convertir el número en palabra usando switch
        String palabra;
        switch (numero) {
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default:
                palabra = "Número no válido. Ingrese un número entre 1 y 5.";
        }

        System.out.println("Número ingresado en palabras: " + palabra);
        scanner.close();
    }
}
