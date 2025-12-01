import java.util.Scanner;

/**
 * JOSÉ CARLOS DOBLAS MEJÍAS
 */

class Graphify {

    // Definición de constante LIMPIAR PANTALLA
    public static final String CLEAR = "\033[H\033[2J";

    // Definición de constantes de COLOR
    public static final String RESET = "\033[0m"; 
    public static final String RED_BACKGROUND    = "\033[41m";
    public static final String GREEN_BACKGROUND  = "\033[42m";
    public static final String BLUE_BACKGROUND   = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    // Definición de constantes de SÍMBOLOS COLOR
    public static final String HORIZONTAL       = "\u2550";     // ═
    public static final String VERTICAL         = "\u2551";     // ║

    public static final String ESQUINA_SUP_IZQ  = "\u2554";     // ╔
    public static final String ESQUINA_SUP_DER  = "\u2557";     // ╗
    public static final String ESQUINA_INF_IZQ  = "\u255A";     // ╚
    public static final String ESQUINA_INF_DER  = "\u255D";     // ╝

    public static final String CRUCE_IZQ        = "\u2560";     // ╠
    public static final String CRUCE_DER        = "\u2563";     // ╣
    public static final String CRUCE_SUP        = "\u2566";     // ╦
    public static final String CRUCE_CEN        = "\u256C";     // ╬
    public static final String CRUCE_INF        = "\u2569";     // ╩

    /**
     * GRAPHIFY: algoritmo principal
     * @param args
     */
    public static void main(String[] args) {

        long minimo = 0;
        long maximo = 0;
        long maxTemporal = 0;
        long minTemporal = 0;
        long aleatorio = 0;
        long girado = 0;
        long mayorNum = 0;

        int digito = 0;
        int longitud = 0;

        char color = 0;

        Scanner sc = new Scanner(System.in);

      

            System.out.print(CLEAR) ;   // limpiamos la pantalla
            System.out.println("GRAPHIFY");
            System.out.println("====================");

            System.out.print("Introduce el valor mínimo del rango: ");
            minimo = sc.nextLong();
            minTemporal = minimo;

            System.out.print("Introduce el valor máximo del rango: ");
            maximo = sc.nextLong();
            maxTemporal = maximo;

            // todas las operaciones

            aleatorio = generarNumeroAleatorio(minimo, maximo);

            girado = invertirNumero(aleatorio);

            mayorNum = calcularDigitoMayor(girado);

            longitud = longitudNumero(girado);

            System.out.print("Dibujo la grafica en blanco y negro o en color (B|C): ");
            color = sc.next().toLowerCase().charAt(0);

           switch (color) {
            case 'b':
                for (int filas = 0; filas <= longitud-1; filas++) {
                    digito = (int) (girado % 10) ;
                    girado /= 10;
    
                    for (int lineas = 0; lineas < mayorNum+1; lineas++) {
                        System.out.print(" ---");
                    }
                    System.out.println("");
    
                    for (int columnas = 1; columnas <= mayorNum; columnas++) {
                        
                        if (columnas == 1) {
                            System.out.printf("| %d ", digito);
                        }
    
                        if (columnas < digito + 1  ) {
                            System.out.print("| * ");
                        } 
    
                        if (columnas > digito) {
                            System.out.print("|   ");
                        }
                    }
    
                    System.out.println("|");
                }

                break;

                case 'c':
                    for (int filas = 0; filas <= longitud-1; filas++) {
                        digito = (int) (girado % 10) ;
                        girado /= 10;
        
                        if(filas == 0){
                            for (int i = 0; i < mayorNum+1; i++) {
                                if (i == 0) {
                                    System.out.print(ESQUINA_SUP_IZQ);
                                } else if(i > 0 && i < (mayorNum+1)){
                                    System.out.print("\u2550\u2550\u2550\u2566");
                                }
                            }

                            System.out.println("\u2550\u2550\u2550\u2557");

                        } else if(filas > 0 && filas < longitud){
                            for (int i = 0; i < mayorNum + 1; i++) {
                                if (i == 0) {
                                    System.out.print("\u2560");
                                } else if(i > 0 && i < (mayorNum +1)){
                                    System.out.print("\u2550\u2550\u2550\u256C");
                                }
                            }

                            System.out.println("\u2550\u2550\u2550\u2563");

                        } else if (filas >= (longitud-2)){
                            for (int i = 0; i < mayorNum+1; i++) {
                                if (i == 0) {
                                    System.out.print(ESQUINA_INF_IZQ);
                                } else if(i > 0 && i < (mayorNum+1)){
                                    System.out.print("\u2550\u2550\u2550\\u2569");
                                }
                            }

                            System.out.println("\u2550\u2550\u2550\u255D ");
                        }

                        
        
                        for (int columnas = 1; columnas <= mayorNum; columnas++) {
                            
                            if (columnas == 1) {
                                System.out.printf("\u2551 %d ", digito);
                            }
        
                            if (columnas < digito + 1  ) {
                                System.out.print("\u2551 \033[41m  \033[0m");
                            } 
        
                            if (columnas > digito) {
                                System.out.print("\u2551   ");
                            }
                        }
        
                        System.out.println("\u2551");
                    }
                    break;
           
            default:
                break;
           }

           System.out.println("");
            
            
        
    }   

    public static long generarNumeroAleatorio(long numMinimo, long numMaximo){
        long numAleatorio = 0;

        numAleatorio = (long) (Math.random()*(numMaximo-numMinimo)+numMinimo);
        
        return numAleatorio;
    }

    public static long invertirNumero(long numSinVoltear){
        long volteado = 0;
        int digito = 0;

        while (numSinVoltear > 0) {
            digito = (int) (numSinVoltear % 10);
            volteado = (volteado * 10) + digito;
            numSinVoltear /= 10;
        }

        return volteado;
    }

    public static int longitudNumero(long numEntero){
        int numDeNumeros = 0;

        if (numEntero == 0) {
            numDeNumeros = 1;
        
        } else {
            while (numEntero > 0) {
                numEntero /= 10;

                numDeNumeros ++;
            }
        }

        return numDeNumeros;
    }

    public static int calcularDigitoMayor(long numGirado){
        int digitoMayor = 0;
        int digito = 0;

        while (numGirado > 0) {
            digito = (int) (numGirado % 10);

            if (digito > digitoMayor) {
                digitoMayor = digito;
            }

            numGirado /= 10;
        }

        return digitoMayor;
    }

   // public static int obtenerColor(){

   // }

   // public static dibujarGrafico(){

   // }
}