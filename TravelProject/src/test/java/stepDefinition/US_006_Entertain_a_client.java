package stepDefinition;

import org.junit.Assert;

import TravelSong.ClientListener;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import song.Playlist;
import song.Song;

public class US_006_Entertain_a_client {
	
	private ClientListener client;
	private Playlist playlist;
	private Song song;
	
	@Given("a new client : (.*)$")
	public void createClient(String friendName1) {
		client = new ClientListener(friendName1);
		Assert.assertNotNull(this.client);
	}
	
	@Given("^a playlist$")
	public void createPlaylist() {
		playlist = new Playlist();
		Assert.assertNotNull(this.playlist);
	}
	
	@Given("^a song (.*), (\\d+)$")
	public void createSong(String songName, int score) {
		song = new Song(songName, score);
		Assert.assertNotNull(this.song);
		this.playlist.addSong(song);
	}
	
	@When("^a user subscribe to a playlist$")
	public void subscribeAndUpdate() {
		
	}
	
	@Then("^the song (.*) is in the client playlist$")
	public void songInClientPlaylist(String songName) {
		Assert.assertEquals(songName, this.client.getListener().getPlaylist().getSongs().get(0).getName());
	}
	
	
}
