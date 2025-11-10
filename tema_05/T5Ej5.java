public class T5Ej5 {
    public static void main(String[] args) {
    int numero = 0;
    
    System.out.print("Introduce un numero y te dire la tabla: ");
    numero = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < 11; i++){
            System.out.println(numero +" * " + i + " = " + (i*numero));
        }
    }
}
