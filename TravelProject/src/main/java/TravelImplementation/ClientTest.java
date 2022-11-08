package TravelImplementation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class ClientTest
{
    /**
     * Default constructor for test class TravelTest
     */
	private static Client client;
	
    @BeforeAll
    public static void setUp() {
        client = new Client("Marina");
    }
    
    @Test
    public void testConstructor() {
    	assertEquals("Marina", client.getName());
    	assertEquals(1,client.getId());
    }
    
    @Test
    public void testCreateTravel() {
    	client.createTravel("France");
    	client.createTravel("Italy");
    	// We are chekcing it set the country name 
    	assertEquals(client.getTravel().get(0).getCountry().getCountryName(),"France");
    	assertEquals(client.getTravel().get(1).getCountry().getCountryName(),"Italy"); 
    	// We are checking that it create a new travel with the country destination
    	assertEquals(client.getTravel().get(0),new Travel(new Country("France")));
    	assertEquals(client.getTravel().get(1),new Travel(new Country("Italy")));
    	//We are checking null input 
    	assertThrows(NullPointerException.class,
	            ()->{
	            	this.client.createTravel(null);
	            });
    }
}