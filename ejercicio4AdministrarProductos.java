/*
EJERCICIO 4: ADMINISTRAR PRODUCTOS
------------------------------------------------
Para la tarea se requiere un menú para administrar a los productos con las opciones: 
actualizar, eliminar, crear, listar y salir.

Para la clase con el método main vamos a contar con un menú y poder seleccionar el tipo de operación,
según el numero ingresado.

Dentro de cada opción imprimir un texto relacionado, por ejemplo, para actualizar: 
"Usuario actualizado correctamente"

Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.

Iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar
con dicha operación debe volver al menú para continuar con otra, con la opción salir (5) se debe mostrar el 
mensaje "Haz salido con exito!" y finalizar el programa.
 */

package Ejercicios;

import java.util.Scanner;

public class ejercicio4AdministrarProductos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            //MENU
            System.out.println();
            System.out.println("+--- Menú de Administración de Productos ---+");
            System.out.println("| 1. Actualizar");
            System.out.println("| 2. Eliminar");
            System.out.println("| 3. Crear");
            System.out.println("| 4. Listar");
            System.out.println("| 5. SALIR");
            System.out.println("+--------------------------------------------");
            System.out.print("| Seleccione una opción: "); opcion = entrada.nextInt();

             switch (opcion) {
                case 1 -> System.out.println("| ** Usuario actualizado correctamente");
                case 2 -> System.out.println("| ** Usuario eliminado correctamente");
                case 3 -> System.out.println("| ** Usuario creado correctamente");
                case 4 -> System.out.println("| ** Usuarios listados correctamente");
                case 5 -> System.out.println("| ** Haz salido con éxito del Menú\n\n");
                default -> System.out.println("| ** Opción no válida. Intente de nuevo.");
            }
            System.out.println("+--------------------------------------------");
        } while (opcion != 5);
        entrada.close();
    }
}