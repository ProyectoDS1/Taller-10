/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import java.util.ArrayList;
import java.util.List;




public class Empresa {
    
    public List<Cliente> clientes;
    public List<Employee> empleados;
    
    public Empresa(){
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Employee>();
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        cliente.cambiarDireccion("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa");
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + " ha sido agregado como nuevo cliente");
        
    }
    
    public void mostrarTodo() {
        //Mostrar los clientes 
        for(Cliente cliente : this.clientes){
            cliente.MostrarInformacion();           
        }
        
        //Mostrar los empleados 
        for(Employee empleado : this.empleados){
            empleado.MostrarInformacion();           
        }
    }
    
    
}
