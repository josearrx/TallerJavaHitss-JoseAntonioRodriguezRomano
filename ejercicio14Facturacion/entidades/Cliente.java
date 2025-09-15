package entidades;

import genericos.Identificable;

public class Cliente implements Identificable<String> { // Implementa la interfaz Identificable con ID de tipo String
    private String id;
    private String nombre;

    public Cliente(String id, String nombre) { // Constructor para inicializar el cliente con id y nombre
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getId() { // Implementación del método getId de la interfaz Identificable
    return id;
    }  

    public String getNombre() { // Método para obtener el nombre del cliente
        return nombre;
    }
    
    @Override
    public String toString() { // Sobrescribimos el método toString para mostrar la información del cliente
        return "Cliente{id: '" + id + "', nombre: '" + nombre + "'}";
    }   
}
