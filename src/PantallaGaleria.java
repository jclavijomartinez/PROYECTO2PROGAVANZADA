import java.util.*;
//comentrio para probar pussh JD
public class PantallaGaleria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            while (opcion < 16) { // comentario prueba
                System.out.println("Estas son las opciones");
                System.out.println(" 1. Ver listado de Obras disponibles ");
                System.out.println(" 2. Buscar una Obra por titulo. artista o anio ");
                System.out.println(" 3. Insertar Obrar ");
                System.out.println(" 4. Modificar Obra ");
                System.out.println(" 5. Eliminar Obra ");
                System.out.println(" 6. Ver lsitado de Clientes registrados en el sistema");
                System.out.println(" 7. Buscar un Cliente ");
                System.out.println(" 8. Insertar Cliente ");
                System.out.println(" 9. Modificar los datos del Cliente ");
                System.out.println(" 10. Eliminar un Cliente ");
                System.out.println(" 11. Relizar compra de una Obra ");
                System.out.println(" 12. Eliminar compra de Obra ");
                System.out.println(" 13. Ver listado de Compras existentes");
                System.out.println(" 14. Ver listado de Compras para un mes y anio especifico insertado por el usuario "); //si vez esta linea el cambio se resolvio satisfactoriamente
                System.out.println(" 15. Ver listado de Artistas mas vendidos ");
                System.out.println(" 16. Salir ");
                System.out.print("Digite una opcion: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

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
