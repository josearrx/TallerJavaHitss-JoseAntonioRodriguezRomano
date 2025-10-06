package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime FechaHoraLlegada;
    private int numeroPasajeros;

    // Constructor correcto
    public Vuelo(   String nombre, 
                    String origen, 
                    String destino,
                    LocalDate fecha, 
                    LocalTime hora, 
                    int numeroPasajeros) 
    {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.FechaHoraLlegada = LocalDateTime.of(fecha, hora);
        this.numeroPasajeros = numeroPasajeros;
    }

    // Getters 
    public String getNombre() 
    { 
        return nombre; 
    }
    public String getOrigen() 
    { 
        return origen; 
    }
    public String getDestino() 
    { 
        return destino; 
    }
    public LocalDateTime getFechaHoraLlegada() 
    { 
        return FechaHoraLlegada; 
    }
    public int getNumeroPasajeros() 
    { 
        return numeroPasajeros; 
    }

    //Sobreescritura
    @Override
    public String toString() {
        return "Vuelo {"             +
                "nombre='"           + this.nombre + '\''   +
                ", origen='"         + this.origen + '\''   +
                ", destino='"        + this.destino + '\''  +
                ", duracion="        + this.FechaHoraLlegada +
                ", numeroPasajeros=" + this.numeroPasajeros +
                '}';
    }

    
}
