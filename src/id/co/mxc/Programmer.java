/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mxc;

import id.co.mxc.anotasi.Indocyber;
import java.util.Date;

/**
 *
 * @author user
 */
@Indocyber(namaClass = "Bootcamp 2", year = 2017)
public class Programmer extends Employee{
    double bonus;
    
    public Programmer(){
    
    }

    public Programmer(String name, double salary, Date dateOfBirth){
        super(name, salary, dateOfBirth);
    }
    

    @Override //anotasi apakah yang di bawah mengoverride atau tidak
    public double calculateSalaryWithBonus(){
    
        return 1000;
    }
    
    @Override
    public String toString(){
    
        return "a";
    }
    
    

    
}
