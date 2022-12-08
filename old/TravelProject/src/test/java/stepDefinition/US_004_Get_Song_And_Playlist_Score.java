package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import song.Friend;
import song.Song;

public class US_004_Get_Song_And_Playlist_Score {
	private Song song1;
	private Song song2;
	private Friend friend;
	private int score;
	
	@Given("^a new user (.*)$")
	public void createUtilisateur2(String friendName) {
		friend = new Friend(friendName);
		Assert.assertTrue(this.friend != null);	
	}
	
	@Given("^multiple songs \\((.*), (\\d+)\\), \\((.*), (\\d+)\\)$")
	public void createChanson2(String songName1, int score1, String songName2, int score2) {
		this.song1 = new Song(songName1, score1);
		this.song2 = new Song(songName2, score2);
		Assert.assertTrue(this.song1 != null);
		Assert.assertTrue(this.song2 != null);
		this.friend.addSong(song1);
		this.friend.addSong(song2);
		Assert.assertEquals(2, this.friend.getPlaylist().getSongs().size());
	}
	
	@When("^the user searches for the score$")
	public void addSongToPlaylist2() {
		this.score = this.friend.getScore();
	}
	
	@Then("^the score of the playlist is returned$")
	public void returnScoreOfThePlaylist() {
		Assert.assertEquals(this.song1.getScore() + this.song2.getScore(), this.score);
	}
		
}
