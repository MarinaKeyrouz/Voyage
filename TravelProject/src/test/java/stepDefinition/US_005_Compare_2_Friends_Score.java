package stepDefinition;

import song.Listener;
import song.Song;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_005_Compare_2_Friends_Score {
	private Listener listener1;
	private Listener listener2;
	private Listener winner;
	private Song song1 = new Song("djadja", 1);
	private Song song2 = new Song("test", 3);
	private Song song3 = new Song("test2", 5);
	
	@Given("two users : (.*), (.*)$")
	public void createListeners(String friendName1, String friendName2) {
		listener1 = new Listener(friendName1);
		listener2 = new Listener(friendName2);
		Assert.assertNotNull(this.listener1);
		Assert.assertNotNull(this.listener2);
	}
	
	@Given("^three songs : \\((.*), (\\d+)\\), \\((.*), (\\d+)\\), \\((.*), (\\d+)\\) the first song is added to the first friend and the rest are added to the second$")
	public void createSongs(String songName1, int score1, String songName2, int score2, String songName3, int score3) {
		song1 = new Song(songName1, score1);
		song2 = new Song(songName2, score2);
		song3 = new Song(songName3, score3);
		Assert.assertTrue(this.song1 != null);
		Assert.assertTrue(this.song2 != null);
		Assert.assertTrue(this.song3 != null);
		this.listener1.addSong(song1);
		this.listener2.addSong(song2);
		this.listener2.addSong(song3);
		Assert.assertEquals(1, this.listener1.getPlaylist().getSongs().size());
		Assert.assertEquals(2, this.listener2.getPlaylist().getSongs().size());
	}
	
	@When("^a user compares himself to another user$")
	public void compare() {
		this.winner = this.listener1.compareToListener(listener1);
	}
	
	@Then("^the user (.*) with the highest score is returned$")
	public void compareUsers(String winner) {
		Assert.assertEquals(winner, this.winner.getName());
	}
	
}
