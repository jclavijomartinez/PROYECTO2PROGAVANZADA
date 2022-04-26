import java.util.*;

//comentrio para probar pull JUANDAVID
public class PantallaGaleria {
    private ControlGaleria galeria;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            int codigo = 0;
            int codigoCompra = 0;
            while (opcion < 16) { // comentario prueba
                System.out.println("Estas son las opciones");
                System.out.println(" 1. Ver listado de Obras disponibles ");
                System.out.println(" 2. Buscar una Obra por titulo. artista o anio ");
                System.out.println(" 3. Insertar Obrar ");
                System.out.println(" 4. Modificar Obra ");
                System.out.println(" 5. Eliminar Obra ");
                System.out.println(" 6. Ver listado de Clientes registrados en el sistema");
                System.out.println(" 7. Buscar un Cliente ");
                System.out.println(" 8. Insertar Cliente ");
                System.out.println(" 9. Modificar los datos del Cliente ");
                System.out.println(" 10. Eliminar un Cliente ");
                System.out.println(" 11. Relizar compra de una Obra ");
                System.out.println(" 12. Eliminar compra de Obra ");
                System.out.println(" 13. Ver listado de Compras existentes");
                System.out.println(" 14. Ver listado de Compras para un mes y anio especifico insertado por el usuario "); 
                System.out.println(" 15. Ver listado de Artistas mas vendidos ");
                System.out.println(" 16. Salir ");
                System.out.print("Digite una opcion: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        GestionObras arte = new GestionObras();
                        List<Obra> listaobrasdisponible = new ArrayList<>();
                        listaobrasdisponible = arte.crearobras();
                        for (int i = 0; i < listaobrasdisponible.size(); i++) {
                            if (listaobrasdisponible.get(i).getDisponibles() == true) {
                                System.out.println("[" + i + "] " + "Titulo: " + listaobrasdisponible.get(i).getTitulo()+ " fecha de creacion: "+ /* listaobrasdisponible.get(i).getFecha()+ */" precio de referencia: "+ listaobrasdisponible.get(i).getPrecioRef() + " COP, Dimensiones: "+ listaobrasdisponible.get(i).getDimensiones());
                            }
                        }
                        break;
                    case 2:
                        GestionObras obraspararecorrer = new GestionObras();
                        List<Obra> listaobrasdisponibles = new ArrayList<>();
                        List<Artista> artistas = new ArrayList<>();
                        listaobrasdisponibles = obraspararecorrer.crearobras();
                        artistas = obraspararecorrer.crearartistas();
                        try (Scanner criterio = new Scanner(System.in)) {
                            System.out.println("los criterios de busqueda son:");
                            System.out.println("1. titulo");
                            System.out.println("2. artista");
                            System.out.println("3. año");
                            System.out.print("cual es el criterio de busqueda: ");
                            int opc = 0;
                            opc = scanner.nextInt();
                            System.out.println(" ");
                            if (opc == 1) {
                                String titulo;
                                System.out.print("Dame el titulo que quieres buscar: ");
                                titulo = scanner.nextLine();
                                System.out.println(" ");
                                for (int i = 0; i < listaobrasdisponibles.size(); i++) {
                                    if (listaobrasdisponibles.get(i).getTitulo() == titulo) {
                                        System.out.println("[" + i + "] " + "Titulo: "+ listaobrasdisponibles.get(i).getTitulo() + " fecha de creacion: "+ /* listaobrasdisponible.get(i).getFecha()+ */" precio de referencia: "+ listaobrasdisponibles.get(i).getPrecioRef() + " COP, Dimensiones: "+ listaobrasdisponibles.get(i).getDimensiones());
                                    }
                                }
                            } else if (opc == 2) {
                                String artista;
                                System.out.print("Dame el artista que quieres buscar: ");
                                artista = scanner.nextLine();
                                System.out.println(" ");
                                for (int i = 0; i < listaobrasdisponibles.size(); i++) {
                                    if (artistas.get(i).getNombre() == artista) {
                                        System.out.println("[" + i + "] " + " Codigo: " + artistas.get(i).getCodigoArtista()+ " cedula: " + artistas.get(i).getCedula() + " Nombre: "+artistas.get(i).getNombre()+" Apellido: "+artistas.get(i).getApellidos()+" fecha de nacimiento: "+artistas.get(i).getFechaNacimiento()+" telefono: "+artistas.get(i).getTelefono());
                                    }
                                }
                            } else if (opc == 3) {
                                int year;
                                System.out.print("Dame el year que quieres buscar: ");
                                year = scanner.nextInt();
                                System.out.println("");
                                for (int i = 0; i < listaobrasdisponibles.size(); i++) {
                                    if (true/*listaobrasdisponibles.get(i).getFecha(). == year      TRABAJARLE*/) {
                                        System.out.println("[" + i + "] " + "Titulo: "+ listaobrasdisponibles.get(i).getTitulo() + " fecha de creacion: "+ /* listaobrasdisponible.get(i).getFecha()+ */" precio de referencia: "+ listaobrasdisponibles.get(i).getPrecioRef() + " COP, Dimensiones: "+ listaobrasdisponibles.get(i).getDimensiones());
                                    }
                                }
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("revisa el dato que ingresaste");
                        }
                        break;
                    case 3:
                    Calendar nuevafecha = Calendar.getInstance();
                        try (Scanner  nuevaobra = new Scanner(System.in)) {
                            System.out.print("Dame el codigo de la nueva obra (tiene que tener 7 digitos): ");
                            for (int i = 0; i < args.length; i++) {
                                
                            }
                            Long codigoObraNueva = scanner.nextLong();
                            System.out.println("");
                            System.out.print("Dame el titulo de la nueva obra: ");
                            String tituloObraNueva = scanner.nextLine();
                            System.out.println("");
                            System.out.print("Dame el dia de creacion de la nueva obra: ");
                            int diaObraNueva = scanner.nextInt();
                            System.out.println("");
                            System.out.print("Dame el mes de creacion de la nueva obra: ");
                            int mesObraNueva = scanner.nextInt();
                            System.out.println("");
                            System.out.print("Dame el year de creacion de la nueva obra: ");
                            int yearObraNueva = scanner.nextInt();
                            System.out.println("");
                            nuevafecha.set(yearObraNueva,mesObraNueva,diaObraNueva);
                            System.out.print("Dame el precio de la nueva obra: ");
                            Float precioObraNueva = scanner.nextFloat();
                            System.out.println("");
                            System.out.print("Dame las dimensiones de la nueva obra: (altoxancho) ");
                            String dimsObraNueva = scanner.nextLine();
                            System.out.println("");
                            List<Obra> listaobras = new ArrayList<>();
                            List<Artista> listartistas = new ArrayList<>();
                            Obra obranueva = new Obra(codigoObraNueva, tituloObraNueva, nuevafecha, precioObraNueva, dimsObraNueva, true);
                            GestionObras obras1 = new GestionObras();
                            listaobras = obras1.crearobras();
                            listaobras.add(obranueva);
                            listartistas = obras1.crearartistas();
                            for (int i = 0; i < listartistas.size(); i++) {
                                System.out.println("falta listar");
                            }
                            
                            
                        } catch (Exception e) {
                            
                        }
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        try {
                            System.out.print("Digite el codigo de la obra: ");
                            codigo = scanner.nextInt();
                            System.out.println("");
                            System.out.print("Digite el codigo de compra de la obra ");
                            codigoCompra = scanner.nextInt();
                            System.out.println("");
                            GestionObras test1 = new GestionObras();
                            test1.EliminarObra(codigo, test1.crearobras(), codigoCompra);
                        } catch (Exception e) {
                            System.out.print("El codigo no existe");
                            break;
                        }

                        break;
                    case 6:
                        GestionClientes lista = new GestionClientes();
                        List<Cliente> Listaimprimir = new ArrayList<>();
                        Listaimprimir = lista.crearClientes();
                        for (int i = 0; i < Listaimprimir.size(); i++) {

                            System.out.println("Cedula: " + Listaimprimir.get(i).getCedula() + " Nombre Completo: "
                                    + Listaimprimir.get(i).getNombre() + Listaimprimir.get(i).getApellidos()
                                    + " Direccion: " + Listaimprimir.get(i).getDireccionEntrega() + " Telefono: "
                                    + Listaimprimir.get(i).getTelefono());
                        }
                        break;
                    case 7:
                    try {
                            String nombre1, apellido1, direccion1;
                        long Cedula1, Telefono1, CodigoC1;
                        GestionClientes obra = new GestionClientes();
                        Cliente nuevoCliente;
                            System.out.print("Informacion nuevo cliente: ");
                            
                            System.out.print("Ingrese la cedula del cliente: ");
                            Cedula1 = scanner.nextLong();
                            System.out.println("");
                            System.out.print("Ingrese el nombre del cliente:");
                            nombre1 = scanner.nextLine();
                            System.out.println("");
                            System.out.print("Ingrese el apellido del cliente:");
                            apellido1 = scanner.nextLine();
                            System.out.println("");
                            System.out.print("Ingrese la direccion del cliente:");
                            direccion1 = scanner.nextLine();
                            System.out.println("");
                            System.out.print("Ingrese el telefono del cliente:");
                            Telefono1 = scanner.nextLong();
                            System.out.println("");
                            System.out.print("Ingrese el codigo del cliente: ");
                            CodigoC1 = scanner.nextLong();
                            List<Cliente> lcliente = new ArrayList<>();
                             lcliente = obra.crearClientes(); 
                            //lcliente.add(nuevoCliente);
                                for (int i = 0;i< lcliente.size(); i++){
                                    if(CodigoC1==codigo)
                                    {
                                        System.out.println("Codigo de cliente existente"); 

                                    }
                                    else
                                    {
                                        System.out.println("Codigo Disponible");
                                    }

                                }
                            
                            Cliente nuevocliente = new Cliente(CodigoC1, Cedula1, nombre1, apellido1, direccion1, Telefono1);
                           
                        } catch (Exception e) {
                            System.out.println("Me vale vrga");//cambia a otra cosa xd 

                            
                        }

                        
                        break;
                    case 8:
                            try {
                                Long CodModificar;
                                 System.out.println("Ingrese el codigo del cliente a modificar ");
                                 CodModificar = scanner.nextLong();
                                 if (CodModificar!=codigo)
                                 {
                                     System.out.print("El codigo no exite");
                                     break;
                                 }
                                 else{
                                     for (int i = 0; i < Listaimprimir.size(); i++) {
                                         Listaimprimir.get(i);
                                     }
                                 }
                            } catch (Exception e) {
                                //TODO: handle exception
                            }
                           


                        break;

                    case 9:

                        break;

                    case 10:

                        break;

                    case 11:

                        break;
                    case 12:

                        break;
                    case 13:

                        break;
                    case 14:

                        break;
                    case 15:

                        break;

                    default:
                        break;
                }
            }
        }
    }
}
