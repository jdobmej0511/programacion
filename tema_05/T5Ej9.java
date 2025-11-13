public class T5Ej9 {
    public static void main(String[] args) {
        int nNum;
        int num1 = 0;
        int numFibonacci = 0;

        System.out.print("Introduce un número: ");
        nNum = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < nNum; i++){
            numFibonacci = num1 + numFibonacci;
            num1 ++;
            
            System.out.print(numFibonacci + " ");
        }
    }
}
