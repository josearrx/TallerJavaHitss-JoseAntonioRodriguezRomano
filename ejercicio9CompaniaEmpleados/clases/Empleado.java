package clases;

public class Empleado extends Persona {
    
    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, 
                    String apellido, 
                    String numeroFiscal, 
                    String direccion,
                    double remuneracion, 
                    int empleadoId) 
    {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    // GETTERS
    public double getRemuneracion(){ 
        return remuneracion; 
    }
    public int getEmpleadoId() {
        return empleadoId; 
    }

    // METODOS
    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion += this.remuneracion * porcentaje / 100.0;
    }

    @Override
    public String toString() {
        return super.toString()   +
               "| EmpleadoID: "   + empleadoId   + "\n" +
               "| Remuneración: " + remuneracion + "\n";
    }
}
