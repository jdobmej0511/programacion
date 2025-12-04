package tema_08;

import java.util.Scanner;

public class T8Ej1 {
    
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        n = sc.nextInt();

        System.out.println(esCapicua(n));
        System.out.println(esPrimo(n));
        
       
        sc.close();
    }

    public static boolean esCapicua(int numeroCapicuo) {
        int original = numeroCapicuo;
        int invertido = 0;

        while (numeroCapicuo > 0) {
            invertido = invertido * 10 + (numeroCapicuo % 10);
            numeroCapicuo /= 10;
        }
    
        return original == invertido;
    }

    public static boolean esPrimo(int numeroPrimo) {
        if (numeroPrimo <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numeroPrimo); i++) {
            if (numeroPrimo % i == 0) {
                return false;
            }
        }

        return true;
    }
}
