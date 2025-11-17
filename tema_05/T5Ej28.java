public class T5Ej28 {
    public static void main(String[] args) {
        int altura;

        System.out.print("Introduce la altura de la L: ");
        altura = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < (altura-1); i++){
            System.out.print("*");

            do{
                System.out.println(" ");
            } while (i > (altura - 1) );

  
                
            
        }

        for(int largo = 0; largo < altura; largo++){
            if (largo >= 2) {
                System.out.print("* ");
            }
        }
    }   
}
