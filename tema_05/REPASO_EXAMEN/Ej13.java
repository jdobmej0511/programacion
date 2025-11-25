package REPASO_EXAMEN;

import java.util.Scanner;

public class Ej13 {
    
    public static void main(String[] args) {
        
        int num;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Introduce un número entero: ");
            num = sc.nextInt();

            if (esPrimo(num) == true) {
                System.out.println("El número es primo");
            
            } else{
                System.out.println("El numero no es primo");
            }

        } catch (Exception excepcion) {
            System.out.println("***ERROR*** Datos introducidos incorrectamente.");
        } 
            
    

    }

    public static boolean esPrimo (int num) {
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }

        return primo;
    }
}
