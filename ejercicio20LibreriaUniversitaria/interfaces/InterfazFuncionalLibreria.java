package interfaces;

import java.util.UUID;
import java.util.function.*;

public class InterfazFuncionalLibreria 
{
    public static void main(String[] args) 
    {
        // Supplier: Generar UUID
        Supplier<String> generar = () -> UUID.randomUUID().toString();
        System.out.println("UUID: " + generar.get());

        // Predicate: Validar mayor de edad
        Predicate<Integer> esMayorEdad = edad -> edad >= 18;
        System.out.println("¿20 es mayor de edad?: " + esMayorEdad.test(20));

        // Function: Resumir libro (String ejemplo)
        Function<String, String> resumen = titulo -> "Resumen -> " + titulo;
        System.out.println(resumen.apply("Java Básico"));

        // Consumer: Enviar notificación
        Consumer<String> notificar = msg -> System.out.println("MENSAJE: " + msg);
        notificar.accept("Compra registrada con éxito.");
    }
}
