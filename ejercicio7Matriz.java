package Ejercicios;

import java.util.Scanner;

public class ejercicio7Matriz 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        int n, filas, columnas;

        System.out.print("Ingrese valor de n: ");
        n = entrada.nextInt();
        
        if(n == 0)
        {
            System.out.println("ERROR, FINALIZO EL PROGRAMA...");
            System.out.println();
        }
        else
        {
            for (filas = 0; filas < n; filas++)
            {
                for (columnas = 0; columnas < n; columnas++)
                {
                    if (filas == columnas || filas + columnas == n -1) 
                    {
                        System.out.print("X");
                    }
                    else
                    {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
        entrada.close();
    }
}