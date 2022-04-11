import java.util.Calendar;
public class Obra {
    private Long codigoObra;
    private String titulo;
    private Calendar fecha;
    private float precioRef;
    private String dimensiones;
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
}
