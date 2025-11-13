public class T5Ej10 {
    public static void main(String[] args) {
        int num;
        int veces = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce 10 números enteros: ");
       
        do {
            num = Integer.parseInt(System.console().readLine());
            if (num >= 0) {
                positivos ++;
            } else{
                negativos ++;
            }

            veces ++;
        } while (veces < 10);
    
        System.out.printf("Has introducido %d positivos y %d negativos.", positivos, negativos);
    }
}
