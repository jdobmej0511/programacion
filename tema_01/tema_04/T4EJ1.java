package tema_04;

public class T4EJ1 {
    public static void main(String[] args) {
        int edad;

        System.out.print("Introduce tu edad: ");
        edad = Integer.parseInt(System.console().readLine());

        if (edad<18) {
            System.out.println("Eres menor de edad");
        
        } else{
            if (edad >=18 && edad <=65) {
                System.out.println("Estas activo");
                
            }else {
                System.out.println("Estas jubilado");
            }

        }
    }
}
