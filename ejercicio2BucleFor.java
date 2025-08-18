/*
EJERCICIO 2: BUCLE FOR
------------------------------------------
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 
10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, 
luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el 
numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, 
imprimir " el numero menor es igual o mayor que 10!".
 */

package Ejercicios;

import java.util.Scanner;

public class ejercicio2BucleFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menor, i, numero, cantidad = 0;
        boolean desicion = false;

        // Pedir cantidad de números hasta que sea válida
        while (!desicion) {
            System.out.print("Cantidad de números (mínimo 1, máximo 10): ");
            cantidad = entrada.nextInt();

            if (cantidad >= 1 && cantidad <= 10) {
                desicion = true;
            } else {
                System.out.println("Error: Debe ingresar un valor entre 1 y 10.");
            }
        }

        ////////////////////////////////////////////////////////////////
        System.out.print("==============================\n");
        System.out.print("Ingrese el número 1: ");
        menor = entrada.nextInt();

        for (i = 2; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.print("==============================\n");
        ////////////////////////////////////////////////////////////////
        System.out.println("** El número menor es: " + menor);

        if (menor < 10) {
            System.out.println("** El número menor es menor que 10");
        } else {
            System.out.println("** El número menor es igual o mayor que 10");
        }

        entrada.close();
    }
}
