package tema_04;

public class T4EJ4 {
    public static void main(String[] args) {
        int dia;

      /*System.out.print("Introduce el día de la semana(1 - lunes, 2 - martes, 3 - miércoles, etc.): ");
        dia = Integer.parseInt(System.console().readLine());
        
        if(dia>=1 && dia<=7){
            if((dia>=1) && (dia<=5)){
                System.out.println("Es entre semana");
            }else{
                System.out.println("Es fin de semana.");
            }
        }else{
            System.out.println("Ese valor no es una opción."); 
        }*/

        System.out.print("Introduce el día de la semana(1 - lunes, 2 - martes, 3 - miércoles, etc.): ");
        dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1,2,3,4,5:System.out.println("Es entre semana");
                break;

            case 6,7:System.out.println("Es fin de semana");
                break;
            default: System.out.println("Ese valor no es una opción.");
                break;    
             
        }

    }
}
