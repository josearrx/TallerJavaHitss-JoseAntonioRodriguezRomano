package clases;

public abstract class Felino extends Mamifero {
    // Atributos
    protected double tamanoGarras;
    protected int velocidad;

    // Constructor
   public Felino(String habitad, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    // Getter
    public double getTamanoGarras() {
        return tamanoGarras;
    }
    public int getVelocidad() {
          return velocidad;
     }

}
