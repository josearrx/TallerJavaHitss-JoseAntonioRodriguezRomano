package clases;

public class Guepardo extends Felino {
    
    // Constructor
     public Guepardo(String habitad, double altura, double largo, double peso, String nombreCientifico,
                    double tamanoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    // Métodos
    @Override
    public String comer() {
        return "El Guepardo caza con rapidez en " + habitad;
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme bajo la sombra para recuperar energías.";
    }

    @Override
    public String correr() {
        return "El Guepardo alcanza hasta " + velocidad + " km/h en carrera.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo emite sonidos agudos para comunicarse.";
    }
}
