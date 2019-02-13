
package com.damienmally.assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class convertTest {
    
    @Test
    public void convertTest() {
        milesToKm test = new milesToKm();
        double km = test.convertToKm(5);
        double kmtest = 8.0467;
        //assertEquals(5, 5);
        
        assertEquals(kmtest, km, 0.001);
    }
    
    
   
}
