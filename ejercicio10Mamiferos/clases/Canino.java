package clases;

public abstract class Canino extends Mamifero {
    // Atributos
    protected String color;
    private int tamanioColmillos;

    // Constructor
    public Canino(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, int tamanioColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    // Getters
    public String getColor() {
        return color;
    }
    public int getTamanioColmillos() {
        return tamanioColmillos;
    }
}
