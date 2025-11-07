public class T4Ej20 {
  public static void main(String[] args) {
    int horas;
    int minutos;
    int minutosTotales;
    int minutosActuales;
    String dia;
    int numDia = 0;

    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    dia = System.console().readLine();

   

    switch(dia) {
      case "lunes":
        numDia = 0;
        break;
      case "martes":
        numDia = 1;
        break;
      case "miercoles":
        numDia = 2;
        break;
      case "jueves":
        numDia = 3;
        break;
      case "viernes":
        numDia = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    
    System.out.print("Hora: ");
    horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    minutos = Integer.parseInt(System.console().readLine());
    
    minutosTotales = (4 * 24 * 60) + (15 * 60);
    minutosActuales = (numDia * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}