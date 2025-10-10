package tema_03;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        x = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        y = scanner.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x / y = " + (x/y));
        System.out.println("x * y = " + (x*y));
    }
}
