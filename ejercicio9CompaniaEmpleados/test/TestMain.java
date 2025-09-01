package test;

import clases.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Jose",
                                "Rodriguez", 
                                "FISC01", 
                                "Direccion prueba", 
                                25000, 
                                1, 
                                100000);

        System.out.println("========== Datos Gerente ==========");
        System.out.println(g1);

        g1.aumentarRemuneracion(10);
        g1.setPresupuesto(1000);

        System.out.println("========== Datos Gerente Actualizados ==========");
        System.out.println(g1);
    }
}
