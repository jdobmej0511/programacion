import java.util.Random;
import java.util.Scanner;

public class GraphifyPractica {

    // Constantes para colores ANSI
    public static final String RESET = "\033[0m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("GRAPHIFY");
            System.out.println("===================");

            try {
                System.out.print("Introduce el valor mínimo del rango: ");
                int min = sc.nextInt();
                System.out.print("Introduce el valor máximo del rango: ");
                int max = sc.nextInt();

                if (min < 0 || max < 0) {
                    System.out.println("ERROR: los valores del rango deben ser mayores o iguales a cero.");
                    return;
                }

                // Generar número aleatorio
                Random rand = new Random();
                int numero = rand.nextInt(max - min + 1) + min;

                System.out.print("Dibujo la gráfica en blanco y negro o en color (BIC) : ");
                String opcion = sc.next().toUpperCase();

                // Mostrar número generado
                System.out.println("Número generado: " + numero);

                // Convertir número a array de dígitos
                String numStr = String.valueOf(numero);
                int[] digitos = new int[numStr.length()];
                int maxDigito = 0;
                for (int i = 0; i < numStr.length(); i++) {
                    digitos[i] = Character.getNumericValue(numStr.charAt(i));
                    if (digitos[i] > maxDigito) maxDigito = digitos[i];
                }

                // Dibujar gráfico
                if (opcion.equals("C")) {
                    dibujarColor(digitos, maxDigito);
                } else {
                    dibujarBN(digitos, maxDigito);
                }

            } catch (Exception e) {
                System.out.println("ERROR: Entrada inválida.");
            }
        }
    }

    // -------------------------------
    // Gráfico en blanco y negro
    // -------------------------------
    public static void dibujarBN(int[] digitos, int maxDigito) {
        for (int d : digitos) {
            System.out.print("| " + d + " |");
            for (int i = 0; i < maxDigito; i++) {
                if (i < d) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // -------------------------------
    // Gráfico en color
    // -------------------------------
    public static void dibujarColor(int[] digitos, int maxDigito) {
        for (int d : digitos) {
            System.out.print("| " + d + " |");
            for (int i = 0; i < maxDigito; i++) {
                if (i < d) {
                    System.out.print(" " + colorDe(d) + " " + RESET);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // -------------------------------
    // Asignar color según el dígito
    // -------------------------------
    public static String colorDe(int d) {
        if (d >= 0 && d <= 4) return BLUE_BACKGROUND;
        if (d == 5 || d == 6) return RED_BACKGROUND;
        if (d == 7 || d == 8) return GREEN_BACKGROUND;
        if (d == 9) return PURPLE_BACKGROUND;
        return RESET;
    }
}
