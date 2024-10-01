import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //se crea el escaner
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese la temperatura que desea convertir");
        Double temperature = entrada.nextDouble(); //se crea la variable en la que se almacenará el valor a inggresar

        System.out.println("elija hacia que quiere cambiar");
        System.out.println("1. Fahrenheit a Celsius");
        System.out.println("2. de Celsius a Fahrenheit");
        int code = entrada.nextInt();

        //se crea una variable tipobandera para permitar que vuelva a pedir el codigo
        int flags = 0;
        while (flags == 0) {
            if (code<=0 || code>=3){
                System.out.println("ingrese un numero de los indicados (1 o 2)");
                code = entrada.nextInt();

            }else{
                flags=1;
            }
        }

        //creamos las constantes
        final int DATO_CELSIUS = 32;
        final double DATO_FAHRENHEIT = 9/5;
        final double DATO_FARENHEIT2 = 5/9;

        //Realizamos los procedimientos necesarios
    if (code==1) {
        Double conversion = (temperature-DATO_CELSIUS)*DATO_FARENHEIT2;
        System.out.println(conversion);
        flags=1;
    }else if (code==2){
        Double conversion = (temperature*DATO_FAHRENHEIT)+DATO_CELSIUS;
        System.out.println(conversion);
        flags=1;

    }
      
        entrada.close();

    }

}
