package tema_04;

public class T4EJ5 {
    public static void main(String[] args) {
        int mes;

        System.out.print("Introduce el  número del més: ");
        mes = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1:
                System.out.println("Es enero.");
                break;
            case 2:
                System.out.println("Es febrero.");
                break;    
            case 3:
                System.out.println("Es marzo.");
                break;
            case 4:
                System.out.println("Es abril.");
                break;
            case 5:
                System.out.println("Es mayo.");
                break;
            case 6:
                System.out.println("Es junio.");
                break;
            case 7:
                System.out.println("Es julio.");
                break;
            case 8:
                System.out.println("Es agosto.");
                break;
            case 9:
                System.out.println("Es septiembre.");
                break;
            case 10:
                System.out.println("Es octubre.");
                break;
            case 11:
                System.out.println("Es noviembre.");
                break;            
            case 12:
                System.out.println("Es diciembre.");
                break;
            default:System.out.println("**Error, el valor introducido no corresponde a ningún més.");
                break;
        }
    }
}
