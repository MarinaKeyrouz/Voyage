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
	private static Client client2;
	
    @BeforeAll
    public static void setUp() {
        client = new Client();
        client2 = new Client("Zahra");
    }
    
    @Test
    public void testGetterAndSetter() {
    	client.setName("Marina");
    	Assertions.assertEquals("Marina", client.getName());
    	Assertions.assertEquals("Zahra", client2.getName());
    	Assertions.assertEquals(4, client.getId());
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
    
    @Test
    public void testToString() {
    	client.setName("Marina");
        assertEquals(client.toString(), "Client [name=Marina, countryDest=Country [countryName=Lebanon, travelModes=[]]]");
    }
    
    @AfterAll
    protected static void tearDown() {
    	client = null;
    	assertNull(client);
    }
   
}