//José Carlos Doblas Mejías

public class Ejercicio1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int tipoProducto;
        int productoAlimentacion = 0;
        int cantidadProductos;
        int numRegaloAleatorio;
        int numDescuentoAleatorio;
        int porcentajeDescuentoElectrodomesticos = 0;
        int cantidadProductosPromocion = 0;
        int porcentajeIva;


        float precioProducto;
        float precioTotalSinIva;
        float iva;
        float totalIva;
        float precioDescontado = 0;
        float precioConDescuento = 0;

        String nombreProducto;
        String tienePromocion;
        String regalo = null;

        boolean promocion = false;

        numRegaloAleatorio = (int)(Math.random()*4); //regalo sorpresa
        switch (numRegaloAleatorio) {
            case 0:
                regalo = "Descuento del 5% en la próxima compra";
                break;
            
            case 1:
            regalo = "Bolsa reutilizable de regalo";
            break;

            case 2:
            regalo = "Vale por un café gratis";
            break;

            case 3:
            regalo = "Pegatina oficial del EL porte Inglés";
            break;

            default:
                break;
        }

        System.out.println("Introduzca el tipo de producto:");
        System.out.println("1. Alimentación");
        System.out.println("2. Electrónica");
        System.out.println("3. Farmacia");
        System.out.println("4. Moda");

        try {    
       
        System.out.print("Opción: ");
        tipoProducto = Integer.parseInt(System.console().readLine());

        System.out.println("");

        switch (tipoProducto) {
            case 1: //alimentacion
                System.out.println("Introduzca el tipo de alimento:");
                System.out.println("1. Huevos");
                System.out.println("2. Leche");
                System.out.println("3. Pan");
                System.out.println("4. Fruta");
                System.out.println("5. Verdura");
                System.out.println("6. Otros");

                System.out.print("Opción: ");
                productoAlimentacion = Integer.parseInt(System.console().readLine());

                System.out.println("");

                System.out.print("Introduzca el nombre del producto: ");
                nombreProducto = System.console().readLine();

                System.out.print("Introduzca la cantidad de productos: ");
                cantidadProductos = Integer.parseInt(System.console().readLine());

                System.out.print("Introduzca el precio por unidad del producto: ");
                precioProducto = Float.parseFloat(System.console().readLine());


                //operaciones
                precioTotalSinIva = precioProducto * cantidadProductos;
                
                if(productoAlimentacion >=6){
                    porcentajeIva = 10;
                }else{
                    porcentajeIva = 4; 
                }

                iva = precioTotalSinIva * porcentajeIva / 100;

                totalIva = precioTotalSinIva + iva;


                //factura
                System.out.println("");
                System.out.println("\033[1mFactura\033[0m");
                System.out.println("-----------------------------------");
                System.out.printf("%-18s%s\n","Artículo", nombreProducto);
                System.out.printf("%-18s$ %.2f/unidad\n","Precio", precioProducto);
                System.out.printf("%-18s%d\n","Cantidad", cantidadProductos);
                System.out.println("-----------------------------------");
                System.out.printf("%-18s$ %.2f\n","Total", precioTotalSinIva);
                System.out.printf("%-7s%2d%-9s$ %.2f\n","IVA al ", porcentajeIva,"%", iva);
                System.out.println("-----------------------------------");
                System.out.printf("%-18s$ %.2f\n","Total con IVA", totalIva);
                System.out.println("");
                System.out.print("%c\033[1mProducto sorpresa:\033[0m\n");
                System.out.println(regalo);
                System.out.println("");
                break;
        
                case 2: //electorónicos
                System.out.print("Introduzca el nombre del producto: ");
                nombreProducto = System.console().readLine();

                System.out.print("Introduzca la cantidad de productos: ");
                cantidadProductos = Integer.parseInt(System.console().readLine());

                System.out.print("Introduzca el precio por unidad del producto: ");
                precioProducto = Float.parseFloat(System.console().readLine());

                System.out.print("¿Tiene promoción? (s/n): ");
                tienePromocion = System.console().readLine();

                //comprobamos si tiene promoción
                if(tienePromocion.equals("s")){
                    promocion = true;
                }
            
                //porcentaje descuento
                if(promocion == true){
                    numDescuentoAleatorio = (int) (Math.random()*2);

                    switch (numDescuentoAleatorio) {
                        case 0:
                            porcentajeDescuentoElectrodomesticos = 10;
                            break;
                    
                        case 1:
                        porcentajeDescuentoElectrodomesticos = 15;
                        break;   

                        default:
                            break;
                    }
                }
                
                //operaciones
                precioTotalSinIva = precioProducto * cantidadProductos;

                if(promocion == true){
                    precioDescontado = precioTotalSinIva * porcentajeDescuentoElectrodomesticos /100;

                    precioConDescuento = precioTotalSinIva - precioDescontado;

                    iva = (float) (precioConDescuento * 0.2);

                    totalIva = precioConDescuento + iva;

                } else{
                    iva = (float) (precioTotalSinIva * 0.2);

                    totalIva = precioTotalSinIva + iva;
                }             


                //factura
                System.out.println("");
                System.out.println("\033[1mFactura\033[0m");
                System.out.println("-----------------------------------");
                System.out.printf("%-18s%s\n","Artículo", nombreProducto);
                System.out.printf("%-18s$ %.2f/unidad\n","Precio", precioProducto);
                System.out.printf("%-18s%d\n","Cantidad", cantidadProductos);
                System.out.println("-----------------------------------");

                if(promocion == true){
                    System.out.printf("%-18s$ %.2f\n","Subtotal", precioTotalSinIva);
                    System.out.printf("%-10s%-2d%-6s$ -%.2f\n","Descuento", porcentajeDescuentoElectrodomesticos, "%", precioDescontado);
                    System.out.printf("%-18s$ %.2f\n","Total tras desc.", precioConDescuento);
                    System.out.printf("%-18s$ %.2f\n","IVA al 20%", iva);
                    System.out.println("-----------------------------------");
                    System.out.printf("%-18s$ %.2f\n","Total con IVA", totalIva);
                    System.out.println("");
                    System.out.println("\033[1mProducto sorpresa:\033[0m");
                    System.out.println(regalo);
                    System.out.println("");
                } else{
                    System.out.printf("%-18s$ %.2f\n","Total", precioTotalSinIva);
                    System.out.printf("%-18s$ %.2f\n","IVA al 20%", iva);
                    System.out.println("-----------------------------------");
                    System.out.printf("%-18s$ %.2f\n","Total con IVA", totalIva);
                    System.out.println("");
                    System.out.println("\033[1mProducto sorpresa:\033[0m");
                    System.out.println(regalo);
                    System.out.println("");
                    }

                break;     

                case 3: //farmacia
                System.out.print("Introduzca el nombre del producto: ");
                nombreProducto = System.console().readLine();

                System.out.print("Introduzca la cantidad de productos: ");
                cantidadProductos = Integer.parseInt(System.console().readLine());

                System.out.print("Introduzca el precio por unidad del producto: ");
                precioProducto = Float.parseFloat(System.console().readLine());


                //operaciones
                precioTotalSinIva = precioProducto * cantidadProductos;
                
                iva = (float) (precioTotalSinIva * 0.04); 

                totalIva = precioTotalSinIva + iva;


                //factura
                System.out.println("");
                System.out.println("");
                System.out.println("\033[1mFactura\033[0m");
                System.out.println("-----------------------------------");
                System.out.printf("%-18s%s\n","Artículo", nombreProducto);
                System.out.printf("%-18s$ %.2f/unidad\n","Precio", precioProducto);
                System.out.printf("%-18s%d\n","Cantidad", cantidadProductos);
                System.out.println("-----------------------------------");
                System.out.printf("%-18s$ %.2f\n","Total", precioTotalSinIva);
                System.out.printf("%-18s$ %.2f\n","IVA al 4%", iva);
                System.out.println("-----------------------------------");
                System.out.printf("%-18s$ %.2f\n","Total con IVA", totalIva);
                System.out.println("");
                System.out.println("\033[1mProducto sorpresa:\033[0m");
                System.out.println(regalo);
                System.out.println("");
                break;

                case 4: //moda
                System.out.print("Introduzca el nombre del producto: ");
                nombreProducto = System.console().readLine();

                System.out.print("Introduzca la cantidad de productos: ");
                cantidadProductos = Integer.parseInt(System.console().readLine());

                System.out.print("Introduzca el precio por unidad del producto: ");
                precioProducto = Float.parseFloat(System.console().readLine());


                //operaciones
                cantidadProductosPromocion = cantidadProductos - (cantidadProductos/3);

                precioTotalSinIva = precioProducto * cantidadProductosPromocion;
                
                iva = (float) (precioTotalSinIva * 0.21); 

                totalIva = precioTotalSinIva + iva;


                //factura
                System.out.println("");
                System.out.println("\033[1mFactura\033[0m");
                System.out.println("-----------------------------------");
                System.out.printf("%-18s%s\n","Artículo", nombreProducto);
                System.out.printf("%-18s$ %.2f/unidad\n","Precio", precioProducto);
                System.out.printf("%-18s%d\n","Cantidad", cantidadProductos);
                System.out.println("-----------------------------------");
                System.out.printf("Promoción 3x2     Pagas solo %d unidades\n", cantidadProductosPromocion);
                System.out.printf("%-18s$ %.2f\n","Total", precioTotalSinIva);
                System.out.printf("%-18s$ %.2f\n","IVA al 21%", iva);
                System.out.println("-----------------------------------");
                System.out.printf("%-18s$ %.2f\n","Total con IVA", totalIva);
                System.out.println("");
                System.out.println("\033[1mProducto sorpresa:\033[0m");
                System.out.println(regalo);
                System.out.println("");
                break;

            default:
            System.out.println("El número introducido no corresponde con ningun tipo de producto.");
                break;
        }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
}

