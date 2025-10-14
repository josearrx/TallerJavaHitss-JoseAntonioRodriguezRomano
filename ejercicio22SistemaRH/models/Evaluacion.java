package models;

public class Evaluacion {
    private int anio;
    private int puntaje;

    public Evaluacion(int anio, int puntaje) {
        this.anio = anio;
        this.puntaje = puntaje;
    }

    public int getAnio() {
        return anio;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Evaluacion {" +
                "Año: " + anio +
                " - Puntaje=" + puntaje +
                '}';
    }
}
