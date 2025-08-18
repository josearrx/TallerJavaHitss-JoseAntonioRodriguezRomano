/*
EJERCICIO 3: PROMEDIAR NOTAS FINALES
---------------------------------------------
Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas 
(double). Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas inferiores 
a 6 y la cantidad de notas iguales a 1, además mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una 
para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es o debe salirse del ciclo for y mostrar un mensaje de error
finalizando el programa.
 */

package Ejercicios;

import java.util.Scanner;

public class ejercicio3NotasFinales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sumaMayores = 0, sumaMenores = 0, sumaTotal = 0, nota;
        int contadorMayores = 0, contadorMenores = 0, contadorNotas1 = 0;
        int totalNotas = 0;
        int i;

        for (i = 1; i <= 20; i++) 
        {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = entrada.nextDouble();

            if (nota == 0) 
            {
                System.out.println("** ERROR: se ingresó una nota igual a 0. Programa finalizado. **");
                break;
            }
            if (nota < 1 || nota > 10) 
            {
                System.out.println("** Nota inválida. Debe estar entre 1 y 10. **");
                i--;
                continue;
            }

            sumaTotal += nota;
            totalNotas++;

            if (nota >= 6) 
            {
                sumaMayores += nota;
                contadorMayores++;
            } 
            else 
            {
                sumaMenores += nota;
                contadorMenores++;
            }

            if (nota == 1) 
            {
                contadorNotas1++;
            }
        }

        if (totalNotas > 0) {
            System.out.println("\n+====================  Resultados  ====================+");
            if (contadorMayores > 0) 
            {
                System.out.println("| Promedio de notas mayores o iguales a 6: " + (sumaMayores / contadorMayores));
            } 
            else 
            {
                System.out.println("| No hay notas mayores o iguales a 6.");
            }

            if (contadorMenores > 0) 
            {
                System.out.println("|        Promedio de notas inferiores a 6: " + (sumaMenores / contadorMenores));
            } 
            else 
            {
                System.out.println("| No hay notas inferiores a 6.");
            }
            System.out.println("|           Cantidad de notas iguales a 1: " + contadorNotas1);
            System.out.println("+------------------------------------------------------|");
            System.out.println("| Promedio total: " + (sumaTotal / totalNotas));
            System.out.println("+================  Fin de resultados  =================+");
        }
        entrada.close();
    }
}