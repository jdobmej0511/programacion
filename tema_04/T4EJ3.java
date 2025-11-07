

public class T4EJ3 {
    public static void main(String[] args) {
        final int MINIMO = 1;
        final int MAXIMO = 100;

        float num;

        System.out.print("Introcude un valor comprendido entre 1 y 100: ");
        num = Float.parseFloat(System.console().readLine());

        System.out.println(num>=MINIMO && num<=MAXIMO ? "El valor está en el rango indicado." : "Te he dicho un valor entre 1 y 100."); 
    }
}
