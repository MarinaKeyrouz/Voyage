package TravelImplementationTest;


import static org.junit.Assert.assertEquals;
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
	private static Travel travel;
	
   @BeforeAll
   protected static void setUp() {
	   travel = new Travel(new Country("France"));
   }
    
    @Test
    public void testSetTravelMode() {
    	List<String> actual = Arrays.asList("CAR");
    	travel.setTravelMode("CAR");
    	assertEquals(travel.getCountry().getTravelModes(),actual);	
    }
    
    @Test
    public void testGetCountry() {
    	Country country = new Country("Lebanon");
    	travel.setCountry(country);
    	assertEquals(country.getCountryName(), country.getCountryName());
    }
    
    @AfterAll
    protected static void tearDown() {
    	travel = null;
    	assertNull(travel);
    }
}