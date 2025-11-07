import java.util.Scanner;

public class T4Ej23 {

  public static void main(String[] args) {
    int altura = 0;
    int anchura = 0;
    String escudo;
    boolean quiereEscudo;
    String escudoCadena;
    float precioEscudo;


    try (Scanner s = new Scanner(System.in)) {
      System.out.print("Introduzca la altura de la bandera en cm: ");
      altura = Integer.parseInt(s.nextLine());

      System.out.print("Ahora introduzca la anchura: ");
      anchura = Integer.parseInt(s.nextLine());
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    escudo = System.console().readLine();
    quiereEscudo = (escudo == "s")? true : false;

    
    if (quiereEscudo) {
      escudoCadena = "Con escudo";
      precioEscudo = 2.50f;
    } else {
      escudoCadena = "Sin escudo";
      precioEscudo = 0;
    }

    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
    System.out.printf("%s:           %5.2f €\n", escudoCadena, precioEscudo);
    System.out.printf("Gastos de envío:      %5.2f €\n", 3.25);
    System.out.printf("Total:                %5.2f €\n", (float)anchura * altura / 100 + precioEscudo + 3.25);
  }
}