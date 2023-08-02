package Common;

public class Mesa {


    private int vgNumeroDeLasMesas;
    private int vgCantidadDeLasSillas;
    
    private String vgEstado;
    private Cliente vgCliente;
    private String fecha;
    private String hora; 
  
    public Mesa() {
        vgNumeroDeLasMesas = 0;
        vgCantidadDeLasSillas = 0;
    }

    public Mesa(int vpNumeroMesa, int vpCantidadDeLasSillas) {
        vgNumeroDeLasMesas = vpNumeroMesa;
        vgCantidadDeLasSillas = vpCantidadDeLasSillas;
        vgEstado = "Disponible";
    }

    public int getVgNumeroDeLasMesas() {
        return vgNumeroDeLasMesas;
    }

    public int getVgCantidadDeLasSillas() {
        return vgCantidadDeLasSillas;
    }

    public String getVgEstado() {
        return vgEstado;
    }

    public Cliente getVgCliente() {
        return vgCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setVgNumeroDeLasMesas(int vgNumeroDeLasMesas) {
        this.vgNumeroDeLasMesas = vgNumeroDeLasMesas;
    }

    public void setVgCantidadDeSillas(int vgCantidadDeLasSillas) {
        this.vgCantidadDeLasSillas = vgCantidadDeLasSillas;
    }

    public void setVgEstado(String vgEstado) {
        this.vgEstado = vgEstado;
    }

    public void setVgCliente(Cliente vgCliente) {
        this.vgCliente = vgCliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
