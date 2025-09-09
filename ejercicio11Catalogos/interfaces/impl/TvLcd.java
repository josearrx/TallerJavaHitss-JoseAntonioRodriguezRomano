package interfaces.impl;

public class TvLcd extends Electronico implements IProducto {
    private int pulgada;
    private int precio;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(fabricante);
        this.precio = precio;
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.15;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public int getPulgada() {
        return pulgada;
    }
}
