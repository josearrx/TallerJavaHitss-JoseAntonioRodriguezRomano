package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente 
{
    // Atributos
    private String nombre;
    private int edad;
    private List<Venta> historial = new ArrayList<>();

    // Constructor
    public Cliente(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos getters para acceder a los atributos
    public String getNombre() 
    { 
        return nombre; 
    }
    public int getEdad() 
    { 
        return edad; 
    }
    public List<Venta> getHistorial() 
    { 
        return historial; 
    }

    // Metodo para agregar una compra
    public void agregarCompra(Venta venta) 
    {
        historial.add(venta);
    }
 
    // Sobrescritura del metodo toString
    @Override
    public String toString() 
    {
        return  "Cliente: " + nombre    + 
                " (Edad: "  + edad      + 
                ")";
    }
}