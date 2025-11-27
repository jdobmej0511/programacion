package EXAMENPAPULOPUZNO;

import java.util.Scanner;

public class ModeloExamen {
    public static void main(String[] args) {
        final String RESET = "\033[0m" ;
        final String RED_BACKGROUND = "\033[41m";
        final String GREEN_BACKGROUND = "\033[42m";
        final String BLUE_BACKGROUND = "\033[44m";
        final String PURPLE_BACKGROUND = "\033[45m";

        int numMax;
        int numMin;
        int numero;
        int temporal;
        int posicion;
        int longitud;
        int digMayor;
        int tope;

        char color = ' ';

        Scanner escaner = new Scanner(System.in);
        

        System.out.println("GRAPHIFY");
        System.out.println("===============");

        System.out.print("Introduzca el numero minimo: "); // leemos le minimo
        numMin= escaner.nextInt();

        System.out.print("Introduzca el numero máximo: "); // leemos el maximo
        numMax= escaner.nextInt();
        

        System.out.print("Indica si quieres el grafico en blanco y negro o a color(B|C): "); //elegimos color
        color= System.console().readLine().toLowerCase().charAt(0);

        numero= (int) ((Math.random())*(numMax-numMin+1)+numMin); // numero aleatorio en el rango

        temporal = girarNumero(numero); // giramos numero con la funcion

        longitud = String.valueOf(numero).length(); // sacamos la longitud

        digMayor=numeroMax(numero); //scamos el mayor numero

        tope = digMayor+1; // calculamos el tope sumandole 1 al digito mayor

        if (color == 'b') { // si el color seleccionado es en blanco y negro
            while(longitud>0){ // se ahra siempre q la longitud sea mayor que 0
            posicion = temporal%10;
           
                for(int j = 0; j<tope; j++){
                    System.out.print(" ---");
                }
                System.out.println("");

                for(int i = 0; i<tope; i++){
                    if (i == 0) {
                    System.out.printf("| %d ",posicion);
                    }else if(i <= posicion && i!=0){ 
                    System.out.print("| * ");
                    }else{
                        System.out.print("|   ");
                    }
                }
                System.out.print("|");
                System.out.println("");
                
                
                
                temporal/=10;
                longitud --;  
            }  
            for(int k = 0; k<tope;k++){
                System.out.print(" ---");
            }  
        }
        if (color == 'c'){
            for(int u = 0; u<tope; u++){
                if(u==0){
                    System.out.print("\u2554\u2550\u2566"); 
                }else if (u < tope-1 && u != 0){
                    System.out.print("\u2550\u2566");
                }else{
                    System.out.print("\u2550\u2557");
                }
                
            }
            while(longitud>0){
                posicion = temporal%10;
               
                    
                    System.out.println("");
    
                    for(int v = 0; v<tope; v++){
                        if (v == 0) {
                        System.out.printf("\u2551%d",posicion);
                        }else if(v <= posicion && v!=0){ 
                            switch (posicion) {
                                case 1,2,3,4:
                                    System.out.print("\u2551"+RED_BACKGROUND+" "+RESET);
                                    break;
                                case 5,6:
                                    System.out.print("\u2551"+GREEN_BACKGROUND+" "+RESET);
                                    break;
                                case 7 ,8:
                                    System.out.print("\u2551"+BLUE_BACKGROUND+" "+RESET);
                                    break;
                                default:
                                    System.out.print("\u2551"+PURPLE_BACKGROUND+" "+RESET);
                                    break;
                            }
                        
                        }else{
                            System.out.print("\u2551 ");
                        }
                        
                    }
                    System.out.print("\u2551");
                    System.out.println("");
                    if (longitud ==1) {
                        for (int l = 0; l<tope ; l++) {
                        if (l==0) {
                            System.out.print("\u255A\u2550\u2569");     
                        }else if (l < tope -1 && l !=0) {
                            System.out.print("\u2550\u2569");
                        }else{
                            System.out.print("\u2550\u255D");
                        }
                        
                    }
                        
                    }else{
                        for (int h = 0; h<tope ; h++) {
                            if (h==0) {
                                System.out.print("\u2560\u2550\u256C");     
                            }else if (h < tope -1 && h !=0) {
                                System.out.print("\u2550\u256C");
                            }else{
                                System.out.print("\u2550\u2563");
                            }
                        
                        }
                    }
                    
                    
                    temporal/=10;
                    longitud --;  
                }  
                
           } 
        }
    public static int girarNumero(int numero){
        int volteado = 0;
        
        while(numero > 0){
            
            volteado= (volteado*10) + numero%10;
            numero/=10;
        }
        
        return volteado;
    }
    public static int numeroMax(int numero){
        int max=0;
        int dig;
        while(numero > 0){
            dig = numero%10;
            if (dig > max) {
                max = dig;
            }
            numero/=10;
        }
        return max;
    }
}
