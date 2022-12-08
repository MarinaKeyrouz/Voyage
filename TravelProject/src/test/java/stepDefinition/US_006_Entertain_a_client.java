package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import TravelImplementation.Client;
import TravelImplementation.Country;
import TravelSong.ClientListener;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_006_Entertain_a_client {
	
	private ClientListener client;
	private Country country ;
	private String songName;

	@Given("^the creation of a client using the (.*)$")
	public void the_creation_of_a_client(String clientName) {
	    // Write code here that turns the phrase above into concrete actions
		client = new ClientListener("clientName");
		Assert.assertNotNull(this.client);
	}

	@When("^the client (.*) by choosing a (.*)$")
	public void the_client_travels(String countryName, String travel) {
	    // Write code here that turns the phrase above into concrete actions
		client.createTravel(countryName);
		Assert.assertNotNull(this.client.getTravel());
	}
	
	@Given("^the client chooses a song by using the (.*)$")
	public void the_client_chooses_a_song_by_using_the_rock(String songName) {
	    // Write code here that turns the phrase above into concrete actions
	    this.songName=songName;
	}

	@Then("^the client can listen to (.*)$")
	public void the_client_can_listen_to_music(String song) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(client.entertain("Music", this.songName),song);

	}
	
}
