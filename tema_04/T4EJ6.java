

public class T4EJ6 {
    public static void main(String[] args) {
        char figura;
        float base;
        float altura;

        float triangulo;
        float rectangulo;
        float cuadrado;

        System.out.println("a. Calcular el área de un cuadrado");
        System.out.println("b. Calcular el área de un rectangulo");
        System.out.println("c. Calcular el área de un triangulo");
        System.out.print("Selecciona una opción: ");
        figura = System.console().readLine().charAt(0);


        switch (figura) {
            case 'a':
                System.out.print("Introduce el lado: ");
                base = Float.parseFloat(System.console().readLine());

                    cuadrado = (base * base);

                    System.out.println("El área de tu cuadrado es: " + cuadrado);
                break;
            case 'b':
                System.out.print("Introduce la base del rectangulo: ");
                base = Float.parseFloat(System.console().readLine());
    
                System.out.print("Introduce la altura del rectangulo: ");
                altura = Float.parseFloat(System.console().readLine());

                rectangulo = (base * altura);

                System.out.println("El área de tu cuadrado es: " + rectangulo);
                break;
            case 'c':
                System.out.print("Introduce la base del triangulo: ");
                base = Float.parseFloat(System.console().readLine());
    
                System.out.print("Introduce la altura del triangulo: ");
                altura = Float.parseFloat(System.console().readLine());

                triangulo = ((base * altura) / 2);

                System.out.println("El área de tu cuadrado es: " + triangulo);
                break;
        
            default: System.out.println("Esa no opcón no corresponde con ninguna figura.");
                break;
        }

    }
}
