package TravelImplementationTest;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TravelImplementation.Country;


/**
 * The test class CountryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CountryTest
{
    /**
     * Default constructor for test class CountryTest
     */
	private static Country country;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
    	CountryTest.country = new Country();
    }
    
    @Test
    public void testaddTravelModes() {
//    	Check a normal add travel mode
    	List<String> actual = Arrays.asList("CAR", "BUS", "AIRPLANE");
    	CountryTest.country.addTravelModes("car");
    	CountryTest.country.addTravelModes("hsh");
    	List<String> expected = CountryTest.country.addTravelModes("aiRPlane");
    	assertEquals(actual,expected);
  
//    	Check if we add two or more mode from the same type
//    	We should first empty the list so we can add again
    	CountryTest.country.removeTravelModes();
    	actual = Arrays.asList("CAR", "BUS");
    	CountryTest.country.addTravelModes("car");
    	CountryTest.country.addTravelModes("car");
    	CountryTest.country.addTravelModes("Bus");
    	expected = CountryTest.country.addTravelModes("hsd");
    	assertEquals(actual, expected);
    	
    	
//    	Check that it will throw an exception if we add a null travel mode
//    	We should first empty the list so we can add again
    	CountryTest.country.removeTravelModes();
    	assertThrows(NullPointerException.class,
	            ()->{
	            	CountryTest.country.addTravelModes(null);
	            });
    	
    }
    
    @Test
    public void testremoveTravelModes() {
    	CountryTest.country = new Country();
    	List<String> expected = new ArrayList<String>() ; ;

// 		Add items to the travel mode list
    	CountryTest.country.addTravelModes("car");
    	CountryTest.country.addTravelModes("car");
    	CountryTest.country.addTravelModes("Bus");
    	
//    	Now we try to empty the list
    	CountryTest.country.removeTravelModes();
    	
//    	Be sure that the list is now empty
    	Assertions.assertEquals(expected, CountryTest.country.getTravelModes());
    }
    
    @Test
    public void testGetCountryName() {
    	country.setCountryName("Lebanon");
    	assertEquals("Lebanon", country.getCountryName());
    }
    
    @AfterAll
    protected static void tearDown() {
    	country = null;
    	assertNull(country);
    }
}