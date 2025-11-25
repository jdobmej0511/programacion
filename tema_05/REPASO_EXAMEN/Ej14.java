package REPASO_EXAMEN;

public class Ej14 {
    
    public static void main(String[] args) {
        int num;
        int temporal; 
        int resultado = 0;

        System.out.print("Introduce un número: ");
        num = Integer.parseInt(System.console().readLine());

        if (num >= 0) {
            temporal = num;

            for (int suma = 0; suma < 100; suma++) {
                resultado = resultado + num;

                num = num + 1;
            }

            System.out.printf("La suma de los 100 número siguientes a %d es %d", temporal, resultado);
        
        } else {
            System.out.println("Número introducido incorrecto, debe introducir  un número positivo.");
        }
        
    }
}
