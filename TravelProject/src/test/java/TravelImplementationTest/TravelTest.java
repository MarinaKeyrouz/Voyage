package TravelImplementationTest;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
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
	private static Travel travel2;
	
   @BeforeAll
   protected static void setUp() {
	   travel = new Travel(new Country("France"));
	   travel2 = new Travel();
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
    	travel2.setCountry(country);
    	assertEquals(country.getCountryName(), travel2.getCountry().getCountryName());
    }
    
    @Test
    public void testGetReferenceNumber() {
    	assertEquals(Travel.getReferenceNumber(), 2);
    }
    
    @AfterAll
    protected static void tearDown() {
    	travel = null;
    	assertNull(travel);
    }
}