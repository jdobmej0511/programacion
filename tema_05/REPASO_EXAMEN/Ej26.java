package REPASO_EXAMEN;

public class Ej26 {
    
    public static void main(String[] args) {
        
        int numPequeno;
        int numGrande;

        System.out.print("Introduce un numero relativamente grande: ");
        numGrande = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce un numero relativamente pequeño: ");
        numPequeno = Integer.parseInt(System.console().readLine());

        System.out.printf("Los números enteros positivos menores que %d que no son divisibles entre %d sobn los siguientes: \n", numGrande, numPequeno);


        for (int i = 0; i < numGrande; i++) {
            if (i % numPequeno != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
