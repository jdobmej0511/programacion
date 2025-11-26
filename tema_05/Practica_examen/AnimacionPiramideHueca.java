package Practica_examen;

public class AnimacionPiramideHueca {
    
    public static void main(String[] args) throws InterruptedException {
        
        int tamano = 10;  
        final int MINIMO = 3;
        final int MAXIMO = tamano;

        while (true) {
            while (tamano >= MINIMO) {
 

                piramide(tamano);

                tamano -= 1;

                Thread.sleep(150);

                limpiarPantalla();
            }

            while (tamano <= MAXIMO) {

                piramide(tamano);

                tamano += 1;

                Thread.sleep(150);

                limpiarPantalla();
            }
        }
    }

    public static void piramide(int tamano){
       
        int color;

        color =(int)(Math.random()*7)+31;    
        System.out.printf("\033[%dm", color);

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
