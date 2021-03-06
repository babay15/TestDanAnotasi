/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mxc;

import java.util.Date;

/**
 *
 * @author user
 */
public class Employee {
    private String name;
    private double salary;
    private Date dateOfBirth;

    /**
     * @return the name
     */
    
    
    public Employee() {
    }

    public Employee(String name, double salary, Date dateOfBirth) {
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Deprecated
    public double calculateSalaryWithBonus(){
        return this.salary+1000;
    }
    
    public double calculateSalaryWithBonus(double bonusPercentage){
        return ((this.salary * bonusPercentage)+this.salary);
    }
}
