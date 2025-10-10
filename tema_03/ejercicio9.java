package tema_03;

public class ejercicio9 {
    public static void main(String[] args) {
        double altura;
        double radio;
        double volumen;

        System.out.println("Volumen de un cono");
        System.out.println("----------------------");
        System.out.print("Introduzca la altura (cm): ");
        altura = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el radio de la base (cm): ");
        radio = Double.parseDouble(System.console().readLine());

        volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.printf("El volumen del cono es de %f cm3", volumen);

    }
}
