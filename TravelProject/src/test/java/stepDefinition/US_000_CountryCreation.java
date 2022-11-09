package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import TravelImplementation.Country;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_000_CountryCreation {

	Country country ;
	List<String> expected = new ArrayList<String>();

	@Given("^the creation of a country using the name (.*)$")
	public void the_creation_of_a_country_using_the_name(String countryName) {
		// Write code here that turns the phrase above into concrete actions
		country = new Country(countryName);
		Assert.assertTrue(this.country != null);
	}

	@When("^an agent enters the travel modes using (.*)$")
	public void tan_agent_enters_the_travel_modes_using_travel_modes(String mode) {
		// Write code here that turns the phrase above into concrete actions
		country.addTravelModes(mode);
		expected.add(mode.toUpperCase());
	}

	@Then("the country and the travel modes are saved and available for the client to choose from.")
	public void the_country_and_the_travel_modes_are_saved_and_available_for_the_client_to_choose_from() {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(this.country.getTravelModes().equals(expected));	
		Assert.assertTrue(!(this.country.getTravelModes().isEmpty()));
	}

}
