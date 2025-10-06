package test;

import models.Conjuntos;
import models.Producto;
import java.util.Scanner;

public class ProductoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conjuntos inventario = new Conjuntos();
        boolean salir = false;

        // Running
        inventario.registrarProducto(new Producto(1, "Tenis Nike           ", "running", 15));
        inventario.registrarProducto(new Producto(2, "Short Adidas         ", "running", 20));
        inventario.registrarProducto(new Producto(3, "Playera Puma         ", "running", 25));
        inventario.registrarProducto(new Producto(4, "Calcetas Under Armour", "running", 50));
        inventario.registrarProducto(new Producto(5, "Gorra Reebok         ", "running", 10));

        // Fútbol
        inventario.registrarProducto(new Producto(6 , "Balón Adidas           ", "futbol", 30));
        inventario.registrarProducto(new Producto(7 , "Tacos Nike             ", "futbol", 18));
        inventario.registrarProducto(new Producto(8 , "Espinilleras Puma      ", "futbol", 40));
        inventario.registrarProducto(new Producto(9 , "Guantes Uhlsport       ", "futbol", 12));
        inventario.registrarProducto(new Producto(10, "Conos de entrenamiento ", "futbol", 60));

        // Baloncesto
        inventario.registrarProducto(new Producto(11, "Camiseta Puma  ", "basquetbol", 12));
        inventario.registrarProducto(new Producto(12, "Balón Spalding ", "basquetbol", 25));
        inventario.registrarProducto(new Producto(13, "Tenis Jordan   ", "basquetbol", 8));
        inventario.registrarProducto(new Producto(14, "Muñequeras Nike", "basquetbol", 35));
        inventario.registrarProducto(new Producto(15, "Red de aro     ", "basquetbol", 5));

        while (!salir) {
            System.out.println("+================= INVENTARIO =================+");
            System.out.println("| 0. Reporte por categoría                     |");
            System.out.println("| 1. Registrar productos en el inventario      |");
            System.out.println("| 2. Consultar producto por SKU en O(1).       |");
            System.out.println("| 3. Reporte en orden de registro.             |");
            System.out.println("| 4. Reporte alfabético por nombre.            |");
            System.out.println("| 5. Actualizar stock en ventas/entradas.      |");
            System.out.println("| 6. Salir                                     |");
            System.out.println("+==============================================+");
            System.out.print(">> Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 0 -> {
                    inventario.reportePorCategoria();
                }
                case 1 -> {
                    System.out.print("Ingrese SKU: ");
                    int sku = sc.nextInt(); sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese categoría: ");
                    String categoria = sc.nextLine();
                    System.out.print("Ingrese stock: ");
                    int stock = sc.nextInt();

                    boolean ok = inventario.registrarProducto(new Producto(sku, nombre, categoria, stock));
                    System.out.println(ok ? ">> Producto registrado." : ">> El SKU ya existe.");
                }
                case 2 -> {
                    System.out.print("Ingrese SKU a consultar: ");
                    int sku = sc.nextInt();
                    Producto p = inventario.consultarProducto(sku);
                    System.out.println(p != null ? p : ">> No encontrado.");
                }
                case 3 -> inventario.reporteRegistro();
                case 4 -> inventario.reporteAlfabetico();
                case 5 -> {
                    System.out.print("Ingrese SKU: ");
                    int sku = sc.nextInt();
                    System.out.print("Ingrese cantidad (+entrada / -venta): ");
                    int cantidad = sc.nextInt();
                    boolean ok = inventario.actualizarStock(sku, cantidad);
                    System.out.println(ok ? ">> Stock actualizado." : ">> Producto no encontrado.");
                }
                case 6 -> salir = true;
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        }
        sc.close();
        System.out.println("*** Fin del sistema de inventario ***");
    }
}
