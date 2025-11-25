package REPASO_EXAMEN;

public class Ej5 {
    
    public static void main(String[] args) {
        
        int num; 

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%2d x %2d = %2d \n", num, i, (i * num));
        }
    }
}
