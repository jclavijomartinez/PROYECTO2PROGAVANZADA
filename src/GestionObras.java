import java.util.*;

public class GestionObras {
    private Obra Gobra;

    public List<Obra> crearobras() {
        List<Obra> listaobras = new ArrayList<>();
        Calendar fecha = Calendar.getInstance();
        fecha.set(1503, 06, 23);
        Obra obra1 = new Obra(0000001L, "La gioconda", fecha, 1000000.0f, "77x53", true);
        fecha.set(1503, 06, 23);
        Obra obra2 = new Obra(0000002L, "La noche estrellada", fecha, 2000000.0f, "74x92", true);
        Obra obra3 = new Obra(0000003L, "Las meninas", fecha, 3000000.0f, "318x276", true);
        Obra obra4 = new Obra(0000004L, "La ultima cena", fecha, 4000000.0f, "460x880", true);
        Obra obra5 = new Obra(0000003L, "Las meninas", fecha, 5000000.0f, "318x276", true);
        listaobras.add(obra1);
        listaobras.add(obra2);
        listaobras.add(obra3);
        listaobras.add(obra4);
        listaobras.add(obra5);

        return listaobras;
    }

    public List<Artista> crearartistas() { //tambien lo pondria como void
        List<Artista> listaartistas = new ArrayList<>();
        Calendar fechanacimiento = Calendar.getInstance();
        fechanacimiento.set(1999, 2, 15);
        Artista artista1 = new Artista(1234l, 1000386429l, "MIGUEL", "ANGEL", fechanacimiento, 3214181563l);
        listaartistas.add(artista1);
        return listaartistas;
    }

    public void EliminarObra(int codigo, List<Obra> listaobras, int codigoCompra) throws Exception {
        for (int i = 0; i < listaobras.size(); i++) {
            if (codigo == listaobras.get(i).getCodigoObra()) {
                System.out.print("La mierda existe"); //cambiar a otra cosa
            } else {
                throw new Exception();

            }
        }
        String confirmacion;
        for (int i = 0; i < listaobras.size(); i++) {
            if (codigoCompra == codigo) {
                System.out.print("Codigo de la obra encontrado ");
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.print("Desea eliminar la obra y/n");
                    confirmacion = scanner.nextLine();
                    if (confirmacion == "y") {
                        System.out.print("La obra fue elimando con exito");
                    } else {
                        System.out.print("La obra no se a  eliminado");
                    }

                } catch (Exception e) {
                    // TODO: handle exception
                }

            } else {
                System.out.print("Vefique su codigo");
            }
        }

    }

}