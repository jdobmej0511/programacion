package tema_03;

public class ejercicio2 {
    public static void main(String[] args) {
        float euros; 
        int pesetas; 

        System.out.print("Introduzca la cantidad de euros que quiera convertir: ");
        euros = Float.parseFloat(System.console().readLine());
        
        pesetas = (int)(euros * 166.33);

        System.out.printf("%.2f euros son %d pesetas \n", euros, pesetas);
    }
}
