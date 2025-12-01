public class Examen_JCDM {
    /**
 * ESCRIBE TU NOMBRE AQUÍ
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

        System.out.print(CLEAR) ;   // limpiamos la pantalla
        System.out.println("GRAPHIFY");
        System.out.println("====================");
        
    }

}

}
