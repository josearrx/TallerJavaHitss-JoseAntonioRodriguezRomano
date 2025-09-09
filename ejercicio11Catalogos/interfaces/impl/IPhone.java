package interfaces.impl;

public class IPhone extends Electronico implements IProducto {
    private String modelo;
    private String color;
    private int precio;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(fabricante);
        this.precio = precio;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.20;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
}
