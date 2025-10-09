package tema_03;

public class ejercicio2 {
    public static void main(String[] args) {
        double euros; 
        double pesetas; 

        System.out.print("Introduzca la cantidad de euros que quiera convertir: ");
        euros = Double.parseDouble(System.console().readLine());
        
        pesetas = euros * 166.33;

        System.out.printf("%.2f euros son %.2f pesetas.%n", euros, pesetas);
    }
}
