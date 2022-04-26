import java.util.Calendar;

public class Artista {
    private Obra obraa;
    private Long codigoArtista;
    private Long cedula;
    private String nombre;
    private String apellidos;
    private Calendar fechaNacimiento;
    private Long telefono;
    public void setCodigoArtista(Long codigoArtista) {
        this.codigoArtista = codigoArtista;
    }
    public Long getCodigoArtista() {
        return codigoArtista;
    }
    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }
    public Long getCedula() {
        return cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    public Long getTelefono() {
        return telefono;
    }
    public Artista(Long codigoArtista,Long cedula,String nombre,String apellidos,Calendar fechaNacimiento,Long telefono) {
        this.setCodigoArtista(codigoArtista);
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
    }
}