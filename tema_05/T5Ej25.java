public class T5Ej25 {
    public static void main(String[] args) {
        
        int numero;
        int factorial = 0;

        System.out.print("por favor, introduzca un número entero: ");
        numero = Integer.parseInt(System.console().readLine());

        if ((numero == 0) || (numero == 1)) {
            factorial = 1;
        } else {
            
        }

        System.out.printf("%d! 0 %d\n", numero, factorial);
    }
}
