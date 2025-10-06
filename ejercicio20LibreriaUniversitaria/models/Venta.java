package models;

import java.time.LocalDate;

public class Venta 
{
    // Atributos de la clase
    private static int contador = 1;
    private int idVenta;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;

    public Venta(Cliente cliente, Libro libro) 
    {
        this.idVenta = contador++;
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = LocalDate.now();
    }

    // Metodos getters para acceder a los atributos
    public int getIdVenta() 
    { 
        return idVenta; 
    }
    public Cliente getCliente() 
    { 
        return cliente; 
    }
    public Libro getLibro() 
    { 
        return libro; 
    }
    public LocalDate getFecha() 
    { 
        return fecha; 
    }

    // Sobrescritura del metodo toString
    @Override
    public String toString()
     {
        return  "| Venta #"   + idVenta               + 
                ": "        + cliente.getNombre()   +
                " compró "  + libro.getTitulo()     + 
                " el "      + fecha;
    }
}