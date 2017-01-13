package modeloBancario;

public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    
    
public Cliente(){
    this.idCliente= 0;
    this.nombre= null;
    this.direccion = null;
    this.telefono = null;
        
}

public Cliente (int idCliente, String nombre, String direccion, String telefono) {
    this.idCliente = idCliente;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    }

}
