package tema_03;

public class ejerciccio11 {
    public static void main(String[] args) {
        double kb;
        double mb;

        System.out.print("Introduzca el número de Kb: ");
        kb = Double.parseDouble(System.console().readLine());

        mb = kb / 1024;

        System.out.printf("%.0fKb son %.1fMb",kb ,mb);

        System.out.printf("") ; 
    }
}
