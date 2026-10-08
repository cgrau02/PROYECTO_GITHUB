import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese la nota del estudiante: ");
            double nota = leerDecimal(sc);

            if (nota >= 0 && nota <= 10) {
                if (nota >= 9) {
                    System.out.println("Excelente");
                } else if (nota >= 7) {
                    System.out.println("Bueno");
                } else if (nota >= 5) {
                    System.out.println("Regular");
                } else {
                    System.out.println("Insuficiente");
                }
            } else {
                System.out.println("Nota inválida. Debe estar entre 0 y 10.");
            }
        }
    }

    private static double leerDecimal(Scanner scanner) {
        return Double.parseDouble(scanner.next().trim().replace(',', '.'));
    }
}