package tema_08;

import java.util.Scanner;

public class T8Ej1 {
    
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce un número: ");
        n = sc.nextInt();

       if (esCapicua(n) == true) {
            System.out.println("Es capicua");
       } else{
            System.out.println("No es capicua");
       }
    }

    public static boolean esCapicua(int numeroCapicuo) {
        int original = 0;
        int invertido = 0;

        original = numeroCapicuo;

        while (numeroCapicuo > 0) {
            invertido = invertido * 10 + (numeroCapicuo % 10);
            numeroCapicuo /= 10;
        }
    
        return original == invertido;
    }

    public static boolean esPrimo(int numeroPrimo) {
        int contador;

        while (numeroPrimo && (contador != numeroPrimo)) {
            
        }

        return (numeroPrimo %2 != 0);
    }
    
}
