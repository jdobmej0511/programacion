package EXAMENPAPULOPUZNO;

import java.time.LocalTime;

public class Reloj {
    
    public static void main(String[] args) {
        
        boolean superior = false;
        boolean superiroDerecha = false;
        boolean superiorIzquierda = false;
        boolean central = false;
        boolean inferiorIzquierda = false;
        boolean inferiorDerecha = false;
        boolean inferior = false;

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


        while (true) {

            limpiarPantalla();

            System.out.print(imprimir(hora1);imprimir(hora2););
            
        }
        

        
    }


    public static void imprimir(int hora){

         boolean superior = false;
        boolean superiroDerecha = false;
        boolean superiorIzquierda = false;
        boolean central = false;
        boolean inferiorIzquierda = false;
        boolean inferiorDerecha = false;
        boolean inferior = false;

        for (int i = 0; i < 7; i++) {
            
                switch (hora) {
                    case 1:
                        superior = false;
                        superiroDerecha = true;
                        superiorIzquierda = false;
                        central = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = true;
                        inferior = false;
                        break;

                    case 2:
                        superior = true;
                        superiroDerecha = true;
                        superiorIzquierda = false;
                        central = true;
                        inferiorIzquierda = true;
                        inferiorDerecha = false;
                        inferior = true;
                        break;

                    case 3:
                        superior = true;
                        superiroDerecha = true;
                        superiorIzquierda = false;
                        central = true;
                        inferiorIzquierda = false;
                        inferiorDerecha = true;
                        inferior = true;
                        break;

                    case 4:
                        superior = false;
                        superiroDerecha = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorIzquierda = false;
                        inferiorDerecha = true;
                        inferior = false;
                        break;

                    case 5:
                        superior = true;
                        superiroDerecha = false;
                        superiorIzquierda = true;
                        central = true;
                        inferiorIzquierda = false;
                        inferiorDerecha = true;
                        inferior = true;
                        break; 

                    case 6:
                        superior = true;
                        superiroDerecha = false;
                        superiorIzquierda = true;
                        central = true;
                        inferiorIzquierda = true;
                        inferiorDerecha = true;
                        inferior = true;
                        break;

                    case 7:
                        superior = true;
                        superiroDerecha = true;
                        superiorIzquierda = false;
                        central = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = true;
                        inferior = false;
                        break;

                    case 8:
                        superior = true;
                        superiroDerecha = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorIzquierda = true;
                        inferiorDerecha = true;
                        inferior = true;
                        break;

                    case 9:
                        superior = true;
                        superiroDerecha = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorIzquierda = false;
                        inferiorDerecha = true;
                        inferior = false;
                        break;

                    case 0:
                        superior = true;
                        superiroDerecha = true;
                        superiorIzquierda = true;
                        central = false;
                        inferiorIzquierda = true;
                        inferiorDerecha = true;
                        inferior = true;
                        break;

                    default: System.out.println("Entrada no valida");
                        break;

                }

                // Imprimimos la linea de arriba
                System.out.print((i == 0 && superior == true) ? " *** " : ""); 
                System.out.print((i == 0 && superior == false) ? "     " : "");
                
                // Imprimimos la barra superior izquierda
                System.out.print((i > 0 && i < 3 && superiorIzquierda == true) ? "*" : "");
                System.out.print((i > 0 && i < 3 && superiorIzquierda == false) ? " " : "");


                // Imprimimos los espacios entre la barra izquierda superior y la derecha superior
                System.out.print((i > 0 && i < 3) ? "   " : "");

                // Imprimimos la barra superior derecha
                System.out.print((i > 0 && i < 3 && superiroDerecha == true) ? "*" : "");
                System.out.print((i > 0 && i < 3 && superiroDerecha == false) ? " " : "");

                // Imprimimos la barra central
                System.out.print((i == 3 && central == true) ? " *** " : "");
                System.out.print((i == 3 && central == false) ? "     " : "");
                
                // Imprimimos la barra inferior izquierda
                System.out.print((i > 3 && i < 6 && inferiorIzquierda == true) ? "*" : "");
                System.out.print((i > 3 && i < 6 && inferiorIzquierda == false) ? " " : "");

                // Imprimimos los espacios entre la barra izquierda superior y la derecha superior
                System.out.print((i > 3 && i < 6) ? "   " : "");

                // Imprimimos la barra inferior derecha
                System.out.print((i > 3 && i < 6 && inferiorDerecha == true) ? "*" : "");
                System.out.print((i > 3 && i < 6 && inferiorDerecha == false) ? " " : "");

                // Imprimimos la barra inferior
                System.out.print((i == 6 && inferior == true) ? " *** " : "");
                System.out.print((i == 6 && inferior == false) ? "     " : "");
            
                System.out.print("  ");
            

            System.out.println("");
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
