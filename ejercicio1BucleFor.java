/*
EJERCICIO 1: BUCLE FOR
---------------------------------
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los
unarios, donde menos por menos es positivo.
 */

package Ejercicios;

import java.util.Scanner;

public class ejercicio1BucleFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, i;
        boolean negativo = false;
        int resultado = 0;
        
        System.out.print("Ingrese el primer número: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextInt();
        
        if (num1 < 0) 
        {
            num1 = -num1;
            negativo =! negativo;
        }

        if (num2 < 0) 
        {
            num2 = -num2;
            negativo =! negativo;
        }
        
        for (i = 0; i < num2; i++) 
        {
            resultado += num1;
        }
        
        if (negativo) 
        {
            resultado = -resultado;
        }
        System.out.println("El resultado de " + num1 + "x" + num2 + " es: " + resultado);
        entrada.close();
    }
}
