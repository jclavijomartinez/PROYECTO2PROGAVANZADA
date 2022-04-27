    import java.nio.channels.NonWritableChannelException;
    import java.util.*;
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
                            List<Obra> listaobrasdisponibles = new ArrayList<>();
                            listaobrasdisponibles = arte.crearobras();
                            for (int i = 0; i < listaobrasdisponibles.size(); i++) {
                                if (listaobrasdisponibles.get(i).getDisponibles() == true) {
                                    System.out.println("[" + i + "] " + "Titulo: " + listaobrasdisponibles.get(i).getTitulo()+ " fecha de creacion: "+ /* listaobrasdisponible.get(i).getFecha()+ */" precio de referencia: "+ listaobrasdisponibles.get(i).getPrecioRef() + " COP, Dimensiones: "+ listaobrasdisponibles.get(i).getDimensiones());
                                }
                            }
                            break;
                        case 2:
                            GestionObras obraspararecorrer = new GestionObras();
                            List<Obra> listaobraspunto2 = new ArrayList<>();
                            List<Artista> artistas = new ArrayList<>();
                            listaobraspunto2 = obraspararecorrer.crearobras();
                            artistas = obraspararecorrer.crearartistas();
                            try (Scanner criterio = new Scanner(System.in)) {
                                int opc = 0;
                                System.out.println("los criterios de busqueda son:");
                                System.out.println("1. titulo");
                                System.out.println("2. artista");
                                System.out.println("3. año");
                                System.out.print("cual es el criterio de busqueda: ");
                                opc = scanner.nextInt();
                                if (opc == 1) {
                                    String titulo;
                                    System.out.print("Dame el titulo que quieres buscar: ");
                                    titulo = scanner.nextLine();
                                    System.out.println(" ");
                                    for (int i = 0; i < listaobraspunto2.size(); i++) {
                                        if (listaobraspunto2.get(i).getTitulo() == titulo) {
                                            System.out.println("[" + i + "] " + "Titulo: "+ listaobraspunto2.get(i).getTitulo() + " fecha de creacion: "+ /* listaobrasdisponible.get(i).getFecha()+ */" precio de referencia: "+ listaobraspunto2.get(i).getPrecioRef() + " COP, Dimensiones: "+ listaobraspunto2.get(i).getDimensiones());
                                        }
                                    }
                                } else if (opc == 2) {
                                    String artista;
                                    System.out.print("Dame el artista que quieres buscar: ");
                                    artista = scanner.nextLine();
                                    System.out.println(" ");
                                    for (int i = 0; i < listaobraspunto2.size(); i++) {
                                        if (artistas.get(i).getNombre() == artista) {
                                            System.out.println("[" + i + "] " + " Codigo: " + artistas.get(i).getCodigoArtista()+ " cedula: " + artistas.get(i).getCedula() + " Nombre: "+artistas.get(i).getNombre()+" Apellido: "+artistas.get(i).getApellidos()+" fecha de nacimiento: "+artistas.get(i).getFechaNacimiento()+" telefono: "+artistas.get(i).getTelefono());
                                        }
                                    }
                                } else if (opc == 3) {
                                    int year;
                                    System.out.print("Dame el year que quieres buscar: ");
                                    year = scanner.nextInt();
                                    System.out.println("");
                                    for (int i = 0; i < listaobraspunto2.size(); i++) {
                                        if (listaobraspunto2.get(i).getFecha().YEAR == year) {
                                            System.out.println("[" + i + "] " + "Titulo: "+ listaobraspunto2.get(i).getTitulo() + " fecha de creacion: "+ listaobraspunto2.get(i).getFecha().YEAR+" / "+listaobraspunto2.get(i).getFecha().MONTH+" / "+listaobraspunto2.get(i).getFecha().DATE+" precio de referencia: "+ listaobraspunto2.get(i).getPrecioRef() + " COP, Dimensiones: "+ listaobraspunto2.get(i).getDimensiones());
                                        }
                                    }
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("revisa el dato que ingresaste");
                            } catch (NoSuchElementException e) {
                                System.out.println("revisa lo que ingresaste");
                            }
                            break;
                        case 3:
                        Calendar nuevafecha = Calendar.getInstance();
                            try (Scanner  nuevaobra = new Scanner(System.in)) {
                                System.out.print("Dame el codigo de la nueva obra (tiene que tener 7 digitos): ");
                                String codigoObraNueva = scanner.nextLine();
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
                                Obra obranueva= new Obra(Long.parseLong(codigoObraNueva),tituloObraNueva, nuevafecha, precioObraNueva, dimsObraNueva, true);
                                GestionObras obras1 = new GestionObras();
                                listaobras = obras1.crearobras();
                                for (int i = 0; i < listaobras.size(); i++) {
                                    if (Long.parseLong(codigoObraNueva) != listaobras.get(i).getCodigoObra()) {
                                        System.out.println("esa obra ya existe!");
                                    } else {
                                        listaobras.add(obranueva);
                                    }
                                }
                                listartistas = obras1.crearartistas();
                                for (int i = 0; i < listartistas.size(); i++) {
                                    System.out.println("Cedula: "+listartistas.get(i).getCedula()+" nombre: "+listartistas.get(i).getNombre()+" Apellido: "+listartistas.get(i).getApellidos());
                                }
                                System.out.print("¿esta el artista que buscabas? (0=si|1=NO) ");
                                int siestaart = scanner.nextInt();
                                System.out.println(" ");
                                if (siestaart==0) {
                                    try (Scanner  nuevoartista  = new Scanner(System.in)) {
                                        System.out.print("Dame el Nombre del artista: ");
                                        String nombre = scanner.nextLine();
                                        System.out.println(" ");
                                        System.out.print("Dame el Apellido del artista: ");
                                        String apellido = scanner.nextLine();
                                        System.out.println(" ");
                                        System.out.print("Dame la cedula del artista: ");
                                        Long cedula= scanner.nextLong();
                                        System.out.println(" ");
                                        Calendar fechanacimiento = Calendar.getInstance();
                                        System.out.print("Dame el dia de necimiento del artista ");
                                        int dianac= scanner.nextInt();
                                        System.out.println(" ");
                                        System.out.print("Dame el mes de necimiento del artista ");
                                        int mesnac= scanner.nextInt();
                                        System.out.println(" ");
                                        System.out.print("Dame el year de necimiento del artista ");
                                        int ynac= scanner.nextInt();
                                        System.out.println(" ");
                                        fechanacimiento.set(ynac, mesnac, dianac);
                                        System.out.print("Dame el telefono del artista ");
                                        Long tel= scanner.nextLong();
                                        System.out.println(" ");
                                        List<Artista> lista= new ArrayList<>();
                                        GestionObras listaartistas;
                                        lista = listaartistas.crearartistas();
                                        Artista painter = new Artista(1234l, cedula, nombre, apellido, fechanacimiento, tel);
                                        lista.add(painter);
                                    } catch (InputMismatchException e) {
                                        System.out.println("revisa el dato que escribiste!");
                                    }
                                } 
                                
                            } catch (InputMismatchException e) {
                                System.out.println("revisa el dato que escribiste!");
                            }
                            break;
                        case 4:
                            System.out.print("Dame el codigo de la obra (deben ser 7 digitos): ");
                            String codobraeditar= scanner.nextLine();
                            System.out.println(" ");
                            GestionObras listaobras2;
                            List<Obra> listaeditable = new ArrayList<>();
                            listaeditable=listaobras2.crearobras();
                            if (codobraeditar.length()==7) {
                                for (int i = 0; i < listaeditable.size(); i++) {
                                    if (Long.parseLong(codobraeditar)==listaeditable.get(i).getCodigoObra()) {
                                        System.out.println("Aqui puedes modificar la obra, puedes modificar:");
                                        System.out.println("1. código ");
                                        System.out.println("2. titulo");
                                        System.out.println("3. fecha");
                                        System.out.println("4. precio");
                                        System.out.println("5. dimensiones");
                                        System.out.println("6. disponibilidad de compra");
                                        System.out.print("que quieres modificar: ");
                                        int opcionmod = scanner.nextInt();
                                        switch (opcionmod) {
                                            case 1:
                                                System.out.print("Dame el nuevo codigo: ");
                                                Long nuevocod = scanner.nextLong();
                                                if (nuevocod!=listaeditable.get(i).getCodigoObra()) {
                                                    listaeditable.get(i).setCodigoObra(nuevocod);
                                                } else {
                                                    System.out.println("el codigo nuevo no puede ser igual al anterior");
                                                }
                                                break;
                                            case 2:
                                                System.out.print("dame el nuevo titulo: ");
                                                String nuevotitulo = scanner.nextLine();
                                                listaeditable.get(i).setTitulo(nuevotitulo);
                                                break;
                                            case 3:
                                                Calendar creationdate = Calendar.getInstance();
                                                System.out.print("dame el year de creacion ");
                                                int aniodecre = scanner.nextInt();
                                                System.out.println(" ");
                                                System.out.print("dame el mes de creacion ");
                                                int mesdecre = scanner.nextInt();
                                                System.out.println(" ");
                                                System.out.print("dame el dia de creacion ");
                                                int diadecre = scanner.nextInt();
                                                System.out.println(" ");
                                                creationdate.set(aniodecre, mesdecre, diadecre);
                                                listaeditable.get(i).setFecha(creationdate);
                                                break;
                                            case 4:
                                                System.out.print("dame el precio nuevo: ");
                                                Float newprice = scanner.nextFloat();
                                                System.out.println(" ");
                                                listaeditable.get(i).setPrecioRef(newprice);
                                                break;
                                            case 5:
                                                System.out.print("dame las nuevas dimensiones: ");
                                                String newdims = scanner.nextLine();
                                                System.out.println(" ");
                                                listaeditable.get(i).setDimensiones(newdims);
                                                break;
                                            case 6:
                                                System.out.print("dame la nueva disponibilidad de compra: (1=DISP|0=NODISP)");
                                                boolean ava = scanner.nextBoolean();
                                                System.out.println(" ");
                                                listaeditable.get(i).setDisponibles(ava);
                                                break;
                                            
                                            default:
                                                break;
                                        }
                                    } else {
                                        System.out.println("ese codigo no esta asociado con ninguna obra");
                                    }
                                }
                            } else {
                                System.out.println("el codigo no tiene los caracteres necesarios");
                            }
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
                                    //prueba del pull centanaro
                                }
                            


                            break;

                        case 9:
                            try {
                                for (int index = 0; index < ; index++) {
                                    
                                }
                                Long codEliminar;
                                System.out.println("Ingrese el codigo del cliente a eliminar: ");
                                codEliminar=scanner.nextLong();
                                if(codEliminar==codigo){
                                    
                                }
                                else{
                                    System.out.println("El codigo no aparece, porfavor cree uno y vuuelva a intentar");
                                }
                            } catch (Exception e) {
                                //TODO: handle exception
                            }
                            break;

                        case 10:
                        try {
                            int numAleatoreo;
                            int opcition;
                            System.out.println("Dame el codigo de la obra");
                            listaeditable
                            System.out.println("Dame el codigo del cliente");
                            if(codigoCompra==0){
                                Random numRandom=new Random(2345);
                                codigoCompra=numRandom.nextInt(9999-0000+1)+0000;
                            }
                            System.out.println("Que cliente quiere verificar?");
                            opcition=scanner.nextInt();
                            
                            switch (opcition) {
                                case 1:

                                    System.out.println();
                                    System.out.println(GestionClientes().crearClientes(cliente1));
                                    System.out.println(GestionObras().crearobras(obra1));
                                    if(codigoCliente==0){
                                        System.out.println("Nohay una compra por parte de este cliente");
                                    }

                                    break;
                                case 2:
                                    System.out.println();
                                    System.out.println(GestionClientes().crearClientes(cliente2));
                                    System.out.println(GestionObras().crearobras(obra2));

                                    if(codigoCliente==0){
                                        System.out.println("Nohay una compra por parte de este cliente");
                                    }
                                    break;

                                case 3:
                                    System.out.println();
                                    System.out.println(GestionClientes().crearClientes(cliente3));
                                    System.out.println(GestionObras().crearobras(obra3));
                                    
                                    if(codigoCliente==0){
                                        System.out.println("Nohay una compra por parte de este cliente");
                                    }
                                    break;
                                case 4:
                                    System.out.println();
                                    System.out.println(GestionClientes().crearClientes(cliente4));
                                    System.out.println(GestionObras().crearobras(obra4));
                                    
                                    if(codigoCliente==0){
                                        System.out.println("Nohay una compra por parte de este cliente");
                                    }
                                    break;

                                default:
                                    break;
                            }
                            
                        
                        } catch (Exception e) {
                            //TODO: handle exception
                        }
                        
                            
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
