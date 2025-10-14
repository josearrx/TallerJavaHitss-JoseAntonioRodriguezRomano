package test;
import java.util.List;

import models.*;

public class PruebaRH {
    public static void main(String[] args) {
        /*
        Requisitos empresariales
        1. Listar todos los empleados de un departamento específico (ej: "IT"), ordenados alfabéticamente.
        2. Calcular el salario promedio por departamento.
        3. Obtener el empleado con mayor salario en toda la empresa.
        4. Listar todos los empleados con más de 5 años de experiencia y salario mayor a 50,000.
        5. Obtener el top 3 de empleados con mejor puntaje en la última evaluación (último año).
        6. Contar cuántos empleados tienen al menos una evaluación superior a 90 puntos.
        7. Generar un ranking de promedio de puntajes por empleado.
         */

        //Empleados 
        Empleado empleado1 = new Empleado(1, "Juan Perez", "TI", 6000, 6);
        Empleado empleado2 = new Empleado(2, "Ana Gomez", "RH", 5500, 4);
        Empleado empleado3 = new Empleado(3, "Luis Martinez", "TI", 7000, 8);
        Empleado empleado4 = new Empleado(4, "Maria Rodriguez", "Financiera", 6500, 7);
        Empleado empleado5 = new Empleado(5, "Carlos Sanchez", "TI", 4800, 3);
        Empleado empleado6 = new Empleado(6, "Sofia Lopez", "RH", 5200, 5);

        //Evaluaciones 
        empleado1.agregarEvaluacion(new Evaluacion(2022, 85));
        empleado1.agregarEvaluacion(new Evaluacion(2023, 90));

        empleado2.agregarEvaluacion(new Evaluacion(2022, 88));
        empleado2.agregarEvaluacion(new Evaluacion(2023, 92));

        empleado3.agregarEvaluacion(new Evaluacion(2022, 95));
        empleado3.agregarEvaluacion(new Evaluacion(2023, 93));

        empleado4.agregarEvaluacion(new Evaluacion(2022, 80));
        empleado4.agregarEvaluacion(new Evaluacion(2023, 85));

        empleado5.agregarEvaluacion(new Evaluacion(2022, 70));
        empleado5.agregarEvaluacion(new Evaluacion(2023, 75));

        empleado6.agregarEvaluacion(new Evaluacion(2022, 90));
        empleado6.agregarEvaluacion(new Evaluacion(2023, 95));

        //Array de empleados
        List<Empleado> empleados = List.of(empleado1, empleado2, empleado3, empleado4, empleado5, empleado6);

        //1. Listar todos los empleados de un departamento específico (ej: "IT"), ordenados alfabéticamente.
        System.out.println("+=== 1. Empleados del departamento TI ordenados alfabéticamente ===+");
        empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase("TI"))
                .sorted((e1, e2) -> e1.getNombre().compareToIgnoreCase(e2.getNombre()))
                .forEach(System.out::println);
        System.out.println();

        //2. Calcular el salario promedio por departamento.
        System.out.println("+=== 2. Salario promedio por departamento ===+");
        empleados.stream()
                .collect(java.util.stream.Collectors.groupingBy(Empleado::getDepartamento,
                        java.util.stream.Collectors.averagingDouble(Empleado::getSalario)))
                .forEach((dept, avgSal) -> System.out.println(dept + ": $" + String.format("%.2f", avgSal)));
        System.out.println();

        //3. Obtener el empleado con mayor salario en toda la empresa.
        System.out.println("+=== 3. Empleado con mayor salario ===+");
        empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()))
                .ifPresent(e -> System.out.println("Empleado con mayor salario: " + e));
        System.out.println();

        //4. Listar todos los empleados con más de 5 años de experiencia y salario mayor a 50,000.
        System.out.println("+=== 4. Empleados con más de 5 años de experiencia y salario mayor a 5000 ===+");
        empleados.stream()
                .filter(e -> e.getAniosExperiencia() > 5 && e.getSalario() > 5000)
                .forEach(System.out::println);
        System.out.println();

        //5. Obtener el top 3 de empleados con mejor puntaje en la última evaluación (último año).
        System.out.println("+=== 5. Top 3 empleados con mejor puntaje en la última evaluación ===+");
        empleados.stream()
                .filter(e -> e.getUltimaEvaluacion().isPresent())
                .sorted((e1, e2) -> Integer.compare(e2.getUltimaEvaluacion().get().getPuntaje(),
                        e1.getUltimaEvaluacion().get().getPuntaje()))
                .limit(3)
                .forEach(e -> System.out.println(e.getNombre() + " - Puntaje: " + e.getUltimaEvaluacion().get().getPuntaje()));
        System.out.println();

        //6. Contar cuántos empleados tienen al menos una evaluación superior a 90 puntos.
        System.out.println("+=== 6. Cantidad de empleados con al menos una evaluación superior a 90 puntos ===+");
        long count = empleados.stream()
                .filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
                .count();
        System.out.println("Cantidad de empleados con evaluación superior a 90 puntos: " + count);
        System.out.println();

        //7. Generar un ranking de promedio de puntajes por empleado.
        System.out.println("+=== 7. Ranking de promedio de puntajes por empleado ===+");
        empleados.stream()
                .sorted((e1, e2) -> Double.compare(e2.promedioEvaluaciones(), e1.promedioEvaluaciones()))
                .forEach(e -> System.out.println(e.getNombre() + " - Promedio Puntaje: " + String.format("%.2f", e.promedioEvaluaciones())));
        System.out.println();
    }
}
