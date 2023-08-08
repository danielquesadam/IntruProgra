package BussinessLogic;

import Common.Usuario;

public class Seguridad {

    public Seguridad() {
        registroDeUsuarios();
    }

    // Definir las variables globales
    public Usuario[] arregloUsuarios = new Usuario[5];

    // Metodo para cargar usuarios en el sistema
    public void registroDeUsuarios() {

        /** Paso 1 Crear una instancia de la clase usuario */
        Usuario usuarioAdmin = new Usuario();
        usuarioAdmin.setVgNombreDeUsuario("Admin");
        usuarioAdmin.setVgPassword("123");

        Usuario usuarioClienteJohn = new Usuario("Daniel", "123");
        Usuario usuarioClienteSaul = new Usuario("Esteban", "123");
        Usuario usuarioClienteJenny = new Usuario("Dali", "123");
        Usuario usuarioClienteAndrey = new Usuario("Jose", "123");

        // Las posiciones de los usuarios en el arreglo "arregloUsuarios"
        arregloUsuarios[0] = usuarioAdmin;
        arregloUsuarios[1] = usuarioClienteJohn;
        arregloUsuarios[2] = usuarioClienteSaul;
        arregloUsuarios[3] = usuarioClienteJenny;
        arregloUsuarios[4] = usuarioClienteAndrey;
    }

    public boolean buscarPorUsuarioClave(String vpUsuario, String vpClave) { // * Se declara un método llamado
                                                                             // buscarUsuarioPorUsuarioClave que toma
                                                                             // dos* parámetros:* vpUsuario y vpClave.

        for (int indice = 0; indice < arregloUsuarios.length; indice++) {

            String vlUsuario = arregloUsuarios[indice].getVgNombreDeUsuario();
            String vlClave = arregloUsuarios[indice].getVgPassword();

            if (vlClave.equals(vpClave) && vlUsuario.equals(vpUsuario)) {

                return true;
            }
        }

        return false;
    }

}
