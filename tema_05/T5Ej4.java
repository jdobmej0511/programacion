public class T5Ej4 {
    public static void main(String[] args) {
        int i = 0;
        int numero;
        int intento;


        boolean acierto = false;

        numero = (int) (Math.random()*10000);

        do{
            i++;
            System.out.print("Introduce la clave de la caja fuerte: ");            
            intento = Integer.parseInt(System.console().readLine());

            if (intento == numero) {
                acierto = true;
            }else{
                System.out.println("La clave es incorrecta");
            }

        }while(i<4 && acierto == false);

        if (i == 4 && acierto == false) {
            System.out.println("Lo siento, ha agotado las 4 oportunidades");
        }

        if (acierto == true){
            System.out.println("Se ha abierto la caja fuerte");
        }
    }
}
