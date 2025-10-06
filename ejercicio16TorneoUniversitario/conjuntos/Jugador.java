package conjuntos;

import java.util.*;

public class Jugador {
	private int id;
    private String nombre;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

     @Override
    public String toString() {
        return "| Jugador {"    +
                "id="           + id        +
                ", nombre='"    + nombre    + '\'' +
                '}';
    }
}
