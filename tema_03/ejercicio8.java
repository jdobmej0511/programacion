package tema_03;

public class ejercicio8 {
    public static void main(String[] args) {
        int horas;
        
        System.out.print("Introduzca el número de horas trabajadas durante la seman: ");
        horas = Integer.parseInt(System.console().readLine());

        System.out.printf("Tu salario semanal es de %d euros.", (horas*12));
    }
}
