package test;

import genericos.*;

public class TestMain {
    public static void main(String[] args) {
        // Bolsas con genéricos
        Bolsa<Lacteo> bolsaLacteo = new Bolsa<>();
        Bolsa<Fruta> bolsaFruta = new Bolsa<>();
        Bolsa<Limpieza> bolsaLimpieza = new Bolsa<>();
        Bolsa<NoPerecible> bolsaNoPerecible = new Bolsa<>();

        // Agregar productos
        bolsaLacteo.add(new Lacteo("Leche Alpura", 25.5, 1, 8));
        bolsaLacteo.add(new Lacteo("Yogurt Danone", 15.0, 2, 6));
        bolsaLacteo.add(new Lacteo("Queso Oaxaca", 50.0, 1, 20)); 
        bolsaLacteo.add(new Lacteo("Crema Lala", 30.0, 1, 5));
        bolsaLacteo.add(new Lacteo("Mantequilla", 40.0, 1, 1));
        bolsaLacteo.add(new Lacteo("Extra Leche", 60.0, 1, 10)); // No se agrega, bolsa llena

        bolsaFruta.add(new Fruta("Manzana", 10.0, 0.5, "Roja"));
        bolsaFruta.add(new Fruta("Plátano", 8.0, 1.2, "Amarillo"));
        bolsaFruta.add(new Fruta("Uvas", 15.0, 0.3, "Morado"));
        bolsaFruta.add(new Fruta("Naranja", 12.0, 0.4, "Naranja"));
        bolsaFruta.add(new Fruta("Pera", 14.0, 0.6, "Verde"));
        bolsaFruta.add(new Fruta("Extra Fruta", 20.0, 0.7, "Mixto")); // No se agrega, bolsa llena

        bolsaLimpieza.add(new Limpieza("Cloro", 30.0, "Hipoclorito", 1.0));
        bolsaLimpieza.add(new Limpieza("Jabón Zote", 12.0, "Grasa animal", 0.3));
        bolsaLimpieza.add(new Limpieza("Detergente", 25.0, "Surfactantes", 0.5));
        bolsaLimpieza.add(new Limpieza("Limpiador Multiusos", 20.0, "Alcohol, fragancia", 0.7));
        bolsaLimpieza.add(new Limpieza("Suavizante", 18.0, "Acondicionadores", 1.2));
        bolsaLimpieza.add(new Limpieza("Extra Limpieza", 22.0, "Químicos", 0.8)); // No se agrega, bolsa llena

        bolsaNoPerecible.add(new NoPerecible("Atún", 18.5, 140, 250));
        bolsaNoPerecible.add(new NoPerecible("Arroz", 20.0, 1000, 350));
        bolsaNoPerecible.add(new NoPerecible("Frijoles", 22.0, 900, 300));
        bolsaNoPerecible.add(new NoPerecible("Sardinas", 15.0, 120, 200));
        bolsaNoPerecible.add(new NoPerecible("Chiles enlatados", 25.0, 200, 150));
        bolsaNoPerecible.add(new NoPerecible("Extra No Perecible", 30.0, 500, 400)); // No se agrega, bolsa llena

        // Mostrar información de cada bolsa
        System.out.println("=== Bolsa de Lácteos ===");
        for (Lacteo l : bolsaLacteo.getElementos()) {
            System.out.println("Nombre: " + l.getNombre() +
                               ", Precio: " + l.getPrecio() +
                               ", Cantidad: " + l.getCantidad() +
                               ", Proteínas: " + l.getProteinas());
        }

        System.out.println("\n=== Bolsa de Frutas ===");
        for (Fruta f : bolsaFruta.getElementos()) {
            System.out.println("Nombre: " + f.getNombre() +
                               ", Precio: " + f.getPrecio() +
                               ", Peso: " + f.getPeso() +
                               ", Color: " + f.getColor());
        }

        System.out.println("\n=== Bolsa de Limpieza ===");
        for (Limpieza li : bolsaLimpieza.getElementos()) {
            System.out.println("Nombre: " + li.getNombre() +
                               ", Precio: " + li.getPrecio() +
                               ", Componentes: " + li.getComponentes() +
                               ", Litros: " + li.getLitros());
        }

        System.out.println("\n=== Bolsa de No Perecibles ===");
        for (NoPerecible np : bolsaNoPerecible.getElementos()) {
            System.out.println("Nombre: " + np.getNombre() +
                               ", Precio: " + np.getPrecio() +
                               ", Contenido: " + np.getContenido() +
                               ", Calorías: " + np.getCalorias());
        }
    }
}
