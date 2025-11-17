public class T5Ej23 {

    public static void main(String[] args) {
      int digito;
      int longitud = 0;
      int posicion = 1;

      long numeroIntroducido;
      long volteado = 0;
      long numero;

      
      System.out.print("Introduzca un número entero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
  
      System.out.print("Introduzca un dígito: ");
      digito = Integer.parseInt(System.console().readLine());
  
      System.out.print("Contando de izquierda a derecha, el " + digito);
      System.out.println(" aparece dentro de " + numeroIntroducido);
      System.out.print("en las siguientes posiciones: ");
      

      numero = numeroIntroducido;
      
      numero = numero * 10 + 1; //
      
      
      if (numero == 0) {
        longitud = 1;
      }
      
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        longitud++;
      } 
          
    
      while (volteado != 1) {
        if ((volteado % 10) == digito) {
          System.out.print(posicion + " ");
        }
        volteado /= 10;
        posicion++;
      } 
  
      System.out.println();
    }
  }
  