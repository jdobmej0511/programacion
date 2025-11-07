public class tarea2_DoblasMejiasJose {
    public static void main(String[] args) {
        Double mayor;
        Double menor;
        Double volumen;

        System.out.printf("\033[0m\033[1mVOLUMEN DE UN TOROIDE\033[0m\n");
        System.out.println("=======================");

        System.out.print("Introduzca el radio mayor (cms): ");
        mayor = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca el radio menor (cms): ");
        menor = Double.parseDouble(System.console().readLine());

        volumen = 2 * (3.14*3.14) * mayor * (menor * menor);

        System.out.printf("El volumen del toroide es de \033[1m\033[31m%.4f\033[0m\033[1mcm\u00b3",volumen);



    }
}
