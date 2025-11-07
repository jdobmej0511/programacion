package tema_06;

public class T6Ej11 {
    public static void main(String[] args) throws InterruptedException {
        int caracter = 0;


        for ( ; ; ){
            caracter = (int)(Math.random()*95)+32;
            Thread.sleep(0);
            System.out.print("\033[38;2;0;255;0m "+(char)caracter);
        }
        
    }
}
