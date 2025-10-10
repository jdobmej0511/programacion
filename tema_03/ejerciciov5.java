package tema_03;

import java.util.Scanner;

public class ejerciciov5 {
    public static void main(String[] args) {
        float base;
        float altura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Área del rectangulo");
        System.out.println("-----------------------------------");
        
        System.out.print("Introduzca la longitud de la base (cm): ");
        base = scanner.nextFloat();
        System.out.print("Introduce la altura (cm): ");
        altura = scanner.nextFloat();
        System.out.println("El área del rectangulo es " + (base*altura) + "cm2");
        

    }
}
