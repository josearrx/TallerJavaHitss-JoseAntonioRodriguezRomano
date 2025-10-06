package models;

public class Libro 
{
    // Atributos
    private static int contador = 1;
    private int id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private double precio;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion, double precio) 
    {
        this.id = contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    // Metodos getters para acceder a los atributos
    public int getId() 
    { 
        return id; 
    }
    public String getTitulo() 
    { 
        return titulo; 
    }
    public String getAutor() 
    { 
        return autor; 
    }
    public int getAnioPublicacion() 
    { 
        return anioPublicacion; 
    }
    public double getPrecio() 
    { 
        return precio; 
    }
 
    // Sobrescritura del metodo toString
    @Override
    public String toString() 
    {
        // 01 - El Senor de los Anillos (1954) - Tolkien, $49.99
        return "#" +id + " - " + titulo + " (" + anioPublicacion + ") - " + autor + ", $" + precio;
    }
}