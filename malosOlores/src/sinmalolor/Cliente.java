/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;



public class Cliente extends Persona{
    private String telefono;
    
    public Cliente(String Nombre, String Apellido, String Cedula) {
        this.setNombre(Nombre);
        this.setApellido(Apellido);
        this.setCedula(Cedula);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
