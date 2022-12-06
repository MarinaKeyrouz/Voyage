package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import TravelImplementation.Client;
import TravelImplementation.Country;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_006_Entertain_a_Client {
	
	Client client;
	Country country ;

	@Given("the creation of a client using the (.*)$")
	public void the_creation_of_a_client_using_the_sam() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("the client travels by choosing a (.*) that creates a (.*) instance")
	public void the_client_travels_by_choosing_a_afghanistan_that_creates_a_id_country_afghanistan_instance(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the client can listen to music by choosing his (.*)$.")
	public void the_client_can_listen_to_music_by_choosing_his_this_song_rock_is_being_played() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
}

