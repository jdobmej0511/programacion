public class T4Ej24 {
    public static void main(String[] args) {
        final double DESCUENTO = 0.1;

        int entradasIndividual;
        double precioIndividual = 8;
        int entradasPareja = 0;
        double precioPareja = 11;
        String dia; 
        int entradas;
        String tarjeta;
        double total;
        double rebaja = 0;
        double pagar;
        boolean tieneTarjeta;

        System.out.println("Venta de entradas CineTuring");
        System.out.print("Número de entradas: ");
        entradas = Integer.parseInt(System.console().readLine());

        System.out.print("Día de la semana: ");
        dia = System.console().readLine();

        System.out.print("¿Tienes tarjeta de CineCampa? (s/n): ");
        tarjeta = System.console().readLine();
        tieneTarjeta = tarjeta.trim().equalsIgnoreCase("s");

        switch (dia.toLowerCase()) {
            case "miércoles":
                precioIndividual = 5;
                total = precioIndividual * entradas;

                if (tieneTarjeta) {
                    rebaja = total * DESCUENTO;
                }

                pagar = total - rebaja;

                System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                System.out.printf("%-25s%8d\n", "Entradas individuales", entradas);
                System.out.printf("%-25s%8.2f\n", "Precio por entrada indiv.", precioIndividual);              
                System.out.printf("%-25s%8.2f\n", "Total", total);     
                System.out.printf("%-25s%8.2f\n", "Descuento", rebaja);  
                System.out.printf("%-25s%8.2f\n", "A pagar", pagar);                                      
                break;

            case "jueves":
                entradasPareja = entradas / 2;
                entradasIndividual = entradas % 2;

                total = precioIndividual * entradasIndividual;
                total += entradasPareja * precioPareja;

                if (tieneTarjeta) {
                    rebaja = total * DESCUENTO;
                }

                pagar = total - rebaja;

                System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                System.out.printf("%-25s%8d\n", "Entradas pareja", entradasPareja);
                System.out.printf("%-25s%8.2f\n", "Precio por entrada pareja", precioPareja);     
                System.out.printf("%-25s%8d\n", "Entradas individuales", entradasIndividual);
                System.out.printf("%-25s%8.2f\n", "Precio por entrada indiv.", precioIndividual);           
                System.out.printf("%-25s%8.2f\n", "Total", total);     
                System.out.printf("%-25s%8.2f\n", "Descuento", rebaja);  
                System.out.printf("%-25s%8.2f\n", "A pagar", pagar);                         
                break;

            default:
                total = precioIndividual * entradas;

                if (tieneTarjeta) {
                    rebaja = total * DESCUENTO;
                }

                pagar = total - rebaja;

                System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                System.out.printf("%-25s%8d\n", "Entradas individuales", entradas);
                System.out.printf("%-25s%8.2f\n", "Precio por entrada indiv.", precioIndividual);              
                System.out.printf("%-25s%8.2f\n", "Total", total);     
                System.out.printf("%-25s%8.2f\n", "Descuento", rebaja);  
                System.out.printf("%-25s%8.2f\n", "A pagar", pagar);                                      
                break;
        }
    }
}
