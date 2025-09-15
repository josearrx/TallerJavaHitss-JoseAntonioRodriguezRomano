package test;

import genericos.*;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

import entidades.*;

//Sistema de facturación
    //Entidades: Cliente, Producto, Factura
    //Servicio Generico que va a manejar un ID unico -> Todas la entidades que extiendan o implementen Identificables
    // -> Guardar entidades
    // -> Listar las entidades
    // -> Buscar por ID
    // -> Actualizar por ID
    // -> Eliminar por ID

    //Una interfaz generica Identificable

    //Problema: Escribir y leer un archivo donde se guarden el detalle de la factura
public class Facturacion {
    public static void main(String[] args) {
        /*
        Una clase con metodos staticos, los cuales son:
        -> 1. Guardar en un archivo la factura, con la siguiente nomenclatura
            en el nombre del archivo: "factura_" + idFactura + ".txt" recordando que todas las facturas
            se guanrdan en una carpeta llamada "facturas"

        -> 2. Leer la factura y mostrar su contenido en consola
        -> 3. Listar los nombres de todas las facturas existentes en la carpeta "facturas"
       */


        //Servicios
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Integer> facturaServicio = new ServicioGenerico<>();
        //No se acepta la entidad Estudiante porque no implementa Identificable
        // ServicioGenerico<Estudiante, Integer> estudianteServicio = new ServicioGenerico<>();

        //Clientes
        Cliente cliente1 = new Cliente("C001", "Jose Antonio");
        Cliente cliente2 = new Cliente("C002", "Maria Gomez");
        Cliente cliente3 = new Cliente("C003", "Carlos Sanchez");

        //Guardar clientes
        System.out.println("+------- Guardando clientes -------+");
        clienteServicio.guardarSinDuplicados(cliente1);
        clienteServicio.guardarSinDuplicados(cliente2);
        clienteServicio.guardarSinDuplicados(cliente3);
        clienteServicio.guardarSinDuplicados(cliente1); //Intento de guardar un cliente duplicado
        System.out.println();

        //Productos
        Producto producto1 = new Producto(101, "Laptop", 1500.00);
        Producto producto2 = new Producto(102, "Smartphone", 800.00);
        Producto producto3 = new Producto(103, "Tablet", 400.00);
        Producto producto4 = new Producto(104, "Monitor", 300.00);


        //Guardar productos
        System.out.println("+------- Guardando productos -------+");
        productoServicio.guardarSinDuplicados(producto1);
        productoServicio.guardarSinDuplicados(producto2);
        productoServicio.guardarSinDuplicados(producto3);
        productoServicio.guardarSinDuplicados(producto4);
        productoServicio.guardarSinDuplicados(producto1); //Intento de guardar un producto duplicado
        System.out.println();

        //facturas
        // List<Producto> nuevaLista = new ArrayList<>(Arrays.asList(producto1, producto2, producto3)); // Crear una nueva lista con los productos existentes
        Factura factura1 = new Factura(1, cliente1, Arrays.asList(producto1,producto2));
        Factura factura2 = new Factura(2, cliente2, Arrays.asList(producto1,producto2, producto3));

        //Guardar facturas
        System.out.println("+------- Guardando facturas -------+");
        facturaServicio.guardarSinDuplicados(factura1);
        facturaServicio.guardarSinDuplicados(factura2);
        facturaServicio.guardarSinDuplicados(factura1); //Intento de guardar una factura duplicada
        System.out.println();


        //Buscar cliente por ID
        System.out.println("Buscando cliente por ID 'C002':");
        System.out.println(clienteServicio.buscarPorId("C002"));
        System.out.println();
        //Actualizar cliente por ID
        System.out.println("Actualizando cliente por ID 'C003':");
        Cliente clienteActualizado = new Cliente("C003", "Carlos M. Sanchez");
        clienteServicio.actualizarPorId("C003", clienteActualizado);
        System.out.println();
        //Eliminar cliente por ID
        System.out.println("Eliminando cliente por ID 'C001':");
        clienteServicio.eliminarPorId("C001");

        System.out.println();
        //Listar clientes despues de eliminar
        System.out.println("Lista de clientes despues de eliminar:");
        for (Cliente cliente : clienteServicio.listarTodos()) {
            System.out.println(cliente);
        }
        System.out.println("--------------------------------------------------");
    
        //Ticket de la factura
        System.out.println("+------- Generando ticket de la factura 1 -------+");
        System.out.println(factura1.generarTicket());
        System.out.println("+------- Generando ticket de la factura 2 -------+");
        System.out.println(factura2.generarTicket());

        System.out.println("--------------------------------------------------");

        //Guardar en un archivo la factura
        System.out.println("+------- Guardando factura 1 en archivo -------+");
        Factura.guardarFacturaEnArchivo(factura1);
        System.out.println("\n+------- Guardando factura 2 en archivo -------+");
        Factura.guardarFacturaEnArchivo(factura2);

        System.out.println("\n--------------------------------------------------");

        //Leer la factura desde un archivo
        System.out.println("+------- Leyendo factura_1.txt desde consola -------+");
        Factura.leerFacturaDesdeArchivo("1");
        System.out.println("+------- Leyendo factura_2.txt desde consola -------+");
        Factura.leerFacturaDesdeArchivo("2");

        System.out.println("--------------------------------------------------");
        
        //Listar los nombres de todas las facturas existentes en la carpeta "facturas"
        System.out.println("+------- Listando todas las facturas en la carpeta 'facturas' -------+");
        Factura.listarFacturasEnCarpeta("C:\\Users\\josea\\OneDrive\\Escritorio\\HITSS_DOC\\ejercicio14Facturacion\\facturas\\");
        System.out.println("--------------------------------------------------");
        




///////////////////////////////////////////////////////////////////////////////

        // //Listar clientes
        // System.out.println("Lista de clientes:");
        // for (Cliente cliente : clienteServicio.listarTodos()) {
        //     System.out.println(cliente);
        // }
        // System.out.println();
        // //Buscar cliente por ID
        // System.out.println("Buscar cliente por ID 'C002':");
        // System.out.println(clienteServicio.buscarPorId("C002"));
        // System.out.println();
        // //Actualizar cliente por ID
        // System.out.println("Actualizar cliente por ID 'C003':");
        // Cliente clienteActualizado = new Cliente("C003", "Carlos M. Sanchez");
        // clienteServicio.actualizarPorId("C003", clienteActualizado);
        // System.out.println();
        // //Eliminar cliente por ID
        // System.out.println("Eliminar cliente por ID 'C001':");
        // clienteServicio.eliminarPorId("C001");
        // System.out.println();
        // //Listar clientes despues de eliminar
        // System.out.println("Lista de clientes despues de eliminar:");
        // for (Cliente cliente : clienteServicio.listarTodos()) {
        //     System.out.println(cliente);
        // }
        System.out.println("--------------------------------------------------");
    }
}