package REPASO_EXAMEN;

public class Ej20 {
    
    public static void main(String[] args) {

        int num = 0;
        int suma = 0;
        int contador = 0;
        float media = 0;

        System.out.println("Vaya introduciendo numeros hasta que la suma sume 1000: ");

        while (suma <= 10000) {
            num = Integer.parseInt(System.console().readLine());
            
            suma  = suma + num;

            contador++;
        }

        media =(float) suma / contador;

        System.out.printf("Has introducido %d numeros.\n", contador);
        System.out.printf("La suma total ha sido %d\n", suma);
        System.out.printf("La media es %f\n", media);
    }
}
