public class T5Ej12 {
    public static void main(String[] args) {
        int base;
        int exponente;
        int solucion = 0;
        int mult = 1;

        System.out.print("Introduzca la base: ");
        base = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el exponente máximo: ");
        exponente = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < exponente; i++){
            solucion *= base * mult;
            System.out.printf("%d^%d = %d\n",base, mult, solucion);
            
            mult++;
        }

    }
}
