public class T5Ej27 {
    public static void main(String[] args) {
        String primerDia;      
        String segundoDia;


        int numPrimerDia = 0;
        int numSegundoDia = 0;
        int primeraHora;
        int segundaHora;

        System.out.println("Introduzca la primera hora.");
        System.out.print("Día: ");
        primerDia = System.console().readLine().toLowerCase();
        System.out.print("Hora: ");
        primeraHora = Integer.parseInt(System.console().readLine());

        switch (primerDia) {
            case "lunes":
                numPrimerDia = 0;
                break;
            
             case "martes":
                numPrimerDia = 1;
                break;

             case "miercoles":
                numPrimerDia = 2;
                break;

             case "jueves":
                numPrimerDia = 3;
                break;

             case "viernes":
                numPrimerDia = 4;
                break;

             case "sabado":
                numPrimerDia = 5;
                break;

             case "domingo":
                numPrimerDia = 6;
                break;
            default:
                break;
        }

        System.out.println("Introduzca la segunda hora.");
        System.out.print("Día: ");
        segundoDia = System.console().readLine().toLowerCase()
        ;
        System.out.print("Hora: ");
        segundaHora = Integer.parseInt(System.console().readLine());

                switch (segundoDia) {
            case "lunes":
                numSegundoDia = 0;
                break;
            
             case "martes":
                numSegundoDia = 1;
                break;

             case "miercoles":
                numSegundoDia = 2;
                break;

             case "jueves":
                numSegundoDia = 3;
                break;

             case "viernes":
                numSegundoDia = 4;
                break;

             case "sabado":
                numSegundoDia = 5;
                break;

             case "domingo":
                numSegundoDia = 6;
                break;
            default:
                break;
        }

          System.out.print("Entre las " + primeraHora + ":00h del " + primerDia);
    System.out.print(" y las " + segundaHora + ":00h del " + segundoDia);
    System.out.println(" hay " + (((numSegundoDia * 24) + segundaHora) - ((numPrimerDia * 24) + primeraHora)) + " hora/s.");

    }
}
