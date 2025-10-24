package tema_03;

public class ejercicio3 {
    public static void main(String[] args) {
        float euros; 
        int pesetas; 

        System.out.print("Introduzca la cantidad de pesetas que quiera convertir: ");
        pesetas = Integer.parseInt(System.console().readLine());
        
        euros = pesetas / 166.33f;

        System.out.printf("%d pesetas son %.2f pesetas.\n", pesetas, euros);
    }
}
