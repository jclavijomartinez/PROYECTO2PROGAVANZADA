import java.util.Calendar;
public class Compra {
    private long codigoCompra;
    private Calendar fecha;
    private boolean pagado;

    public void setCodigoCompra(long codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    public long getCodigoCompra() {
        return codigoCompra;
    }public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    public Calendar getFecha() {
        return fecha;
    }
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    public boolean getPagado() {
        return pagado;
    }
}