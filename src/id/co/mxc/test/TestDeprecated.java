/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mxc.test;

import id.co.mxc.Employee;

/**
 *
 * @author user
 */
public class TestDeprecated {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee();
        emp.setName("Jono");
        emp.setSalary(50000);
        
        
        System.out.println(emp.calculateSalaryWithBonus());
    }
    
}
