package tema_03;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        float x;
        float y;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH)) {
            System.out.print("Introduzca el primer número: ");
            x = scanner.nextFloat();
            System.out.print("Introduce el segundo número: ");
            y = scanner.nextFloat();
        }
        System.out.printf("x = %.1f\n" , x);
        System.out.printf("y = %.1f\n" , y);
        System.out.printf("x + y = %.1f\n" , (x+y));
        System.out.printf("x - y = %.1f\n" , (x-y));
        System.out.printf("x / y = %.1f\n" , (x/y));
        System.out.printf("x * y = %.1f\n" , (x*y));
    }
}