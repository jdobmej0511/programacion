import java.util.Scanner;

public class tarea4_DoblasMejiasJose {
    public static void main(String[] args) {
        int codigo;
        float precio;
        int ud;
        float descuento;
        float total;
        float rebaja;
        float iva;
        float fina;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\033[1mTANGO MODAS\033[0m");
            System.out.println("================================");

            System.out.print("Introduce código de artículo: ");
            codigo = sc.nextInt();

            System.out.print("Introduce precio: ");
            precio = sc.nextFloat();

            System.out.print("Introduce unidades vendidas: ");
            ud = sc.nextInt();

            System.out.print("Introduce descuento (%): ");
            descuento = sc.nextInt();
        }

        System.out.println("");

        total = (float )precio * ud;
        rebaja = (float) (total * (descuento/100));
        iva = (float) (total *0.16);
        fina = total - rebaja + iva;
        
        System.out.println("Su tiket:");

        System.out.println("");

        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("================================");
        System.out.printf("%-10d\t\t%10.2f€\n",codigo, precio);
        System.out.printf("%-1duds.\t\t%18.2f€\n",ud, total);
        System.out.printf("-%-2.0f%%\t\t%14s%.2f€\n",descuento,"-",rebaja);
        System.out.printf("16%% IVA%27.2f€\n",iva);
        System.out.printf("\033[47m%-10s%28.2f€\033[0m\n","\033[1mTOTAL",fina); 

    }
}
