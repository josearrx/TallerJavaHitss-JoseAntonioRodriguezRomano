package clases;

public class Transaccion {
    private final int id;   // ID único de la transacción
    private String tipo;    // "Depósito" o "Retiro"
    private double monto;   // Monto de la transacción
    private Cuenta cuenta;  // Cuenta asociada a esta transacción

    // Contador estático para generar IDs únicos automáticamente
    private static int contador = 0;

    // Constructor: crea una transacción y asigna un ID único
    public Transaccion(String tipo, double monto, Cuenta cuenta) {
        this.id = ++contador;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    // Representación en texto de la transacción
    @Override
    public String toString() {
        return "{Transaccion ID=" + id +
               ", Tipo=" + tipo +
               ", Monto=" + monto +
               ", Cuenta ID=" + cuenta.getId() +
               ", Titular=" + cuenta.getTitular() +
               "}";
    }
}
