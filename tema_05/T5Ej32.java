public class T5Ej32 {
    public static void main(String[] args) {
        int alturaIntroducida = 0;
        int altura = 1;
        int espaciosDEelanete;

        System.out.print("Introduce la altura de la X: ");
        alturaIntroducida = Integer.parseInt(System.console().readLine());

        if ((altura %2 != 0)  || altura > 3) {
            while (altura < (alturaIntroducida / 2 + 3)) {
                
                for (espaciosDEelanete = 1; espaciosDEelanete < (alturaIntroducida / 2); espaciosDEelanete++) {
                    System.out.println(" ");
                }

               
           }
        
        } else{
            System.out.println("Datos incorrectos. Introduce una altura impar mayor o igual que 3.");
        }
    }
}
