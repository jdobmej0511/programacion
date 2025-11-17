import java.util.InputMismatchException;
import java.util.Scanner;

public class T5Ej31 {
    public static void main(String[] args) {
        long temporal;
        long primero = 0;
        long segundo = 0;
        long numerosPares = 0;
        long numeroImpares = 0;

        int digito;
    

        Scanner sc = new Scanner(System.in);

        try{
            //leemos el primer numero
            System.out.print("Introduce el primer numero: ");
            temporal = sc.nextLong();

             //giramos el primer numero
            primero = girarNumero(temporal);

            //leemos el segundo numero
            System.out.print("Introduce el segundo numero: ");
            temporal = sc.nextLong();

            //giramos el segundo numero
            segundo = girarNumero(temporal);

            while (primero > 0) {    
                digito = (int) (primero%10);
                primero /=10;

                if (digito%2==0) {
                    numerosPares = (numerosPares*10) + digito;
                } else{
                    numeroImpares = (numeroImpares*10) + digito;
                }

                digito = (int) (segundo%10);
                segundo /=10;

                if (digito%2==0) {
                    numerosPares = (numerosPares*10) + digito;
                } else{
                    numeroImpares = (numeroImpares*10) + digito;
                }
            }


            System.out.printf("El numero formado por los digitos pares es %d\n", numerosPares);
            System.out.printf("El numero formado por los digitos impares es %d\n", numeroImpares);

        } catch(InputMismatchException ime){
            System.out.println("**ERROR: se pedia un valor de tipo largo.");
        } catch(Exception exception){
            System.out.println("**ERROR: la palicacion ha fallado.");
        } finally{
            sc.close(); //cerramos el flujo de entrada
        }

    }

    /**
     * Invierte los digitos de una cifra numerica
     * @param numero
     * @return
     */
    public static long girarNumero(long numero){  //firma de la función o cabecera de la función
        
        long volteado = 0;

        while (numero >0) {
            volteado = (volteado*10) + (numero%10);
            numero /= 10;
        }

        return volteado;
    }

}


// Solo puede aparecer un return en la función