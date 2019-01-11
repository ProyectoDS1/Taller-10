/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Employee extends Persona
{   

    private final float rmu = (float) 386.0;
    //salario del employee
    private float salary;
    //porcentaje de bonus
    private float bonusPercentage;    
    //variable de tipo employeeType
    private EmployeeType employeeType;    

    public Employee(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;
        this.Nombre = "Descconocido";
        this.Apellido = "Descconocido";
        this.Cedula = "0000000000";
        super.cambiarDireccion("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
    }
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public float cs()
    {
        if(this.employeeType!=null){
            return this.employeeType.entregarDecimo(this);
        }
        return 0.0F;
        
    }
    //calcula el bonus anual
    public float CalculateYearBonus() 
    {
        if(this.employeeType!=null){
            return this.employeeType.CalculateYearBonus(this);
        }
        return 0.0F;
    }
    
    public float getRmu(){
        return this.rmu;
    }
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
