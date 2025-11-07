public class T4Ej16 {

  public static void main(String[] args) {
    
    int num;
    int primer = 0;
    
    System.out.print("Por favor, introduzca un número entero positivo (5 cifras como máximo): ");
    num = Integer.parseInt(System.console().readLine());
    
    if ( num < 10 ) {
      primer = num;
    }
    
    if (( num >= 10 ) && ( num < 100 )) {
      primer = num / 10;
    }
    
    if (( num >= 100 ) && ( num < 1000 )) {
      primer = num / 100;
    }
    
    if (( num >= 1000 ) && ( num < 10000 )) {
      primer = num / 1000;
    }
    
    if ( num >= 10000 ) {
      primer = num / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primer + ".");
  }
}