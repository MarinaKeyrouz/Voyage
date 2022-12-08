package TravelImplementationTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import TravelImplementation.Client;
import TravelImplementation.Travel;

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
        client = new Client();
    }
    
    @AfterAll
    public static void teardown() {
        client = null;
    }
    
    @Test
    public void testGetterAndSetter() {
    	client.setName("Marina");
    	Assertions.assertEquals("Marina", client.getName());
    	Assertions.assertEquals(1, client.getId());
    }
    
    @Test
    public void testCreateTravel() {
    	client.createTravel("France");
    	client.createTravel("Italy");
    	// We are chekcing it set the country name 
    	Assertions.assertEquals(client.getTravel().get(0).getCountry().getCountryName(), "France");
    	Assertions.assertEquals(client.getTravel().get(1).getCountry().getCountryName(), "Italy");
    	//We are checking null input 
    	assertThrows(NullPointerException.class,
	            ()->{
	            	ClientTest.client.createTravel(null);
	            });
    }
    
    @Test
    public void testGetTravel() {
    	Travel t = client.createTravel("France");
    	assertTrue(client.getTravel().contains(t));
    }
    
    @Test
    public void testGetterAndSetterCountryName() {
        client.setCountryDest("Lebanon");
        assertEquals(client.getCountryDest().getCountryName(), "Lebanon");
    }
   
}