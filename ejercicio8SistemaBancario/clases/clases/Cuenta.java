package clases;

public class Cuenta {
    private final int id;   // ID único de la cuenta
    private String titular; // Nombre del titular de la cuenta
    private double saldo;   // Saldo actual

    // Contador estático para generar IDs únicos automáticamente
    private static int contador = 0;

    // Constructor: se crea una cuenta con titular y saldo inicial
    public Cuenta(String titular, double saldoInicial) {
        this.id = ++contador; // Genera ID único (incrementa contador)
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // -------- Operaciones bancarias ---------

    // Método para depositar dinero en la cuenta
    public void depositar(double monto) {
        saldo += monto;
    }

    // Método para retirar dinero (solo si hay saldo suficiente)
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true; // Retiro exitoso
        }
        return false; // Retiro fallido (saldo insuficiente)
    }

    // Representación en texto de la cuenta
    @Override
    public String toString() {
        return "{Cuenta ID="    + id        +
               ", Titular="     + titular   +
               ", Saldo="       + saldo     +
               "}";
    }
}