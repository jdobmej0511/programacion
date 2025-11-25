package REPASO_EXAMEN;

public class Ej7 {
    
    public static void main(String[] args) {
        
        int num;
        int total = 0;
        int recuento = 0;
        float media;


        System.out.println("Vaya introduciendo números");
        
        do {
            num = Integer.parseInt(System.console().readLine());

            if (num > 0) {
                total = total + num;

                recuento ++;
            }

        } while (num >= 0);

        media = (float)total / recuento;

        System.out.printf("La media es %f", media);
    }
}
