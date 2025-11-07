public class T4Ej22 {
  public static void main(String[] args) {
    int cargo;
    int diasVisita;
    int estadoCivil;
    double sueldoBase = 0;
    double sueldoDietas;
    double sueldoBruto;
    double irpf = 0;
    double irpfPorcent = 0;
    double sueldoNeto;

    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    diasVisita = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    estadoCivil = Integer.parseInt(System.console().readLine());


    switch(cargo) {
      case 1: 
        sueldoBase = 950;
        break;
      case 2: 
        sueldoBase = 1200;
        break;
      case 3: 
        sueldoBase = 1600;
        break;
      default:
        System.out.println("No ha elegido correctamente el sueldo base.");
    }


    if (estadoCivil == 1) { 
      irpfPorcent = 25;
    } else if (estadoCivil == 2) { 
      irpfPorcent = 20;
    } else {
      System.out.println("No ha elegido correctamente el estado civil.");
    }
    
    sueldoDietas = diasVisita * 30;

    sueldoBruto = sueldoBase + sueldoDietas;

    irpf = (sueldoBruto * irpf) / 100;

    sueldoNeto = sueldoBruto - irpfPorcent;


    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("┃ Sueldo base            %7.2f ┃\n", sueldoBase);
    System.out.printf("┃ Dietas (%2d viajes)     %7.2f ┃\n", diasVisita, sueldoDietas);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ Sueldo bruto           %7.2f ┃\n", sueldoBruto);
    System.out.printf("┃ Retención IRPF (%.0f%%)   %7.2f ┃\n", irpf, irpfPorcent);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ Sueldo neto            %7.2f ┃\n", sueldoNeto);
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
  }
}