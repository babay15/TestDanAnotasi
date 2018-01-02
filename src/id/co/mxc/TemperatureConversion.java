/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mxc;

/**
 *
 * @author user
 */
public class TemperatureConversion {
    public double fahrenheitToCelcius(double fahrenheit){
        double celsius = 5.0/9.0*(fahrenheit-32.0);
        return celsius;
    }
    
    public double celsiusToFahrenheit(double Celsius){
        double fahrenheit = (Celsius*9.0/5.0) + 32.0;
        return fahrenheit;
    }
}
