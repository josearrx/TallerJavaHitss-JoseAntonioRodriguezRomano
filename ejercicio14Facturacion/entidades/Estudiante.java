package entidades;

public class Estudiante {
    private Integer id;
    private String nombre;
    private double Calificacion;

    public Estudiante(Integer id, String nombre, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        Calificacion = calificacion;
    }
    
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getCalificacion() {
        return Calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{id: '" + id + "', nombre: '" + nombre + "', Calificacion: " + Calificacion + "}";
    }
}
