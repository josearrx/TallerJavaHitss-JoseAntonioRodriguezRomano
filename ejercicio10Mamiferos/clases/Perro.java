package clases;

public class Perro extends Canino {

    

    private int fuerzaMordida;

    // Constructor
    public Perro(String habitad, double altura, double largo, double peso, String nombreCientifico, String color,
            int tamanioColmillos, int fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() { return fuerzaMordida; }

    @Override
    public String comer() {
        return "El Perro salvaje africano caza en grupo en " + habitad;
    }

    @Override
    public String dormir() {
        return "El Perro " + color + " duerme cerca de su manada en " + habitad;
    }

    @Override
    public String correr() {
        return "El Perro corre velozmente en manada para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El Perro emite gruñidos y chillidos para comunicarse.";
    }
}
