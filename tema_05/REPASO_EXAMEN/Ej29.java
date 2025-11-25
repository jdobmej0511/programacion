package REPASO_EXAMEN;

public class Ej29 {
    
    public static void main(String[] args) {
        int num;

        System.out.print("Introduce un numero entero positivo: ");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < ; i++) {
            
        }

    }

    public static int invertir(int numero){
        int invertido = 0;
        int digito;

        while (numero > 0) {
            digito = numero % 10;

            invertido = (invertido * 10 ) + digito;

            numero /= 10;
        }
        
        return invertido;
    }

    public static int digito(int numero){
        int digito = 0;

        while (numero > 0) {
            digito = numero % 10 ;

            numero /= 10;
        }

        return digito;
    }

    public static 
}
