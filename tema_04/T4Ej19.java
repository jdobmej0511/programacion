public class T4Ej19 {
  public static void main(String[] args) {
    String recuperacion;

    System.out.print("Nota del primer control: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Nota del segundo control: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      recuperacion = System.console().readLine();

      switch (recuperacion) { //intente hacerlo con un if pero me daba error
        case "apto":
          media = 5;
          break;
      
        default:
        System.out.print("Tu nota de Programación es " + media);
          break;
      }

      
    }
    
    
  }
}