package tema_08;

import java.util.Scanner;

public class T8Ej0 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int valor = leervalor();
        
        System.out.println("Has introducido: " + valor);
    }

    public static int leervalor() {

        int numero;
        boolean ok = false;

        do {
            System.out.print("Introduzca un valor mayor que 2: ");
            numero = sc.nextInt();
            ok = (numero > 2);

            if (!ok) {
                System.out.println("Lo siento, el valor mínimo es 2");
            }

        } while (!ok);

        return numero;
    }
}
