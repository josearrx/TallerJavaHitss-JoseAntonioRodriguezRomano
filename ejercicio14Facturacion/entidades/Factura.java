package entidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import genericos.Identificable;

public class Factura implements Identificable<Integer>{
    private Integer id;
    private Cliente cliente;
    private List<Producto> productos;
    
    public Factura(Integer id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
    }
    
    // @Override
    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProducto() {
        return productos;
    }

    //Metodo dinamico para agregar un producto a la lista de productos
    public void agregarElemento(Producto nuevoProducto) {
        productos.add(nuevoProducto);
        System.out.println("Producto agregado: " + nuevoProducto);
    }

    //Eliminar un producto de la lista de productos por ID
    public boolean eliminarProducto(int id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {  //get(i) obtiene el elemento en la posicion i
                Producto producto = productos.remove(i);                    //remove(i) elimina el elemento en la posicion i
                System.out.println("Producto eliminado: " + producto);
                return true; // Elemento eliminado exitosamente
            }
        }
        System.out.println("Producto con ID: " + id + ", no encontrado.");
        return false;
    }

    //Metodo para calcular el total de la factura sumando los precios de los productos
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        // System.out.println("Total de la factura: " + total);
        return total;
    }

    //Generar el ticket de la factura
    public String generarTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("Factura ID: ").append(id).append("\n");
        ticket.append("Cliente: ").append(cliente.getNombre()).append(" (ID: ").append(cliente.getId()).append(")\n");
        ticket.append("Productos:\n");
        for (Producto producto : productos) {
            ticket.append("- ").append(producto.getDescripcion())
                  .append(" (ID: ").append(producto.getId())
                  .append(", Precio: $").append(producto.getPrecio()).append(")\n");
        }
        ticket.append("Total: $").append(calcularTotal()).append("\n");
        return ticket.toString();
    }

    //Metodo estatico para Guardar en un archivo la factura, con la siguiente nomenclatura en el nombre del archivo: "factura_" + idFactura + ".txt"
    public static void guardarFacturaEnArchivo(Factura factura) {
        
        String nombreArchivo = "facturas/factura_" + factura.getId() + ".txt";
        
        // Se usa un BufferedWriter junto con FileWriter para escribir texto en el archivo.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) { 
            writer.write(factura.generarTicket());// Se escribe en el archivo el contenido generado por el método generarTicket() de la factura.
            System.out.print("Factura guardada en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            // Si ocurre algún error de entrada/salida (por ejemplo, la carpeta no existe), se muestra el error en consola.
            System.out.println("Error al guardar la factura en el archivo: " + e.getMessage());
        }
    }

    //Metodo Statico para leer la factura y mostrar su contenido en consola
    public static void leerFacturaDesdeArchivo(String idFactura) {
        String nombreArchivo = "C:\\Users\\josea\\OneDrive\\Escritorio\\HITSS_DOC\\ejercicio14Facturacion\\facturas\\factura_" + idFactura + ".txt";

        try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File(nombreArchivo))) {// Se crea un Scanner para leer línea por línea el contenido del archivo.
            while (scanner.hasNextLine()) {// Mientras haya más líneas en el archivo...
                System.out.println(scanner.nextLine());// Se imprime cada línea de la factura en consola.
            }
        } catch (IOException e) {
            System.out.println("Error al leer la factura desde el archivo: " + e.getMessage());
        }
    }


    //Metodo estatico para listar todas las facturas dentro de una carpeta
    public static void listarFacturasEnCarpeta(String rutaCarpeta) {
        java.io.File carpeta = new java.io.File(rutaCarpeta);//Se crea un objeto File que representa la carpeta indicada por la ruta.
        String[] archivos = carpeta.list((dir, name) -> name.startsWith("factura_") && name.endsWith(".txt"));// Se listan los archivos de la carpeta que empiecen con "factura_" y terminen en ".txt".
        
        if (archivos != null && archivos.length > 0) {// Si la lista no es nula y contiene archivos...
            for (String archivo : archivos) {// Se recorren los archivos encontrados y se imprime cada uno en consola.
                System.out.println("- " + archivo);
            }
        } else {
            System.out.println("No hay facturas existentes en la carpeta 'facturas'.");
        }
    }


    @Override
    public String toString() {
        return "Factura{id: '" + id + 
                "', cliente: " + cliente +
                ", productos: " + productos +
                ", total: " + calcularTotal() +
                "}";
    }


}