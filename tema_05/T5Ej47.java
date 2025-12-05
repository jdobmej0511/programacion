import java.util.Scanner;

public class T5Ej47 {

    public static void main(String[] args) {


        /* Enteros */
        int numero = 0;
        int altura = 0;
        int distancia = 0;


        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();

            System.out.print("Introduce la altura (5 como mínimo): ");
            altura = sc.nextInt();

            System.out.print("Inroduce el número de espacios (1 como mínimo): ");
            distancia = sc.nextInt();

            if(altura < 5 || distancia < 1){
                System.out.println("El valor de altura debe ser mayor o igual que 5 y el número de espacios debe ser mayor o igual que 1.");
            } else{

                

            }

        } catch (Exception exepcion) {
            System.out.println("***ERROR*** Los datos introducidos no son correctos");
        } finally{
            sc.close();
        }
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static int girarNumero(int numero){
        int digito = 0;
        int volteado = 0;

        while (numero > 0) {
            digito = numero %10;
            volteado = (volteado *10) + digito;
            numero /= 10;
        }

        return volteado;
    }

    /**
     * 
     * @param numVolteado
     * @return
     */
    public static int leerDigito(int numVolteado){
        int digito = 0;

        digito = numVolteado %10;

        numVolteado /= 10;
        
        return digito; 
    }

    public static void pintarNumeros(int numero, int altura, int distancia){
        /* Constantes */
        final String LINEA = "****";
        final String LADO = "*";
        final String ESPACIOS = "   ";
                
        /* Boolean */
        boolean linea_sup = false;
        boolean linea_sup_der = false;
        boolean linea_sup_izq = false;
        boolean linea_medio = false;
        boolean linea_inf_der = false;
        boolean linea_inf_izq = false;
        boolean linea_inf = false;

        System.out.println(girarNumero(numero));

        System.out.println(leerDigito(girarNumero(numero)));

            /* Cambiamos el valor del booleano opara saber que lineas pintar */
        switch (leerDigito(girarNumero(numero))) {
            case 1:
                linea_sup_der = true;
                linea_inf_der = true;
                break;

            case 2:
                linea_sup = true;
                linea_sup_der = true;
                linea_medio = true;
                linea_inf_izq = true;
                linea_inf = true;
                break;
        
                case 3:
                linea_sup = true;
                linea_sup_der = true;
                linea_medio = true;
                linea_inf_der = true;
                linea_inf = true;
                break;

            case 4:
                linea_sup_izq = true;
                linea_sup_der = true;
                linea_medio = true;
                linea_inf_der = true;
                break;

            case 5:
                linea_sup = true;
                linea_sup_izq = true;
                linea_medio = true;
                linea_inf_der = true;
                linea_inf = true;
                break;

            case 6:
                linea_sup = true;
                linea_sup_izq = true;
                linea_medio = true;
                linea_inf_izq = true;
                linea_inf_der = true;
                linea_inf = true;
                break;  
                
            case 7:
                linea_sup = true;
                linea_sup_der = true;
                linea_inf_der = true;
                break;

            case 8:
                linea_sup = true;
                linea_sup_izq = true;
                linea_sup_der = true;
                linea_medio = true;
                linea_inf_izq = true;
                linea_inf_der = true;
                linea_inf = true;
                break;

            case 9:
                linea_sup = true;
                linea_sup_izq = true;
                linea_sup_der = true;
                linea_medio = true;
                linea_inf_der= true;
                break;

            case 0:
                linea_sup = true;
                linea_sup_izq = true;
                linea_sup_der = true;
                linea_inf_izq = true;
                linea_inf_der = true;
                linea_inf = true;
                break;
                
            default:
                System.out.println("Los numeor introducidos no son correfctos.");
                break;
        }

        for (int fila = 0; fila < 5; fila++) {
            if (fila == 0) {
                System.out.print(linea_sup ? LINEA : ESPACIOS);

            } else if (fila == 1) {
                System.out.print((linea_sup_izq ? LADO : " ") + "   "+ (linea_sup_der ? LADO : " "));

            } else if (fila == 2) {
                System.out.print(linea_medio ? LINEA : ESPACIOS);

            } else if (fila == 3) {
                for (int saltos = 0; saltos < distancia; saltos++) {
                    System.out.print((linea_inf_izq ? LADO : " ") + "   " + (linea_inf_der ? LADO : " "));
                }

            } else if (fila == 4) {
                System.out.print(linea_inf ? LINEA : "     ");
            }
        }
        
    }
}
