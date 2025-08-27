package test;

import clases.Cuenta;
import clases.Transaccion;
import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        // Lista de cuentas
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        // Historial de transacciones
        ArrayList<Transaccion> transacciones = new ArrayList<>();

        System.out.println("---------- Creación de cuentas ----------");
        Cuenta c1 = new Cuenta("Ana", 5000);
        Cuenta c2 = new Cuenta("Luis", 10000);

        cuentas.add(c1);
        cuentas.add(c2);

        for (Cuenta c : cuentas) {
            System.out.println(c);
        }

        System.out.println("\n---------- Operaciones ----------");

        // ===== Operaciones de Ana =====
        c1.depositar(2000);
        Transaccion t1 = new Transaccion("Depósito", 2000, c1);
        transacciones.add(t1);
        System.out.println(t1); // imprimimos la operación al momento

        if (c1.retirar(1000)) {
            Transaccion t2 = new Transaccion("Retiro", 1000, c1);
            transacciones.add(t2);
            System.out.println(t2); // imprimimos la operación
        }

        // ===== Operaciones de Luis =====
        if (c2.retirar(3000)) {
            Transaccion t3 = new Transaccion("Retiro", 3000, c2);
            transacciones.add(t3);
            System.out.println(t3); // imprimimos la operación
        }

        c2.depositar(1500);
        Transaccion t4 = new Transaccion("Depósito", 1500, c2);
        transacciones.add(t4);
        System.out.println(t4); // imprimimos la operación

        // -------- Mostrar resultados --------
        System.out.println("\n--- Historial de transacciones ---");
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }

        System.out.println("\n--- Estado de las cuentas ---");
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }
    }
}
