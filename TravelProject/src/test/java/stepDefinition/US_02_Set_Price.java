package stepDefinition;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

import TravelImplementation.Country;
import TravelImplementation.Travel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_02_Set_Price {
	
	Travel travel ;
	Country country;
	
	@Given("a travel")
	public void a_travel() {
	    // Write code here that turns the phrase above into concrete actions
	    travel = new Travel();
	    Assert.assertTrue(this.travel!=null);
	}

	@Given("the travel contains a Country")
	public void the_travel_contains_a_country() {
	    // Write code here that turns the phrase above into concrete actions
	    country = new Country();
	    Assert.assertTrue(this.country!=null);
	}

	@Given("the Country contains (.*) and (.*)$")
	public void the_country_contains_afghanistan_and_airplane(String countryName, String travelModes) {
	    // Write code here that turns the phrase above into concrete actions
	    this.country.setCountryName(countryName);
	    this.country.addTravelModes(travelModes);
		travel.setCountry(country);
		Assert.assertTrue(this.travel!=null);
		Assert.assertTrue(this.country!=null);
	}

	@When("the agent set the {double}")
	public void the_agent_set_the(double price) {
	    // Write code here that turns the phrase above into concrete actions
	    travel.setPrice(price);
	}

	@Then("the {double} should be updated.")
	public void the_price_should_be_updated(double price) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(travel.getPrice(), price);
	}
}
