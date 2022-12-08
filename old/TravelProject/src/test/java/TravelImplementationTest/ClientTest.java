package TravelImplementationTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TravelImplementation.Client;
import TravelImplementation.Country;
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
    
    @Test
    public void testGetterAndSetter() {
    	client.setName("Marina");
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
    
    @AfterAll
    protected static void tearDown() {
    	client = null;
    	assertNull(client);
    }
}