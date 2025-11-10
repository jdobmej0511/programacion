

public class T6Ej6 {
    public static void main(String[] args) {
        int numAleatorio;
        int num1;
        int oportunidades = 5;
        boolean acierto = false;


        numAleatorio = (int)(Math.random()*100);

        System.out.println("Estoy pensando un número del 1 al 100 intenta adivinarlo. Tienes 5 oportunidades.");

        do{
            if(oportunidades>0)
                System.out.print("Introduce un número: ");
                num1 = Integer.parseInt(System.console().readLine());

                if(num1 == numAleatorio ){
                    System.out.println("Has acertado el numero.");
                    acierto = true;
                } else{
                    oportunidades --;
                    if (num1 > numAleatorio) {
                        System.out.println("El numero es menor");
                    } else{
                        System.out.println("El numero es mayor");
                    }
                    if(acierto == false && (oportunidades <=0)){
                        System.out.println("Lo siento no has acertado el numero que estaba pensando es el "+numAleatorio);
                    }else{
                    System.out.printf("Te quedan %d oportunidades\n", oportunidades);
                    }
                }
            
        }while((oportunidades > 0) && acierto == false );
            
      
    }   
}
