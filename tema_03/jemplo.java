package tema_03;

import java.util.Scanner;

public class jemplo {
    public static void main(String[] args) {
        int num1;
        int num2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Este programa multiplica 2 números enteros");
            System.out.print("Por favor, introduce el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Por, favor introduce el segundo número: ");
            num2 = scanner.nextInt();
        }

        //System.out.println("" + num1 + " " + "*"  + " " + num2 + " " + "= " + (num1*num2) );
        System.out.printf("%d * %d = %d\n", num1 , num2 , num1*num2);
    }
}
