package stepDefinition;

import song.Listener;
import song.Song;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_003_Add_Song_To_Playlist {
	private Song song; 
	private Listener listener;
	
	@Given("^a user : (.*)$")
	public void createFriend(String friendName) {
		listener = new Listener(friendName);
		Assert.assertNotNull(this.listener);
	}
	
	@Given("^a song (.*) with a score (\\d+)$")
	public void createSong(String songName, int score) {
		song = new Song(songName, score);
		Assert.assertNotNull(this.song);
	}
	
	@When("^the user adds the song in his playlist$")
	public void addSongToPlaylist() {
		this.listener.addSong(song);
	}
	
	@Then("^the playlist contains the song (.*)$")
	public void checkPlaylist(String songName) {
		Assert.assertEquals(songName, this.listener.getPlaylist().getSongs().get(0).getName());
	}
	
}
