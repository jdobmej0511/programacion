package tema_04;

import java.util.Scanner;

public class T4EJ2 {
    public static void main(String[] args) {
        float nota;

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué nota has sacado? ");
        nota = sc.nextFloat();

        if(nota>0 && nota<=0){
                System.out.println(nota>=5 ? "Enorabuena, has aprobado" : "Lo siento, has suspendido.");
        } else{
            System.out.println("La nota introducida no esta dentro del ranago(1-10)");
        }
    }
}