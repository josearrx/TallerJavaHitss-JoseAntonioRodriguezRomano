package models;

import java.util.Objects;

public class Producto {
    private int sku;
    private String nombre;
    private String categoria;
    private int stock;

    public Producto(int sku, String nombre, String categoria, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public int getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return sku == producto.sku; // igualdad por SKU
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    @Override
    public String toString() {
        return "SKU: " + sku +
               ", Nombre: " + nombre +
               ", Categoría: " + categoria +
               ", Stock: " + stock;
    }
}