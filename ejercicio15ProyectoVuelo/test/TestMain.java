package test;

import clases.Vuelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class TestMain {

    public static void main(String[] args) {
        List <Vuelo> vuelos = new ArrayList<>();

        //Datos de tabla
        vuelos.add(new Vuelo("AAL 933 " , "New York         ", "Santiago", LocalDate.of(2021,8,29), LocalTime.of(5,39) , 62));
        vuelos.add(new Vuelo("LAT 755 " , "Sao Paulo        ", "Santiago", LocalDate.of(2021,8,31), LocalTime.of(7,45) , 47));
        vuelos.add(new Vuelo("LAT 800 " , "Rio De Janeiro   ", "Santiago", LocalDate.of(2021,8,30), LocalTime.of(8,0)  , 52));
        vuelos.add(new Vuelo("DAL 147 " , "Atlanta          ", "Santiago", LocalDate.of(2021,8,29), LocalTime.of(8,22) , 59));
        vuelos.add(new Vuelo("AVA 241 " , "Bogota           ", "Santiago", LocalDate.of(2021,8,31), LocalTime.of(14,5) , 25));
        vuelos.add(new Vuelo("AMX 10  " , "Mexico City      ", "Santiago", LocalDate.of(2021,8,31), LocalTime.of(2,45) , 29));
        vuelos.add(new Vuelo("IBE 6833" , "Londres          ", "Santiago", LocalDate.of(2021,8,30), LocalTime.of(8,45) , 55));
        vuelos.add(new Vuelo("LAT 2479" , "Frankfurt        ", "Santiago", LocalDate.of(2021,8,29), LocalTime.of(9,15) , 51));
        vuelos.add(new Vuelo("SKU 803 " , "Lima             ", "Santiago", LocalDate.of(2021,8,30), LocalTime.of(9,57) , 48));
        vuelos.add(new Vuelo("LAT 533 " , "Los Ángeles      ", "Santiago", LocalDate.of(2021,8,29), LocalTime.of(10,19), 59));
        vuelos.add(new Vuelo("LAT 1447" , "Guayaquil        ", "Santiago", LocalDate.of(2021,8,31), LocalTime.of(10,35), 31));
        vuelos.add(new Vuelo("CMP 111 " , "Panama City      ", "Santiago", LocalDate.of(2021,8,31), LocalTime.of(15,15), 29));
        vuelos.add(new Vuelo("LAT 705 " , "Madrid           ", "Santiago", LocalDate.of(2021,8,30), LocalTime.of(10,47), 47));
        vuelos.add(new Vuelo("ALL 957 " , "Miami            ", "Santiago", LocalDate.of(2021,8,29), LocalTime.of(11,0) , 30));
        vuelos.add(new Vuelo("ARG 5091" , "Buenos Aires     ", "Santiago", LocalDate.of(2021,8,31), LocalTime.of(11,21), 32));
        vuelos.add(new Vuelo("LAT 1283" , "Cancún           ", "Santiago", LocalDate.of(2021,8,31), LocalTime.of(11,35), 35));
        vuelos.add(new Vuelo("LAT 579 " , "Barcelona        ", "Santiago", LocalDate.of(2021,8,29), LocalTime.of(11,52), 61));
        vuelos.add(new Vuelo("AAL 945 " , "Dallas-Fort Worth", "Santiago", LocalDate.of(2021,8,30), LocalTime.of(12,17), 58));
        vuelos.add(new Vuelo("UAL 818 " , "Paris            ", "Santiago", LocalDate.of(2021,8,29), LocalTime.of(12,47), 54));
        vuelos.add(new Vuelo("LAT 405 " , "Montevideo       ", "Santiago", LocalDate.of(2021,8,30), LocalTime.of(15,45), 39));

        //1 - ordenar por fecha / hora de llegada ascendente 
        vuelos.sort(Comparator.comparing(Vuelo::getFechaHoraLlegada));
        System.out.println("======= Vuelos ordenados por fecha/hora de llegada ascendente =======");
        System.out.println("---------------------------------------------------------------------");
        vuelos.forEach(System.out::println);
        System.out.println();

        //2 - Ultimo vuelo en llegar
        System.out.println("======= Ultimo vuelo en llegar =======");
        System.out.println("--------------------------------------");
        Vuelo ultimoVuelo = vuelos.get(vuelos.size()-1);
        // System.out.println(vuelos.get(vuelos.size()-1));
        System.out.println("El ultimo vuelo en llegar es: " + ultimoVuelo.getNombre() +
                            " : "                           + ultimoVuelo.getOrigen() +
                            ", aterriza el: "                     + ultimoVuelo.getFechaHoraLlegada());
        System.out.println();
        //3 - Vuelo con menor numero de pasajeros
        System.out.println("======= Vuelo con menor numero de pasajeros =======");
        System.out.println("---------------------------------------------------");
        Vuelo menorPasajeros = Collections.min (vuelos, Comparator.comparing(Vuelo::getNumeroPasajeros)); 
        // System.out.println(Collections.min (vuelos, Comparator.comparing(Vuelo::getNumeroPasajeros)));
        System.out.println("El vuelo con menor numero de pasajeros es: " + menorPasajeros.getNombre() +
                            " : "                           + menorPasajeros.getOrigen() +
                            ", con "                        + menorPasajeros.getNumeroPasajeros() + " pasajeros.");
        System.out.println();
        System.out.println();
    }


}
