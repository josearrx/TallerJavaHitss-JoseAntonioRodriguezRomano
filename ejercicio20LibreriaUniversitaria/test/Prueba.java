package test;

import models.*;
import services.LibreriaService;

public class Prueba {
    public static void main(String[] args) {
        LibreriaService libreria = new LibreriaService();

        // válidos
        Libro l1 = new Libro("Java Básico", "Autor 1", 2020, 350);
        Libro l2 = new Libro("Python Intermedio", "Autor 2", 2018, 450);
        Libro l3 = new Libro("Cálculo Avanzado", "Autor 3", 2005, 600);
        Libro l4 = new Libro("Bases de Datos", "Autor 4", 2010, 520);
        Libro l5 = new Libro("Redes de Computadoras", "Autor 5", 2015, 700);
        Libro l6 = new Libro("Sistemas Operativos", "Autor 6", 2008, 480);

        // inválido (año < 1900)
        Libro l7 = new Libro("Inteligencia Artificial", "Autor 7", 1899, 900);
        Libro l8 = new Libro("Programación Funcional", "Autor 8", 1800, 400);
        Libro l9 = new Libro("Historia Universal", "Autor 9", 1890, 500);

        libreria.registrarLibro(l1);
        libreria.registrarLibro(l2);
        libreria.registrarLibro(l3);
        libreria.registrarLibro(l4);
        libreria.registrarLibro(l5);
        libreria.registrarLibro(l6);
        libreria.registrarLibro(l7); // mostrar error
        libreria.registrarLibro(l8); // mostrar error
        libreria.registrarLibro(l9); // mostrar error
        System.out.println();

        Cliente c1 = new Cliente("Juan", 20);
        Cliente c2 = new Cliente("Pedro", 16); // inválido
        libreria.registrarCliente(c1);
        libreria.registrarCliente(c2);
        System.out.println();

        System.out.println("+----------- VENTAS REGISTRADAS ------------");
        libreria.registrarVenta(c1, l1);
        libreria.registrarVenta(c1, l2);
        libreria.registrarVenta(c1, l3);
        libreria.registrarVenta(c1, l4);
        libreria.registrarVenta(c1, l5);
        libreria.registrarVenta(c1, l6);
        libreria.registrarVenta(c2, l1); // inválido
        System.out.println();

        System.out.println("+----------- RESUMEN DE LIBROS ------------");
        libreria.mostrarResumenLibros();
        System.out.println();

        System.out.println("+----------- VENTAS ------------");
        libreria.mostrarVentas();
        System.out.println();

        System.out.println("+----------- LIBRO MAS CARO ------------\n| " + libreria.libroMasCaro());
        System.out.println();
        System.out.println("+----------- PROMEDIO DE PRECIOS ------------\n|                $" + libreria.promedioPrecios());
        System.out.println();
    }
}
