package clases;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    // Constructor
    public Lobo(String habitad, double altura, double largo, double peso, String nombreCientifico, String color,
            int tamanioColmillos, int numCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    // Getters
    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    // Métodos
    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza junto a su manada.";
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cavernas de " + habitad;
    }

    @Override
    public String correr() {
        return "El Lobo recorre grandes distancias corriendo en " + habitad;
    }

    @Override
    public String comunicarse() {
        return "El Lobo aúlla para comunicarse con su manada.";
    }
}
