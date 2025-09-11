package test;

import exceptions.EdadInvalidaException;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];  // arreglo fijo de 3 alumnos
        Scanner sc = new Scanner(System.in);

        int posicion = 0; // posición actual en el arreglo
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Ingrese nombre del alumno: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese edad del alumno: ");
                int edad = Integer.parseInt(sc.nextLine());

                // Validaciones de edad
                if (edad < 0) {
                    throw new IllegalArgumentException("La edad no puede ser negativa.");
                }
                if (edad < 18) {
                    throw new EdadInvalidaException("El alumno debe ser mayor o igual a 18 años.");
                }

                
                alumnos[posicion] = new Alumno(nombre, edad);
                System.out.println("Alumno registrado con éxito: " + alumnos[posicion]);
                posicion++;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: No se pueden registrar más de 3 alumnos.");
                continuar = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (EdadInvalidaException e) {
                System.out.println("Error personalizado: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }

            // Preguntar si desea seguir
            if (posicion < alumnos.length) {
                System.out.print("¿Desea registrar otro alumno? (s/n): ");
                String opcion = sc.nextLine();
                if (!opcion.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            } else {
                continuar = false;
            }
        }

        // Mostrar los alumnos registrados
        System.out.println("\n📋 Lista final de alumnos:");
        for (Alumno a : alumnos) {
            if (a != null) {
                System.out.println(a);
            }
        }
        sc.close();
    }
}
