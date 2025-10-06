package models;

import java.util.*;

public class Conjuntos {
    // Acceso rápido por SKU
    private Map<Integer, Producto> inventario = new HashMap<>();

    // Mantener orden de inserción
    private Set<Producto> registro = new LinkedHashSet<>();

    // Mantener orden alfabético
    private Set<Producto> alfabetico = new TreeSet<>(Comparator.comparing(Producto::getNombre));

    // 0. Reporte por categoría y SKU (más ordenado)
    public void reportePorCategoria() {
        System.out.println("=== Reporte por categoría ===");

        // Crear lista de categorías únicas
        Set<String> categorias = new HashSet<>();
        for (Producto p : registro) {
            categorias.add(p.getCategoria());
        }

        // Recorrer cada categoría
        for (String cat : categorias) {
            System.out.println("\n>> Categoría: " + cat);

            // Encabezado de tabla
            System.out.printf("%-5s | %-25s | %-12s | %-5s%n", "SKU", "Nombre", "Categoría", "Stock");
            System.out.println("-------------------------------------------------------------");

            // Mostrar productos de la categoría
            for (Producto p : registro) {
                if (p.getCategoria().equals(cat)) {
                    System.out.printf("%-5d | %-25s | %-12s | %-5d%n",
                            p.getSku(), p.getNombre(), p.getCategoria(), p.getStock());
                }
            }
        }
    }

    // 1. Registrar producto
    public boolean registrarProducto(Producto producto) {
        if (inventario.containsKey(producto.getSku())) {
            return false; // Ya existe
        }
        inventario.put(producto.getSku(), producto);
        registro.add(producto);
        alfabetico.add(producto);
        return true;
    }

    // 2. Consultar producto en O(1)
    public Producto consultarProducto(int sku) {
        return inventario.get(sku);
    }

    // 3. Reporte en orden de registro
    public void reporteRegistro() {
        System.out.println("=== Reporte en orden de registro ===");

        // Encabezado de tabla
        System.out.printf("%-5s | %-25s | %-12s | %-5s%n", "SKU", "Nombre", "Categoría", "Stock");
        System.out.println("-------------------------------------------------------------");

        for (Producto p : registro) {
            System.out.printf("%-5d | %-25s | %-12s | %-5d%n",
                    p.getSku(), p.getNombre(), p.getCategoria(), p.getStock());
        }
    }

    // 4. Reporte alfabético
    public void reporteAlfabetico() {
        System.out.println("=== Reporte alfabético ===");

        // Encabezado de tabla
        System.out.printf("%-5s | %-25s | %-12s | %-5s%n", "SKU", "Nombre", "Categoría", "Stock");
        System.out.println("-------------------------------------------------------------");

        for (Producto p : alfabetico) {
            System.out.printf("%-5d | %-25s | %-12s | %-5d%n",
                    p.getSku(), p.getNombre(), p.getCategoria(), p.getStock());
        }
    }

    // 5. Actualizar stock
    public boolean actualizarStock(int sku, int cantidad) {
        Producto p = inventario.get(sku);
        if (p != null) {
            p.setStock(p.getStock() + cantidad);
            if (p.getStock() < 0) p.setStock(0);
            return true;
        }
        return false;
    }
}
