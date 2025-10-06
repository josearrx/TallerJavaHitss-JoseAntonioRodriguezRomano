package interfaces;

/*
Expresión Lambda que elimine espacios, comas y puntos de una frase y 
además la devuelva la frase convertida en mayúscula.
 */

@FunctionalInterface
public interface ExpresionLambda {
	String procesar(String frase);
}
