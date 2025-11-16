public class T5Ej26 {
    public static void main(String[] args) {
        int numGrande;
        int numPequeño;

        System.out.print("Introduzca un número entero positivo (relativamente grande): ");
        numGrande = Integer.parseInt(System.console().readLine());

        System.out.println("Introduzca otro número (relativamente pequeño): ");
        numPequeño = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < numGrande; i++){
            if ( (i % numPequeño) != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
