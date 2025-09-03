package clases;

public class Tigre extends Felino{
    private String especieTigre;

    // Constructor
    public Tigre(String habitad, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, String especieTigre) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    // Getter
    public String getEspecieTigre() {
        return especieTigre;
    }

    // Métodos
    @Override
    public String comer() {
        return "El Tigre de especie " + especieTigre + " caza sigilosamente en " + habitad;
    }

    @Override
    public String dormir() {
        return "El Tigre duerme bajo la sombra en " + habitad;
    }

    @Override
    public String correr() {
        return "El Tigre puede correr a " + velocidad + " km/h en distancias cortas.";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge fuerte para marcar su territorio.";
    }
}