public class Cliente {
    private Long codigoCliente;
    private Long cedula;
    private String nombre;
    private String Apellidos;
    private String direccionEntrega;
    private Long telefono;

    public void setCodigoCliente(Long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Long getCodigoCliente() {
        return codigoCliente;
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
        Apellidos = apellidos;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Long getTelefono() {
        return telefono;
    }
}
