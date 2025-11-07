public class T4EJ25 {

  public static void main(String[] args) {
    String sabor ;
    double precioSabor = 0;
    double precioNata = 0;
    double precioNombre = 0;
    String tipoChocolate = "";
    String nata;
    boolean conNata = false;
    String nombre;
    boolean conNombre = false;


    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    sabor = System.console().readLine();


    switch (sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate = System.console().readLine();
        if (tipoChocolate.equals("negro")) {
          precioSabor = 14;
        } else if (tipoChocolate.equals("blanco")) {
          precioSabor = 15;
        }
        break;
      default:
    }

    System.out.print("¿Quiere nata? (si o no): ");
    nata = System.console().readLine();
    conNata = (nata.equals("si"))? true : false;
    
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    nombre = System.console().readLine();
    conNombre = (nombre.equals("si"))? true : false;

    System.out.print("Tarta de " + sabor);

    if (sabor.equals("chocolate")) {
      System.out.print(" " + tipoChocolate);
    }

    System.out.printf(": %.2f €\n", precioSabor);
    
    if (conNata == true) {
      precioNata = 2.5;
      System.out.printf("Con nata: %.2f €\n", precioNata);
    }
    
    if (conNombre == true) {
      precioNombre = 2.75;
      System.out.printf("Con nombre: %.2f €\n", precioNombre);
    }
    
    System.out.printf("Total: %.2f €\n", precioSabor + precioNata + precioNombre);
  }

}