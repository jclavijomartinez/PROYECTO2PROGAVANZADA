import java.util.*;
public class ControlGaleria {
    private GestionObras obras;
    private GestionClientes clientes;
    public ControlGaleria(GestionObras obras,GestionClientes clientes) {
        this.obras.crearobras();
        this.obras.crearartistas();
        this.clientes.crearClientes();
    }
}


