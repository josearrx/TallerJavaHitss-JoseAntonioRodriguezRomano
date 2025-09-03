package test;

import clases.Mamifero;
import clases.Leon;
import clases.Tigre;
import clases.Guepardo;
import clases.Lobo;
import clases.Perro;

public class TestMain {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon     = new Leon("Sabana Africana", 1.2, 2.1, 190, "Panthera leo", 7.5, 80, 10, 114);
        Mamifero tigre    = new Tigre("Selva India", 1.1f, 2.5f, 220f, "Panthera tigris", 8.0f, 65, "Bengala");
        Mamifero guepardo = new Guepardo("África", 0.9f, 1.5f, 72f, "Acinonyx jubatus", 4.9f, 120);
        Mamifero lobo     = new Lobo("Bosques", 100.0, 150.0, 50.0, "Canis lupus", "gris", 4, 6, "Ártico");
        Mamifero perro    = new Perro("Sabana", 100.0, 60.0, 30.0, "Lycaon pictus", "moteado", 3, 320);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero animal : mamiferos) {
            if (animal != null) {
                System.out.println("Nombre Científico: " + animal.getNombreCientifico());
                System.out.println(animal.comer());
                System.out.println(animal.dormir());
                System.out.println(animal.correr());
                System.out.println(animal.comunicarse());
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
