package clases;

public class Cliente extends Persona{
    private int clienteId;

    public Cliente( String nombre, 
                    String apellido, 
                    String numeroFiscal, 
                    String direccion, 
                    int clienteId) 
    {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    //GETTER
    public int getClienteId() {
        return clienteId;
    }

    //METODO
    @Override
    public String toString() {
        return super.toString() +
        "| ClienteID: " + clienteId;
    }
}
