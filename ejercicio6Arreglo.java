package Ejercicios;

import java.util.Scanner;

public class ejercicio6Arreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo = new int[10];

        System.out.println("Ingrese 10 números (entre 1 y 9):");
        for (int i = 0; i < arreglo.length; i++) 
        {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt(); //1,2,3,3,4,5,5,5,6,7
        }

        int mayorOcurrencias = 0;
        int masRepetido = 0;
        int c;

        for (int i = 0; i < arreglo.length; i++) 
        {
            c = 0;
            for (int j = 0; j < arreglo.length; j++) 
            {
                if (arreglo[i] == arreglo[j]) 
                {
                    c++;
                }
            }
            if (c > mayorOcurrencias) 
            {
                mayorOcurrencias = c;
                masRepetido = arreglo[i];
            }
        }
        System.out.println("\n+--------------- RESULTADOS ---------------+");
        System.out.println("| 1. La mayor ocurrencia es: " + mayorOcurrencias);
        System.out.println("| 2. El elemento que más se repite es: " + masRepetido);
        System.out.println("+------------- FIN RESULTADOS -------------+");
        entrada.close();
    }
}