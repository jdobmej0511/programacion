package tema_03;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        float base;
        float altura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Área de un triángulo");
        System.out.println("-------------------------------------");
        
        System.out.print("Introduzca la longitud de la base (cm): ");
        base = scanner.nextFloat();
        System.out.print("Introduce la altura (cm): ");
        altura = scanner.nextFloat();
        System.out.println("El área del triángilo es " + ((base*altura)/2) + "cm2");
        
    }
}
