package EXAMENPAPULOPUZNO;


import java.time.LocalTime;

public class Reloj {
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void pintaLineaDigito(int digito, int i) {
        boolean superior = true; // Barra superior
        boolean superiorDerecha = true; // Barra superior derecha
        boolean superiorIzquierda = true; // Barra superior derecha
        boolean central = true; // Barra central
        boolean inferiorIzquierda = true; // Barra inferior izquierda
        boolean inferiorDerecha = true; // Barra inferior derecha
        boolean inferior = true; // Barra inferior
        
        switch (digito) {
            case 1:
                superior = false;
                superiorIzquierda = false;
                central = false;
                inferior = false;
                inferiorIzquierda = false;
                break;
            case 2:
                superiorIzquierda = false;
                inferiorDerecha = false;
                break;
            case 3:
                superiorIzquierda = false;
                inferiorIzquierda = false;
                break;
            case 4:
                superior = false;
                inferiorIzquierda = false;
                inferior = false;
                break;
            case 5:
                superiorDerecha = false;
                inferiorIzquierda = false;
                break;
            case 6:
                superiorDerecha = false;
                break;
            case 7:
                superiorIzquierda = false;
                central = false;
                inferior = false;
                inferiorIzquierda = false;
                break;
            case 8:
                break;
            case 9:
                inferiorIzquierda = false;
                inferior = false;
                break;
            case 0:
                central = false;
                break;
            default:
                break;
        }
        System.out.print((i == 0 && superior == true) ? " *** " : "");
        System.out.print((i == 0 && superior == false) ? "     " : "");

        System.out.print((i > 0 && i < 3 && superiorIzquierda == true) ? "*" : "");
        System.out.print((i > 0 && i < 3 && superiorIzquierda == false) ? " " : "");

        System.out.print((i > 0 && i < 3) ? "   " : "");

        System.out.print((i > 0 && i < 3 && superiorDerecha == true) ? "*" : "");
        System.out.print((i > 0 && i < 3 && superiorDerecha == false) ? " " : "");

        System.out.print((i == 3 && central == true) ? " *** " : "");
        System.out.print((i == 3 && central == false) ? "     " : "");

        System.out.print((i > 3 && i < 6 && inferiorIzquierda == true) ? "*" : "");
        System.out.print((i > 3 && i < 6 && inferiorIzquierda == false) ? " " : "");

        System.out.print((i > 3 && i < 6) ? "   " : "");

        System.out.print((i > 3 && i < 6 && inferiorDerecha == true) ? "*" : "");
        System.out.print((i > 3 && i < 6 && inferiorDerecha == false) ? " " : "");

        System.out.print((i == 6 && inferior == true) ? " *** " : "");
        System.out.print((i == 6 && inferior == false) ? "     " : "");

        System.out.print("  ");
    }
    public static void main(String[] args) {
        try {

            while (true) {
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

                System.out.println("**********************************************");
                System.out.println("********** R E L O J  D I G I T A L **********");
                System.out.println("**********************************************");

                for (int i = 0; i < 7; i++) {
                    pintaLineaDigito(hora1, i);
                    pintaLineaDigito(hora2, i);

                    System.out.print((i==2 || i == 5)? " * ":"   ");

                    pintaLineaDigito(minuto1, i);
                    pintaLineaDigito(minuto2, i);

                    System.out.print((i==2 || i == 5)? " * ":"   ");

                    pintaLineaDigito(segundo1, i);
                    pintaLineaDigito(segundo2, i);
                    System.out.println();
                }
                System.out.println("**********************************************");

                System.out.println("Presiona Ctrl+c para salir");

                Thread.sleep(1000);

                limpiarPantalla();
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }
}