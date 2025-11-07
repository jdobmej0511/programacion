package tema_06;

public class T6Ej3 {
    public static void main(String[] args) {
        int numCarta = 0;
        String carta = null;
        int numPalo = 0;
        String palo = null;

        numCarta = (int)(Math.random()*11) + 1;

        numPalo = (int)(Math.random()*4) + 1;


        switch (numCarta) {
            case 8:
                carta = "sota";
                break;
             
            case 9:
                carta = "caballo";
                break;

            case 10:
                carta = "rey";    
                break;

            case 11:
                carta = "as";
                break;    
        
            default:
            carta = String.valueOf(numCarta);
                break;
        }

        switch (numPalo) {
            case 1:
                palo = "oros";
                break;

            case 2:
                palo = "espadas";
                break;

            case 3:
                palo = "copas";
                break;

            case 4:
                palo = "bastos";
        
            default:
                break;
        }

        System.out.println(carta + " de " + palo);
    }
}
