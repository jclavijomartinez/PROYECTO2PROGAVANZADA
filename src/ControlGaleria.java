import java.util.*;
public class ControlGaleria {
    //Set <>;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion =0;
            while (opcion<16){
                System.out.println("Digite una opcion");
                System.out.print(" 1. Ver listado de Obras discponibles ");
                System.out.print(" 2. Buscar una Obra por titulo. artista o año ");
                System.out.print(" 3. Insertar Obrar ");
                System.out.print(" 4. Modificar Obra ");
                System.out.print(" 5. Eliminar Obra ");
                System.out.print(" 6. Ver lsitado de Clientes registrados en el sistema");
                System.out.print(" 7. Buscar un Cliente ");
                System.out.print(" 8. Insertar Cliente ");
                System.out.print(" 9. Modificar los datos del Cliente ");
                System.out.print(" 10. Eliminar un Cliente ");
                System.out.print(" 11. Relizar compra de una Obra ");
                System.out.print(" 12. Eliminar compra de Obra ");
                System.out.print(" 13. Ver listado de Compras existentes");
                System.out.print(" 14. Ver listado de Compras para un mes y año específico insertado por el usuario ");
                System.out.print(" 15. Ver listado de Artistas más vendidos ");
                System.out.print(" 16. Salir ");
                opcion = scanner.nextInt();
            }
        }
    }
}