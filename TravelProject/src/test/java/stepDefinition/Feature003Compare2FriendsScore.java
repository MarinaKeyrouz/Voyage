package stepDefinition;

import song.Friend;
import song.Song;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature003Compare2FriendsScore {
	private Friend friend1;
	private Friend friend2;
	private boolean compare1To2;
	private boolean compare2To1;
	private Song song1 = new Song("djadja", 1);
	private Song song2 = new Song("test", 3);
	private Song song3 = new Song("test2", 5);
	
	@Given("two users : (.*), (.*)$")
	public void createUtilisateurs(String friendName1, String friendName2) {
		friend1 = new Friend(friendName1);
		friend2 = new Friend(friendName2);
		Assert.assertTrue(this.friend1 != null);
		Assert.assertTrue(this.friend2 != null);
	}
	
	@Given("^three songs : \\((.*), (.*)\\), \\((.*), (.*)\\), \\((.*), (.*)\\) are added to the playlists$")
	public void createPremiereChanson(String songName1, int score1, String songName2, int score2, String songName3, int score3) {
		song1 = new Song(songName1, score1);
		song2 = new Song(songName2, score2);
		song3 = new Song(songName3, score3);
		Assert.assertTrue(this.song1 != null);
		Assert.assertTrue(this.song2 != null);
		Assert.assertTrue(this.song3 != null);
		this.friend1.addSong(song1);
		this.friend2.addSong(song2);
		this.friend2.addSong(song3);
		Assert.assertEquals(1, this.friend1.getPlaylist().getSongs().size());
		Assert.assertEquals(2, this.friend2.getPlaylist().getSongs().size());
	}
	
	@When("^a user compares himself to another user$")
	public void compare() {
		compare1To2 = this.friend1.compareToFriend(friend2);
		compare2To1 = this.friend2.compareToFriend(friend1);
	}
	
	@Then("^the user with the highest score is returned$")
	public void compareUsers() {
		Assert.assertEquals(this.song1.getScore() > this.song2.getScore() + this.song3.getScore(), compare1To2);
		Assert.assertEquals(this.song2.getScore() + this.song3.getScore() > this.song1.getScore(), compare2To1);
	}
	
}
