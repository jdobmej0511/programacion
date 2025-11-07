import java.util.Scanner;

public class T4Ej26 {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      String jugador1;
      String jugador2;
      int ganador;
      
      System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
      jugador1 = s.nextLine();
      
      System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
      jugador2 = s.nextLine();
      
      if (jugador1.equals(jugador2)) {
        System.out.println("Empate");
      } else {
        ganador = 1;
        switch(jugador2) {
          case "piedra":
            if (jugador1.equals("tijera")) {
              ganador = 2;
            }
            break;
          case "papel":
            if (jugador1.equals("piedra")) {
              ganador = 2;
            }
            break;
          case "tijera":
            if (jugador1.equals("papel")) {
              ganador = 2;
            }
            break;
          default:
        }
        System.out.println("Gana el jugador " + ganador);
      }
    }
  }
  
}