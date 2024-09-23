import java.util.Scanner;

public class Actividadsesion4_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ingresar un número entero que represente un periodo (1, 2, 3, 4, 6, 12)
        System.out.print("Ingrese un número entero (1, 2, 3, 4, 6, 12): ");
        int numero = scanner.nextInt();

        // Asignar el nombre del periodo correspondiente
        String periodo;
        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                periodo = "Número no válido. Ingrese uno de los siguientes valores: 1, 2, 3, 4, 6, 12.";
        }

        // Mostrar el resultado
        System.out.println("Periodo: " + periodo);

        scanner.close();
    }
}
