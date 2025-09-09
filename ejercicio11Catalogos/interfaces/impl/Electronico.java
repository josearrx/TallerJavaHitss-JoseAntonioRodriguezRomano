package interfaces.impl;

public abstract class Electronico implements IElectronico {
    protected String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
