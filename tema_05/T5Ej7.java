public class T5Ej7 {
    public static void main(String[] args) {
        float numEscrito = 0;
        float total = 0;
        float contador = 0;
        float media;
        
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar introduce un número negativo.");
        System.out.println("Vaya introduciendo números:");

        while (numEscrito >= 0){
            numEscrito = Integer.parseInt(System.console().readLine());
            
            total += numEscrito;

            contador ++;
        }

        media =(float) ((total - numEscrito) / (contador - 1));

        System.out.println("La media de los números positivos introducidos es " + media);
    }
}
