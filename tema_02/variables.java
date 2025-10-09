public class variables {
    
    public static void main(String[] args) {
        
        double x ;
        double y ;
        int numero = 5;
        

        System.out.printf("El valor de la variable es: %d", numero);
        System.out.println("El valor de la variable es:" + numero);

        x = 7 ;
        y = 25.75 ;

//Ejemplo 2
        System.out.println("El valor de la variable" + x + "y el valor de y es" + y );
        System.out.printf( "El valor de x es %.2f y el vlaor de y es %.2f\n", x , y);


        //Ejemplo 3
        char letra1 = 'c' ;
        char letra2 = 'a' ;
        char letra3 ='s' ;
        char letra4 = 'a' ;

        System.out.println(letra1);
        System.out.println("La primera letra es: " + letra1);
        System.out.printf("la primera letra es: %c\n", letra2);
        System.out.printf("la primera letra es: %c\n", letra3);
        System.out.printf("la primera letra es: %c\n", letra4);

        //Ejemplo 4
        numero++ ;
        System.out.printf("El valor de la variable es: %d\n", numero++);
        System.out.printf("El valor de la variable es: %d\n", --numero);
    }
}
