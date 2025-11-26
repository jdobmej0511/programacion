package EXAMENPAPULOPUZNO;

import java.time.LocalTime;

public class Reloj {

    public static void main(String[] args) throws Exception {

        while (true) {
            limpiarPantalla();

            LocalTime ahora = LocalTime.now();
            int hora = ahora.getHour();
            int minuto = ahora.getMinute();
            int segundo = ahora.getSecond();

            int hora1 = hora / 10;
            int hora2 = hora % 10;
            int minuto1 = minuto / 10;
            int minuto2 = minuto % 10;
            int segundo1 = segundo / 10;
            int segundo2 = segundo % 10;

            System.out.println("****************************************");
            System.out.println("******* R E L O J  D I G I T A L *******");
            System.out.println("****************************************");

            // Recorrer 7 líneas (digital display)
            for (int i = 0; i < 7; i++) {
                // Imprime cada dígito solo una línea
                imprimir(hora1, i);
                imprimir(hora2, i);

                // Dos puntos para separar (solo visibles en algunas líneas)
                if (i == 2 || i == 4) {
                    System.out.print(" :  ");
                } else {
                    System.out.print("    ");
                }

                imprimir(minuto1, i);
                imprimir(minuto2, i);

                if (i == 2 || i == 4) {
                    System.out.print(" :  ");
                } else {
                    System.out.print("    ");
                }

                imprimir(segundo1, i);
                imprimir(segundo2, i);

                System.out.println();
            }

            System.out.println("****************************************");
            Thread.sleep(1000);
        }
    }

    // Solo llama a imprimir la línea concreta del dígito
    public static void imprimir(int digito, int linea) {
        boolean superior = false, superiroDerecha = false, superiorIzquierda = false, 
                central = false, inferiorIzquierda = false, inferiorDerecha = false, inferior = false;
        
        // Configura los siete segmentos según el valor del dígito:
        switch (digito) {
            case 1:
                superiroDerecha = true;
                inferiorDerecha = true;
                break;
            case 2:
                superior = true; superiroDerecha = true; central = true; inferiorIzquierda = true; inferior = true;
                break;
            case 3:
                superior = true; superiroDerecha = true; central = true; inferiorDerecha = true; inferior = true;
                break;
            case 4:
                superiroDerecha = true; superiorIzquierda = true; central = true; inferiorDerecha = true;
                break;
            case 5:
                superior = true; superiorIzquierda = true; central = true; inferiorDerecha = true; inferior = true;
                break;
            case 6:
                superior = true; superiorIzquierda = true; central = true; inferiorIzquierda = true; inferiorDerecha = true; inferior = true;
                break;
            case 7:
                superior = true; superiroDerecha = true; inferiorDerecha = true;
                break;
            case 8:
                superior = true; superiroDerecha = true; superiorIzquierda = true; central = true; inferiorIzquierda = true; inferiorDerecha = true; inferior = true;
                break;
            case 9:
                superior = true; superiroDerecha = true; superiorIzquierda = true; central = true; inferiorDerecha = true;
                break;
            case 0:
                superior = true; superiroDerecha = true; superiorIzquierda = true; inferiorIzquierda = true; inferiorDerecha = true; inferior = true;
                break;
        }

        // Imprimir el fragmento correspondiente de la línea
        if (linea == 0) {
            System.out.print(superior ? " *** " : "     ");
        } else if (linea == 1 || linea == 2) {
            System.out.print((superiorIzquierda ? "*" : " ") + "   " + (superiroDerecha ? "*" : " "));
        } else if (linea == 3) {
            System.out.print(central ? " *** " : "     ");
        } else if (linea == 4 || linea == 5) {
            System.out.print((inferiorIzquierda ? "*" : " ") + "   " + (inferiorDerecha ? "*" : " "));
        } else if (linea == 6) {
            System.out.print(inferior ? " *** " : "     ");
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


