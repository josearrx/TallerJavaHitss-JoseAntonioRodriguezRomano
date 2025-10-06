package test;

import java.util.*;

import interfaces.ExprecionLambda;

public class PruebaLambda {
    public static void main(String[] args) 
    {
        ExprecionLambda masRepetida = frase -> {
            String[] palabras = frase.toLowerCase().replaceAll("[.,]", "").split("\\s+");
            Map<String, Integer> contador = new HashMap<>();
            for (String palabra : palabras) {
                contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
            }
            String mas = null;
            int max = 0;
            for (Map.Entry<String, Integer> entry : contador.entrySet()) {
                if (entry.getValue() > max) {
                    mas = entry.getKey();
                    max = entry.getValue();
                }
            }
            Map<String, Integer> resultado = new HashMap<>();
            if (mas != null) resultado.put(mas, max);
            return resultado;
        };

        String frase = "Hola mundo hola prueba mundo hola";
        Map<String, Integer> resultado = masRepetida.PalabraMasRepetida(frase);
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| Frase: " + frase);
        System.out.println("|-------------------------------------------------------------|");
        // Mostrar resultado iterando el map
        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
            System.out.println("| Palabra más repetida es '" + entry.getKey() + "' y se repite " + entry.getValue() + " veces");
        }
        // // O bien obtener el primer elemento
        // if (!resultado.isEmpty()) {
        //     String palabra = resultado.keySet().iterator().next();
        //     System.out.println("| Primera palabra más repetida: " + palabra + ", veces: " + resultado.get(palabra));
        // }
        System.out.println("+-------------------------------------------------------------+");
    }
}