package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento; 
    private double salario;
    private int aniosExperiencia;
    private List<Evaluacion> evaluaciones;

    public Empleado(int id, String nombre, String departamento, double salario, int aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
        this.evaluaciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDepartamento() {
        return departamento;
    }
    public double getSalario() {
        return salario;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    // Métodos para manejar evaluaciones
    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
    }

    // Obtener la evaluación más reciente
    public Optional<Evaluacion> getUltimaEvaluacion() {
        return evaluaciones.stream()
                .max(Comparator.comparing(Evaluacion::getAnio));
    }

    // Calcular el promedio de puntajes de evaluaciones
    public double promedioEvaluaciones() {
        return evaluaciones.stream()
                .mapToInt(Evaluacion::getPuntaje)
                .average()
                .orElse(0);
    }

    @Override
    public String toString() {
        return nombre + " (" + departamento + ") - $" + salario + " - Experiencia: " + aniosExperiencia + " años";

    }
}