

public class T5Ej8 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;

        System.out.print("Introduzca el número: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.println("n  |  n2 |  n3  ");
        System.out.println("----------------");

        for(int i = 0; i < 6; i++){
            num2 = num *num;
            num3 = num * num2;
            System.out.printf("%d | %d | %d\n", num, num2, num3);

            num ++;
        }

    }
}
