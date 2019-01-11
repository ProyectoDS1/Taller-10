/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

/**
 *
 * @author reyes
 */
public class Persona {
    
    protected String Nombre;
    protected String Apellido;
    protected String Cedula;
    protected String provincia;
    protected String pais;
    protected String ciudad;
    protected String direccion;

    public Persona() {
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String mostrarDireccion() {
        String dir = pais + " - " + provincia + " - " + ciudad;
        return dir + "\n" + direccion;
    }

    public void cambiarDireccion(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva) {
        pais = nuevoPais;
        ciudad = ciudadnueva;
        provincia = provinciaNueva;
        direccion = direccionNueva;
    }
    
}
