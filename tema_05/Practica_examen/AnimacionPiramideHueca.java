package Practica_examen;

public class AnimacionPiramideHueca {
    
    public static void main(String[] args) throws InterruptedException {
        
        int tamano = 10;  
        int color;


        while (true) {
            while (tamano >= 3) {
                color =(int)(Math.random()*7)+31;
                System.out.printf("\033[%dm", color);

                piramide(tamano);

                tamano -= 1;

                Thread.sleep(150);

                limpiarPantalla();
            }

            while (tamano <= 10) {
                color =(int)(Math.random()*7)+31;
                System.out.printf("\033[%dm", color);

                piramide(tamano);

                tamano += 1;

                Thread.sleep(150);

                limpiarPantalla();
            }
        }
    }

    public static void piramide(int tamano){

        for (int fila = 0; fila <= tamano; fila++) {
        
            for (int espacios = 11; espacios > fila; espacios--) {
                System.out.print(" ");
            }

                for (int columna = 0; columna < fila*2-1; columna++) {
                    if (columna == 0 || columna == fila*2-2 || fila == tamano) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            System.out.println("");
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
