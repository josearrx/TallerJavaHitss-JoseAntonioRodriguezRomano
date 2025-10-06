package services;

import models.*;
import java.util.*;
import java.util.function.*;

public class LibreriaService {
    private List<Libro> libros = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    // Predicate: validar libro > 1900
    private Predicate<Libro> validarLibro = l -> l.getAnioPublicacion() > 1900;

    // Predicate: validar cliente >= 18
    private Predicate<Cliente> validarCliente = c -> c.getEdad() >= 18;

    // Function: transformar libro a resumen
    private Function<Libro, String> resumenLibro = l -> l.getTitulo() + " - $" + l.getPrecio();

    // Consumer: imprimir reporte de ventas
    private Consumer<List<Venta>> reporteVentas = lista -> lista.forEach(System.out::println);

    // Supplier: generar código de venta
    private Supplier<String> generarCodigo = () -> UUID.randomUUID().toString();

    // Registrar libro
    public void registrarLibro(Libro libro) 
    {
        if (validarLibro.test(libro)) 
        {
            libros.add(libro);
        } 
        else 
        {
            System.out.println("+----------- ALERTA LIBROS ------------");
            System.out.println("| El libro '" + libro.getTitulo() + "', no válido. El año debe ser > 1900");
        }
    }

    // Registrar cliente
    public void registrarCliente(Cliente cliente) {
        if (validarCliente.test(cliente)) 
        {
            clientes.add(cliente);
        } 
        else 
        {
            System.out.println("+----------- ALERTA CLIENTES ------------");
            System.out.println("| El cliente '" + cliente.getNombre() + "', debe ser mayor de edad");
        }
    }

    // Registrar venta
    public void registrarVenta(Cliente cliente, Libro libro) 
    {
        if (!clientes.contains(cliente) || !libros.contains(libro)) 
        {
            System.out.println("| >> Cliente o libro no registrado");
            return;
        }
        Venta venta = new Venta(cliente, libro);
        ventas.add(venta);
        cliente.agregarCompra(venta);
        System.out.println("| Venta #" + venta.getIdVenta() + ", registrada con código: " + generarCodigo.get());
    }

    // Mostrar resumen de libros
    public void mostrarResumenLibros() 
    {
        libros.forEach(l -> System.out.println("| " + resumenLibro.apply(l)));
    }

    // Reporte de ventas
    public void mostrarVentas() 
    {
        reporteVentas.accept(ventas);
    }

    // Libro más caro
    public Libro libroMasCaro() 
    {
        return libros.stream()
                .max(Comparator.comparingDouble(Libro::getPrecio))
                .orElse(null);
    }

    // Promedio precios
    public double promedioPrecios() 
    {
        double promedio = libros.stream()
                                .mapToDouble(Libro::getPrecio)
                                .average()
                                .orElse(0);
        return Math.round(promedio * 100.0) / 100.0; // redondea a 2 decimales
    }
}
