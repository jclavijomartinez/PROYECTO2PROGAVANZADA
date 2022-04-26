import java.util.Calendar;
public class Obra {
    private Artista artis;
    private Obra compraObra;
    private Long codigoObra;
    private String titulo;
    private Calendar fecha;
    private float precioRef;
    private String dimensiones;
    private boolean disponible;
    public void setCodigoObra(Long codigoObra) {
        this.codigoObra = codigoObra;
    }
    public Long getCodigoObra() {
        return codigoObra;
    }public void setTitulo(String titulo) {
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
    public Obra(Long codigoObra,String titulo,Calendar fecha,float precioRef,String dimensiones) {
        this.setCodigoObra(codigoObra);
        this.setTitulo(titulo);
        this.setFecha(fecha);
        this.setPrecioRef(precioRef);
        this.setDimensiones(dimensiones);
    }
}
