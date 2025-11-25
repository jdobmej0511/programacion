package Practica_examen;

public class EjercicioPiramide {
    
    public static void main(String[] args) {
        
        int altura = 0;
        int num = 0;

        System.out.print("Introduce la altura: ");
        altura = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce cuantas piramides quieres: ");
        num = Integer.parseInt(System.console().readLine());

        for (int fila = 1; fila <= altura; fila++) {
            
            for (int piramides = 1; piramides <= num; piramides++) {

                if (piramides >= 2) {
                    for (int espacios = altura * 2; espacios > fila * 2; espacios--) {
                    System.out.print(" ");
                    }
            
                    for (int columna = 0; columna < fila*2-1; columna++) {

                        if (columna == 0 || columna == fila*2-2 || fila == altura) {                    
                            System.out.print("*");
                
                        } else{
                            System.out.print(" ");
                        }
                    }

                } else {
                    for (int espacios = altura; espacios > fila ; espacios--) {
                        System.out.print(" ");
                    }
            
                    for (int columna = 0; columna < fila*2-1; columna++) {

                        if (columna == 0 || columna == fila*2-2 || fila == altura) {                    
                            System.out.print("*");
                
                        } else{
                            System.out.print(" ");
                        }
                    }
                }
            }

            System.out.println("");
        }
    }
}
