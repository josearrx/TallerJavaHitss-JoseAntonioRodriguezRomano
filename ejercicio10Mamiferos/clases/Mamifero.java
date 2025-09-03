package clases;

public abstract class Mamifero {
    // Atributos
    protected String habitad;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    // Constructor
    public Mamifero(String habitad, double altura, double largo, double peso, String nombreCientifico) {
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    //Getters
    public String getHabitad() {
        return habitad;
    }
    public double getAltura() {
        return altura;
    }
    public double getLargo() {
        return largo;
    }
    public double getPeso() {
        return peso;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    // Métodos abstractos
    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();
}
