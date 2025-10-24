package tema_03;

public class ejerciccio12 {
    public static void main(String[] args) {
        float nota1;
        float deseada;
        float nota2;
        
        System.out.print("Introduzca la nota del primer examen: ");
        nota1 = Float.parseFloat(System.console().readLine());
        nota1 = (float) (nota1 * 0.4);
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        deseada = Float.parseFloat(System.console().readLine());

        nota2 = (float) ((deseada - nota1) / 0.6);

        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen.", deseada, nota2);
    }
}
