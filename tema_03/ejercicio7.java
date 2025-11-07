package tema_03;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        double base;
        double iva;
        double total;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduzca la base imponible (precio del articulo sin IVA): ");
            base = scanner.nextDouble();
        }

        System.out.println("Base imponible  " + base + "$");
        
        iva = base*0.21;
        System.out.println("IVA (21%)       " +  iva + "$");
        System.out.println("----------------------------------------------------------");

        total = base+iva;
        System.out.println("Total         " + total + "$");
        
    }
}
