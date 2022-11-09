package TravelImplementationTest;



import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TravelImplementation.Country;
import TravelImplementation.Travel;



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
    	this.country = new Country();
    }
    
    @Test
    public void testaddTravelModes() {
//    	Check a normal add travel mode
    	List<String> actual = Arrays.asList("CAR", "BUS", "AIRPLANE");
    	this.country.addTravelModes("car");
    	this.country.addTravelModes("hsh");
    	List<String> expected = this.country.addTravelModes("aiRPlane");
    	assertThat(actual, is((expected)));
  
//    	Check if we add two or more mode from the same type
//    	We should first empty the list so we can add again
    	this.country.removeTravelModes();
    	actual = Arrays.asList("CAR", "BUS");
    	this.country.addTravelModes("car");
    	this.country.addTravelModes("car");
    	this.country.addTravelModes("Bus");
    	expected = this.country.addTravelModes("hsd");
    	assertThat(actual, is((expected)));
    	
    	
//    	Check that it will throw an exception if we add a null travel mode
//    	We should first empty the list so we can add again
    	this.country.removeTravelModes();
    	assertThrows(NullPointerException.class,
	            ()->{
	            	this.country.addTravelModes(null);
	            });
    	
    }
    
    @Test
    public void testremoveTravelModes() {
    	this.country = new Country();
    	List<String> expected = new ArrayList<String>() ; ;

// 		Add items to the travel mode list
    	this.country.addTravelModes("car");
    	this.country.addTravelModes("car");
    	this.country.addTravelModes("Bus");
    	
//    	Now we try to empty the list
    	this.country.removeTravelModes();
    	
//    	Be sure that the list is now empty
    	Assertions.assertEquals(expected, this.country.getTravelModes());
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