package REPASO_EXAMEN;

public class Ej4 {
    
    public static void main(String[] args) {
        
        final int CODIGO = 4643;
        
        int codIntroducido = 0;

        boolean acierto = false;
        
        for (int intento = 0; (intento < 4) && (acierto == false); intento++) {
            
            System.out.print("Introduce la clave de la caja fuerte: ");
            codIntroducido = Integer.parseInt(System.console().readLine());

           
            if (codIntroducido != CODIGO) {
                System.out.println("Clave incorrecta.");

                if (intento == 3) {
                    System.out.println("Has agotado las 4 oportunidades");
            }
            } else{
                System.out.println("\033[33mSe ha abierto la caja fuerte.");
                acierto = true;
            }
        }

        System.out.println("\033[0m");
    }
}
