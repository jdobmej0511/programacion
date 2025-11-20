package PRACTICA;


public class T5Ej2practica {
    public static void main(String[] args) {
         int numero;
         int suma = 0;

         System.out.print("Introduce números  y pulse ENTER. Para acabar, introduce un número negativo");
         numero = Integer.parseInt(System.console().readLine());

        do {
            System.out.print("?");
            if (numero >= 0) {
                suma += numero;
            }
        } while (suma >= 0);
    }
}
