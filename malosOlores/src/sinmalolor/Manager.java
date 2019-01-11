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
public class Manager extends EmployeeType{

    @Override
    float entregarDecimo(Employee e) {
        float valueM = e.getSalary()+ (e.getBonusPercentage()* 0.7F);
        //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
        return month%2==0?valueM:valueM + e.getRmu()/12*2;
    }

    @Override
    float CalculateYearBonus(Employee e) {
        return e.getSalary()+ e.getSalary()* 1.0F;
    }
    
}
