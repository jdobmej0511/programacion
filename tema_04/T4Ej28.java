public class T4Ej28 {
    public static void main(String[] args) {
        String nomArticulo;
        String fiesta;

        double precioBase;
        double subtotal;
        double descuento = 0;
        double iva = 0; 
        double total;
        double totalConDescuento;
        int unidades;
        int porcentajeDescuento = 0;
        double porcentajeIva = 21;

        System.out.print("Introduzca nombre del artículo: ");
        nomArticulo = System.console().readLine();

        System.out.print("Introduzca el precio del artículo: ");
        precioBase = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca el número de unidades vendidas: ");
        unidades = Integer.parseInt(System.console().readLine());

        System.out.print("¿Aplicamos descuento en IVA por fiestas? (s/n): ");
        fiesta = System.console().readLine();

        if (fiesta.equals("s")) {
            porcentajeIva = 16;
        }


        if (unidades >= 1 && unidades <= 3) {
            porcentajeDescuento = 5;
        } else if (unidades >= 4 && unidades <= 10) {
            porcentajeDescuento = 10;
        } else if (unidades > 10) {
            porcentajeDescuento = 15;
        }


        subtotal = precioBase * unidades;

        descuento = subtotal * porcentajeDescuento / 100.0;

        totalConDescuento = subtotal - descuento;

        iva = totalConDescuento * porcentajeIva / 100.0;

        total = totalConDescuento + iva;

        System.out.println("==============================================");
        System.out.println("Factura");
        System.out.println("----------------------------------------------");
        System.out.printf("%-20s  %-25s\n", "Artículo:", nomArticulo);
        System.out.printf("%-20s  %8.2f €/unidad\n", "Precio:", precioBase);
        System.out.printf("%-20s  %8d\n", "Cantidad:", unidades);
        System.out.printf("%-20s  -%8.2f €\n", "Descuento (" + porcentajeDescuento + "%):", descuento);
        System.out.println("----------------------------------------------");
        System.out.printf("%-30s %8.2f €\n", "Subtotal con descuento", totalConDescuento);
        System.out.printf("%-30s +%8.2f €\n", "IVA (" + (int)porcentajeIva + "%)", iva);
        System.out.println("----------------------------------------------");
        System.out.printf("%-30s %8.2f €\n", "TOTAL", total);
    }
}
