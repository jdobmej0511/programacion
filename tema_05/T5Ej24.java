public class T5Ej24 {
    public static void main(String[] args) {
        int num;
        int multiplos = 0;
        int suma = 0;

        System.out.print("Introduzca un número entero mayor que 1: ");
        num = Integer.parseInt(System.console().readLine());    


        for(int i = 0; i < num; i += 3){
            if(i > 0){
                System.out.print(i + " ");

                multiplos++;

                suma += i;
            }
        }

        System.out.printf("Desde 1 hasta %d hay %d múltiplos de 3 y suman %d.",num , multiplos, suma);
    }
}
