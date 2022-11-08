package TravelImplementation;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class TravelTest
{
    /**
     * Default constructor for test class TravelTest
     */
	private static Travel t;
	
   @BeforeAll
   protected static void setUp() {
	   t = new Travel(new Country("France"));
   }
   
    @Test
    public void testConstructor() {
    	assertEquals("France",t.getCountry().getCountryName());
    	assertEquals(1,t.getReferenceNumber());
    }

    @Test
    public void testToString() {
        String expected = "Id: 1, Country: France, Travel Mode: Car " ; // put the expected value here
        assertEquals(expected, t.toString());
    } 
    
    @Test
    public void testSetTravelMode() {
    	List<String> actual = Arrays.asList("Car");
    	t.setTravelMode("Car");
    	assertEquals(t.getCountry().getTravelModes(),actual);
    	
    }
    
    protected void tearDown() {
    	this.t = null;
    }
}