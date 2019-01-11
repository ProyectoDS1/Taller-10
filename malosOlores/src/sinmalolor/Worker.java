/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

/**
 *
 * @author leone
 */
public class Worker extends EmployeeType{

    @Override
    float entregarDecimo(Employee e) {
        return month%2==0?e.getSalary():e.getSalary() + e.getRmu()/12*2;
    }

    @Override
    float CalculateYearBonus(Employee e) {
        return 0;
    }
    
}
