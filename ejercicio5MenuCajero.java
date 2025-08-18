/*
EKERCICIO 5: REALIZAR MENU PARA CAJERO
------------------------------------------------------------
Un restaurante necesita un programa que permita al cajero: Mostrar un menú de opciones: 
1. Registrar un pedido.
2. Mostrar el total de ventas. 
3. Salir del sistema. 

Cada pedido se registra ingresando el precio. 
El programa debe seguir mostrando el menú hasta que el cajero elija Salir. 
Validar que el precio sea positivo antes de sumarlo a las ventas
 */

package Ejercicios;

import java.util.Scanner;

public class ejercicio5MenuCajero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double totalVentas = 0, precio;

        do {
            // Menú
            System.out.println("\n+-------- MENÚ CAJERO --------+");
            System.out.println("| 1. Registrar un pedido        |");
            System.out.println("| 2. Mostrar el total de ventas |");
            System.out.println("| 3. Salir del sistema          |");
            System.out.println("+-------------------------------+");
            System.out.print("| Seleccione una opción: "); opcion = entrada.nextInt();
            System.out.println("+-------------------------------+");

            switch (opcion) 
            {
                case 1 -> 
                        {
                            System.out.print("Ingrese el precio del pedido: ");
                            precio = entrada.nextDouble();

                            if (precio > 0) 
                            {
                                totalVentas += precio;
                                System.out.println("Pedido registrado con éxito.");
                            } 
                            else 
                            {
                                System.out.println("El precio debe ser positivo.");
                            }
                        }
                case 2 -> 
                        {
                            System.out.println("Total de ventas: $" + totalVentas);
                        }
                case 3 -> 
                        {
                            System.out.println("Saliendo del sistema...");
                        }
                        default -> 
                        {
                            System.out.println("Opción no válida.");
                        }
            }
        } while (opcion != 3);
        entrada.close();
    }
}
