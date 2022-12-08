package stepDefinition;

import song.Friend;
import song.Song;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_003_Add_Song_To_Playlist {
	private Song song; 
	private Friend friend;
	
	@Given("^a user (.*)$")
	public void createUtilisateur(String friendName) {
		friend = new Friend(friendName);
		Assert.assertTrue(this.friend != null);
	}
	
	@Given("^a song (.*) with a score (\\d+)$")
	public void createChanson(String songName, int score) {
		song = new Song(songName, score);
		Assert.assertTrue(this.song != null);
	}
	
	@When("^the user adds the song in his playlist$")
	public void addSongToPlaylist() {
		this.friend.addSong(song);
	}
	
	@Then("^the playlist contains the song$")
	public void checkPlaylist() {
		Assert.assertEquals(this.song, this.friend.getPlaylist().getSongs().get(0));
	}
	
}
