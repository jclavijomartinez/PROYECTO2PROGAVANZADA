import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionClientes {
    private GestionObras gestionObras;
    private Cliente clientes;

    public List<Cliente> crearClientes() { //las pondria tipo void por lo que 
        List<Cliente> Listaclientes = new ArrayList<>(); 
        Cliente cliente1 = new Cliente(9876l, 1000365419l, "Brayan ", "Estivenson", "cra 143 #22-56a", 3192399712l,0000);
        Listaclientes.add(cliente1);
        Cliente cliente2 = new Cliente(2314l, 1000785419l, "Juan", "perez", "cra 151 #26-90", 3214180084l,0001);
        Listaclientes.add(cliente2);
        Cliente cliente3 = new Cliente(5768l, 1000369019l, "Andres ", "Perdomo", "cra 34 #45-5", 3112674330l,0002);
        Listaclientes.add(cliente3);
        Cliente cliente4 = new Cliente(1039l, 1000365423l, "Esneyder", "Centanaro", "cra 7 #444-666", 3203589556l,0003);
        Listaclientes.add(cliente4);
        Cliente cliente5 = new Cliente(1888l, 1560365419l, "Snyder ", "Zach", "cra 5 #22-65", 3134245722l,0004);
        Listaclientes.add(cliente5);

        return Listaclientes;
    }
    public void EliminarCliente(int codigo, List<Cliente> listClientes, int codigoCompra ) throws Exception {
    //a 
       for (int index = 0; index < listClientes.size(); index++) {
            if(codigo==listClientes.get(index).getCodigoCliente()){
                System.out.println("Felicidades existe");
            }
            else{
                throw new Exception();
            }
        }
   //b
        boolean confirmacion2;
        for (int i = 0; i < listClientes.size(); i++) {
            if (codigoCompra == codigo) {
                System.out.print("magnifico el codigo existe ");
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.print("Desea eliminar la obra? true or false/n");
                    confirmacion2 = scanner.nextBoolean();
                    if (confirmacion2 == true) {
                        System.out.print("El cliente se ha elimando con exito");
                    } else {
                        System.out.print("El cliente no se a eliminado");
                    }

                } catch (Exception e) {
                    // TODO: handle exception
                }

                //c
        } else {
                System.out.print("Vefique su codigo");
            }
        }
    }
}