import java.util.Calendar;

public class Obra {
    private Artista artista;
    private Long codigoObra;
    private String titulo;
    private Calendar fecha;
    private float precioRef;
    private String dimensiones;
    private boolean disponible;
    private int codigoCompra;

    public void setCodigoObra(Long codigoObra2){
        this.codigoObra = codigoObra2;
    }

    public Long getCodigoObra() {
        return codigoObra;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setPrecioRef(float precioRef) {
        this.precioRef = precioRef;
    }

    public float getPrecioRef() {
        return precioRef;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDisponibles(boolean disponibles) {
        this.disponible = disponibles;
    }

    public boolean getDisponibles() {
        return disponible;
    }
   

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }
    public Long verificarcodigo(String cod) {
        if (cod.length()==7) {
            Long resultado;
            resultado = Long.parseLong(cod);
            return resultado;
        } else {
            return 0l;
        }
    }

    public Obra( long l, String titulo, Calendar fecha, float precioRef, String dimensiones,boolean disponible,int codigoCompra) {
        this.setCodigoObra(verificarcodigo(l));
        this.setTitulo(titulo);
        this.setFecha(fecha);
        this.setPrecioRef(precioRef);
        this.setDimensiones(dimensiones);
        this.setDisponibles(disponible);
        this.setCodigoCompra(codigoCompra);
    }
}
