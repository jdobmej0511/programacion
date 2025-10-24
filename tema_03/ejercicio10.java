package tema_03;

public class ejercicio10 {
    public static void main(String[] args) {
        double mb;
        double kb;

        System.out.print("Introduzca el número de Mb: ");
        mb = Double.parseDouble(System.console().readLine());

        kb = mb * 1024;

        System.out.printf("%.2fMb son %.1fKb",mb ,kb);
    }
}
