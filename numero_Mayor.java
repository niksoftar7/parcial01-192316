import java.util.Scanner;

public class numero_Mayor {
    public static void main(String[] args) {
        //se crea el escaner
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el numero la cantidad que va a ingresar");
        final int n = entrada.nextInt();

        //declaro los vectores
        int[] lista1 = new int[n];
        int[] lista2 = new int[n];
        int resultado = 0 ;
        for (int i=0; i<n;i++ ){
            for (int j=0; j<n ; j++){
                lista1[j]= entrada.nextInt();
            }
            lista2[i]= entrada.nextInt();
        }
        for (int k=0;k<n;k++){
            if (lista1[k]>=lista2[k]){
                resultado= lista1[k];
            }else if (lista1[k]<=lista2[k] ) {
                resultado= lista2[k];
            }
        }
        System.out.println("el mayor es "+ resultado);
        entrada.close();
    }
}
