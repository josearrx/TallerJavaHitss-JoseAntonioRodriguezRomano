package test;

/*
Expresión Lambda que elimine espacios, comas y puntos de una frase y 
además la devuelva la frase convertida en mayúscula.
 */

import interfaces.ExpresionLambda;

public class PruebaLambda {
	public static void main(String[] args) {
		ExpresionLambda limpiarYMayusculas = frase -> frase.replaceAll("[ ,.]+", "").toUpperCase();

		String frase = "Esto es una prueba. Para limpiar y pasar a mayusculas";
		String resultado = limpiarYMayusculas.procesar(frase);
        System.out.println("+-----------------------------------------------------------------------");
		System.out.println("| Frase Inicial: " + frase);
		System.out.println("|   Frase Final: " + resultado);
        System.out.println("+-----------------------------------------------------------------------");
	}
}
