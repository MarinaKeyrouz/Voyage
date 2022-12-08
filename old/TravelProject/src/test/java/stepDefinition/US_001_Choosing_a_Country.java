package stepDefinition;


import org.junit.Assert;

import TravelImplementation.Client;
import TravelImplementation.Country;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_001_Choosing_a_Country {
	
	Client client;
	Country country ;
	
	@Given("a country and a client")
	public void a_country_and_a_client() {
	    // Write code here that turns the phrase above into concrete actions
		country = new Country();
		client = new Client();
		Assert.assertTrue(this.country!=null);
		Assert.assertTrue(this.client!=null);
	}

	@Given("the country contains a (.*) and its (.*)$")
	public void the_country_contains(String countryName, String travelMode) {
	    // Write code here that turns the phrase above into concrete actions
		country.setCountryName(countryName);
		country.addTravelModes(travelMode);
	}

	@Given("the client contains a (.*)$")
	public void the_client_contains(String clientName) {
	    // Write code here that turns the phrase above into concrete actions
	    client.setName(clientName);
	}

	@When("the client create a travel instance using the (.*)$")
	public void create_travel_using_country_destination(String countryDest) {
	    // Write code here that turns the phrase above into concrete actions
	   client.createTravel(countryDest);
	   Assert.assertTrue(this.client.getTravel()!=null);
	}

	@Then("^a (.*) instance is created.")
	public void a_travel_instance_is_created_and_the_travel_details_is_printed_using_id_country_afghanistan_travel_mode_airplane(String output) {
	    // Write code here that turns the phrase above into concrete action
	   Assert.assertTrue(client.getCountryDest().getCountryName().equals(country.getCountryName()));
	   Assert.assertTrue(client.getTravel().get(0).toString().equals(output));
	}
}
