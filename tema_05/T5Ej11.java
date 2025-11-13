public class T5Ej11 {
    public static void main(String[] args) {
        int base;
        int exponente = 0;
        int sol = 0;

        System.out.println("Cálculo de una potencia");
        
        System.out.print("Introduce una base: ");
        base = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el exponente: ");
        exponente = Integer.parseInt(System.console().readLine());

        for(int i = 1; i< exponente; i++) {
            sol = sol * base;
        }

        System.out.printf("%d^%d = %d", base, exponente, sol);
    }
}
