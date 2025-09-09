package test;

import interfaces.impl.*;
import java.util.Date;

public class PruebaCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];

        productos[0] = new IPhone(25000, "Apple", "iPhone 15", "Negro");
        productos[1] = new TvLcd(18000, "Samsung", 55);
        productos[2] = new TvLcd(14000, "Sony", 40);
        productos[3] = new Libro(18000, new Date(), "Eric Gamma", "Elementos reusables POO", "Alguna editorial");
        productos[4] = new Libro(14000, new Date(), "Martin Fowler", "UML Gota a Gota", "Otra editorial");
        productos[5] = new Comics(12000, new Date(), "Stan Lee", "Spiderman Classic", "Marvel", "Spiderman");

        for (IProducto p : productos) {
            System.out.println("=====================================");
            System.out.println("Producto: " + p);
            System.out.println("Precio base: $" + p.getPrecio() + 
                               " (este es el costo inicial del producto, antes de aplicar margen de ganancia)");
            System.out.println("Precio venta: $" + p.getPrecioVenta() + 
                               " (este es el precio final al cliente, ya incluye margen de ganancia/impuestos)");
            System.out.println("Diferencia (ganancia): $" + (p.getPrecioVenta() - p.getPrecio()));
            System.out.println("=====================================\n");
        }
    }
}
