package EXAMENPAPULOPUZNO;

import java.util.Scanner;

public class ExamenDAM {
    
    public static void main(String[] args) {
        
        int colorTexto = 0;

        long digito = 0;
        long minimo= 0;
        long maximo = 0;
        long aleatorio = 0;
        long volteado = 0;

        char tipoColor = 0; 

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("GRAPHIFY");
            System.out.println("==================");

            System.out.print("Introduce el valor mínimo del rango: "); // introducimos valor minimo
            minimo = sc.nextLong();

            System.out.print("Introduce un valor máximo del rango: ");  // Introducimos el valor maximo
            maximo = sc.nextLong();

            System.out.print("Dibujo la grafica en blanco y negro o en color (B|C): "); // Preguntamos color fondo
            tipoColor = sc.next().toLowerCase().charAt(tipoColor);
        
            //Color texto
            if(tipoColor == 'b') {
                colorTexto = 0;
            } else if (tipoColor =='c') {
                colorTexto = 33;
            } 

            //Valor aleatorio
            aleatorio = (long) (Math.random()*(maximo-minimo+1)+minimo);


            // Imprimir número en columna
           System.out.println(voltear(aleatorio));
           volteado = voltear(aleatorio);

           while (volteado > 0) {
                digito = volteado % 10;
                volteado /= 10;

                
                System.out.println(digito);
           }

        
        } catch (Exception exepcion) {
            System.out.println("***ERROR*** Los datos introducidos son correctos");

        } finally {
            sc.close();
        }
    }

    public static long voltear(long aleatorio){
        long volteado = 0;
        long digito;

        while (aleatorio > 0) {
            digito = aleatorio % 10;
            volteado = (volteado * 10) + digito;
            aleatorio /= 10;
        }
        return volteado;
    }
}
