/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mxc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ConversionTest {
    TemperatureConversion TC = new TemperatureConversion();
    public ConversionTest() {
                
    }    
    @Test
    public void testCelsius(){
        double fahrenheit = TC.fahrenheitToCelcius(72);
        double expected = 22.22;
        assertEquals(expected, fahrenheit, 0.5);
    }
        
    @Test
    public void testFahrenheit(){
        double celsius = TC.celsiusToFahrenheit(30);
        double expected = 86;
        assertEquals(expected, celsius, 0);
    }
    
    @Test
    public void testRasio(){
        
    }

    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
