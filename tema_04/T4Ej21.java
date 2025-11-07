public class T4Ej21 {
  public static void main(String[] args) {
    double baseImponible;
    String tipoIVA;
    String codigoPromocional;
    int tipoIVANum = 0;
    double desc = 0;
    double iva;
    double precioSinDesc;
    double total;

    System.out.print("Introduzca la base imponible: ");
    baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    tipoIVA = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    codigoPromocional = System.console().readLine();
    
    
    
    
    switch(tipoIVA) {
      case "general":
        tipoIVANum = 21;
        break;
      case "reducido":
        tipoIVANum = 10;
        break;
      case "superreducido":
        tipoIVANum = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }
    
    iva = baseImponible * tipoIVANum / 100;
    precioSinDesc = baseImponible + iva;
    
    
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad":
        desc = precioSinDesc / 2;
        break;
      case "meno5":
        desc = 5;
        break;
      case "5porc":
        desc = precioSinDesc * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }
    
    
    total = precioSinDesc - desc;
    
    System.out.printf("Base imponible       %6.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVANum, iva);
    System.out.printf("Precio con IVA       %6.2f\n", precioSinDesc);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigoPromocional, desc);
    System.out.printf("TOTAL                %6.2f", total);
  }
}