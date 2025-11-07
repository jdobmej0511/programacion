public class T4Ej15 {

  public static void main(String[] args) {
    int num; 
    System.out.print("Por favor, introduzca un número entero: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (num % 10));
  }
}