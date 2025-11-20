import java.util.Scanner;

public class T5Ej43b {
    public static void main(String[] args) {

      

        int altura;
        int anchura;
        int lado;



        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Introduce la altura del rectángulo(como mínimo 2): ");
            altura = sc.nextInt();

            System.out.print("Introduce la anchura del rectángulo(como mínimo 2): ");
            anchura = sc.nextInt();

            if ((altura <= 2 ) || (anchura <=2 )) {
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor minmo para la anchura y altura es de 2.");
            
            } else{
                for (int i = 0; i < anchura; i++) {
                    for (int j = 0; j < altura; j++) {
                        if ((i==0) || (i==(anchura - 1)) || (j==0) || (j==(altura - 1))) {
                            System.out.print("* ");

                        } else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("");
                }
            }
        
        } catch(Exception excepcion){
            System.out.println("**ERROR: la aplicación ha fallado.");
        }   
    }



}
