package Common;

import java.lang.reflect.Constructor;

public class Cliente {

    private String vgNombre;
    private String vgApellido;
    private String vgIdentificacion;
    private String vgTelefono;

    public Cliente(){
        vgNombre = "";
        vgApellido = "";
        vgIdentificacion = "";
        vgTelefono = "";
    }

    public Cliente(String vpNombre, String vpApellido, String vpIdentificacion, String vpTelefono) {
        
        vgNombre = vpNombre;
        vgApellido = vpApellido;
        vgIdentificacion = vpIdentificacion;
        vgTelefono = vpTelefono;
    }

    public String getNombre() {
        return vgNombre;
    }

    public String getApellido() {
        return vgApellido;
    }

    public String getIdentificacion() {
        return vgIdentificacion;
    }

    public String getTelefono() {
        return vgTelefono;
    }

    public void setNombre(String nombre) {
        vgNombre = nombre;
    }

    public void setApellido(String apellido) {
        vgApellido = apellido;
    }
    
    public void setIdentificacion(String identificacion) {
        vgIdentificacion = identificacion;
    }


    public void setTelefono(String telefono) {
        vgTelefono = telefono;
    }

    public String getInformacion() {
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Identificacion: " + getIdentificacion() + "Telefono: " + getTelefono();
    }

}
