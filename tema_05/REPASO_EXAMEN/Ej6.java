package REPASO_EXAMEN;

public class Ej6 {
    
    public static void main(String[] args) {
        
        int num = 0;
        int temporal;
        int digitos = 0;

        System.out.print("Introduzca un numero: ");
        num = Integer.parseInt(System.console().readLine());
        temporal = num;

        if (num == 0) {
            digitos = 1;

        } else {
            while (num > 0) {
                num = num / 10;

                digitos++;
            }
        }

        System.out.printf("El %d tiene %d digitos", temporal, digitos);
    }
}
