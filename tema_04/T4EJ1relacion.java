

public class T4EJ1relacion {
    public static void main(String[] args) {
        String dia;

        System.out.print("Introduce un día de la saemana y te diré que asginatura toca a primera hora de ese día: ");
        dia = System.console().readLine();

        switch (dia) {
            case "Lunes":
                System.out.println("El lunes a primera tienes Programación.");
                break;
            case "Martes":
                System.out.println("El martes a primera tienes Sistemas Informáticos.");    
                break;
            case "Miercoles":
                System.out.println("El miercoles a primera tienes Base de datos.");    
                break;
            case "Jueves":
                System.out.println("El martes a primera tienes Sistemas Informáticos.");    
                break;
            case "Viernes":
                System.out.println("El martes a primera tienes Programación.");    
                break;
        
            default:
                break;
        }
    }
}
