package services;

import models.*;
import java.util.*;
import java.util.function.*;

public class SupermercadoService {

    // 1. Filtrar productos con stock bajo
    public Predicate<Producto> stockBajo = p -> p.getStock() < 5;

    // 2. Calcular total de una venta
    public Function<List<Producto>, Double> calcularTotal =
        productos -> productos.stream().mapToDouble(Producto::getPrecio).sum();

    // 3. Imprimir detalles de una venta
    public Consumer<Venta> imprimirVenta = venta -> {
        System.out.println("+===== Detalles de la Venta ======+");
        System.out.println("| Cliente: " + venta.getCliente());
        System.out.println("| Empleado: " + venta.getEmpleado());
        System.out.println("|---------------------------------+");
        System.out.println("|            Productos            |");
        System.out.println("|---------------------------------+");
        venta.getProductos().forEach(System.out::println);
        System.out.println("|---------------------------------+");
        System.out.printf("| -> Total: $%.2f\n", venta.getTotal());
        System.out.println("+=================================+");
    };

    // 4. Generar producto de muestra
    public Supplier<Producto> generarProducto = () -> new Producto(999, "Producto Muestra", 100.0, 10);

    // 5. Aplicar descuento del 10%
    public UnaryOperator<Producto> aplicarDescuento = p -> {
        p.setPrecio(p.getPrecio() * 0.9);
        return p;
    };

    // 6. Comparar productos y devolver el más caro
    public BinaryOperator<Producto> productoMasCaro =
        (p1, p2) -> p1.getPrecio() > p2.getPrecio() ? p1 : p2;

    // 7. Verificar si cliente puede acceder a descuento
    public BiPredicate<Cliente, Double> puedeDescuento =
        (c, total) -> c.getTipo().equalsIgnoreCase("VIP") && total > 1000;

    // 8. Generar ticket de venta
    public Consumer<Venta> generarTicket = venta -> {
        System.out.println("\n+======== TICKET DE VENTA ========+");
        System.out.println("| Cliente: " + venta.getCliente().getNombre());
        System.out.println("| Empleado: " + venta.getEmpleado().getNombre());
        System.out.println("|---------------------------------+");
        venta.getProductos().forEach(p ->
            System.out.println("| - " + p.getNombre() + " $" + p.getPrecio()));
            System.out.println("|---------------------------------+");
        System.out.printf("| -> Total: $%.2f\n", venta.getTotal());
    };

    // 9. Notificar al cliente
    public BiConsumer<Cliente, Empleado> notificar =
        (c, e) -> System.out.println("| Estimado " + c.getNombre() +
            ", su compra fue procesada por " + e.getNombre())
            ;
            
}
