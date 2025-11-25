public class T5Ej21 {

    public static void main(String[] args) {
      
      System.out.println("Este programa pinta una pirámide hecha a base de números.");
      System.out.print("Por favor, introduzca la altura de la pirámide: ");
      int alturaIntroducida = Integer.parseInt(System.console().readLine());
  
      int altura = 1;
      int i = 0;
      int espacios = alturaIntroducida - 1;
      
      while (altura <= alturaIntroducida) {
        
        
        for (i = 1; i <= espacios; i++) {
          System.out.print(" ");
        }
        
        
        for (i = 1; i < altura; i++) {
   
          System.out.print(i % 10);
        }
        
        for (i = altura; i > 0; i--) {
      
          System.out.print(i % 10);
        }
        
        System.out.println();
        
        altura++;
        espacios--;
      } 
    }
  }