package clases;

public class Leon extends Felino {
    // Atributos
    private int numManada;
    private double potenciaRugidoDecibel;

    // Constructor
    public Leon(String habitad, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    //Getters
    public int getNumManada() {
        return numManada;
    }
    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    // Métodos
    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " leones, en " + habitad;
    }

    @Override
    public String dormir() {
        return "El León duerme en las llanuras de " + habitad;
    }

    @Override
    public String correr() {
        return "El León corre a " + velocidad + " km/h para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " decibeles.";
    } 
}