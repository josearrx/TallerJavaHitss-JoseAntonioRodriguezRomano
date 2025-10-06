package test;

import models.*;
import services.SupermercadoService;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SupermercadoService service = new SupermercadoService();

        // Productos
        Producto p1 = new Producto(1, "Leche", 25.5, 3);
        Producto p2 = new Producto(2, "Pan", 15.0, 10);
        Producto p3 = new Producto(3, "Carne", 200.0, 2);
        Producto p4 = new Producto (4, "Huevos", 50.0, 5);
        Producto p5 = new Producto (5, "Refresco", 30.0, 8);
        Producto p6 = new Producto (6, "Queso", 80.0, 1);

        // Cliente y empleado
        Cliente c1 = new Cliente(1, "Juan Pérez", "VIP");
        Empleado e1 = new Empleado(1, "María López", "Cajera");

        // Venta
        List<Producto> lista = Arrays.asList(p1, p2, p3, p4, p5, p6);
        Venta v1 = new Venta(1, c1, e1, lista);

        // Calcular total
        double total = service.calcularTotal.apply(lista);
        v1.setTotal(total);

        // Imprimir venta
        service.imprimirVenta.accept(v1);

        // Ticket
        service.generarTicket.accept(v1);

        // Notificación
        System.out.println("|---------------------------------+");
        service.notificar.accept(c1, e1);
        System.out.println("+=================================+");

        // Stock bajo
        System.out.println();
        System.out.println("+=== Productos con stock bajo ====+");
        lista.stream().filter(service.stockBajo).forEach(System.out::println);
        System.out.println("+=================================+");


        // Comparar productos
        Producto caro = service.productoMasCaro.apply(p1, p3);
        System.out.println();
        System.out.println("+======= Producto más caro =======+");
        System.out.println(caro);
        System.out.println("+=================================+");

        // Verificar descuento
        System.out.println("\n**  ¿Cliente VIP con compra > 1000? \n     -> " +
            service.puedeDescuento.test(c1, total));
    }
}
