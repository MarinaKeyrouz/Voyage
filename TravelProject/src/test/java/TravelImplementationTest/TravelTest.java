package TravelImplementationTest;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TravelImplementation.Country;
import TravelImplementation.Travel;

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
    public void testSetTravelMode() {
    	List<String> actual = Arrays.asList("CAR");
    	t.setTravelMode("CAR");
    	assertEquals(t.getCountry().getTravelModes(),actual);
    	
    }
    
    @AfterAll
    protected static void tearDown() {
    	t = null;
    	assertNull(t);
    }
}