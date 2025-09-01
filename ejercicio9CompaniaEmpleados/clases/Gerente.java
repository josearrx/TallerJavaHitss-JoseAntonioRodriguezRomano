package clases;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente( String nombre, 
                    String apellido, 
                    String numeroFiscal, 
                    String direccion,
                    double remuneracion, 
                    int empleadoId, 
                    double presupuesto) 
    {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }
    
    //GETTERS Y SETTERS
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    //METODO
    @Override
    public String toString() {
        return super.toString() +
                "| Presupuesto: " + presupuesto + "\n";
    }

    

    

    




    
}
