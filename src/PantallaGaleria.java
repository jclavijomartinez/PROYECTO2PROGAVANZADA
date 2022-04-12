import java.util.*;

public class PantallaGaleria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            while (opcion < 16) {
                System.out.println("Estas son las opciones");
                System.out.println(" 1. Ver listado de Obras discponibles ");
                System.out.println(" 2. Buscar una Obra por titulo. artista o año ");
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
                System.out
                        .println(" 14. Ver listado de Compras para un mes y año específico insertado por el usuario ");
                System.out.println(" 15. Ver listado de Artistas más vendidos ");
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

                    default:
                        break;
                }
            }
        }
    }
}
