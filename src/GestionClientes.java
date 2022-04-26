import java.util.ArrayList;
import java.util.List;

public class GestionClientes {
    private GestionObras gestionObras;
    private Cliente clientes;
    public List<Cliente> crearClientes() {
        List<Cliente> listaclientes = new ArrayList<>();
        Cliente cliente1 = new Cliente(9876l, 1000365419l, "pepito ", "perez", "cra 43 #22-56", 3215982685l);
        listaclientes.add(cliente1);
        return listaclientes;
    }
}