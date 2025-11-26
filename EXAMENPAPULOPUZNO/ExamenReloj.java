package EXAMENPAPULOPUZNO;

import java.util.Scanner;

public class ExamenReloj {
    public static void main(String[] args) {
         
        boolean superior = false;
        boolean superiroDerecha = false;
        boolean superiorIzquierda = false;
        boolean central = false;
        boolean inferiorIzquierda = false;
        boolean inferiorDerecha = false;
        boolean inferior = false;

        int numero = 0;
        int numeroSolicitado = 0;
        int digito = 0;

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

            for (int i = 0; i < 7; i++) {

                

                for ( digito = 0; digito <= numero; digito++) {
        

                    switch (digito) {
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
                }

                System.out.println("");
            }
          

        
    }
}
