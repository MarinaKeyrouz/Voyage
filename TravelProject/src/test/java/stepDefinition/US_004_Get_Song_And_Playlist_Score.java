package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import song.Friend;
import song.Song;

public class US_004_Get_Song_And_Playlist_Score {
	private Friend friend;
	private int score;
	
	@Given("^a new user (.*)$")
	public void createFriend(String friendName) {
		friend = new Friend(friendName);
		Assert.assertNotNull(this.friend);
	}
	
	@Given("^multiple songs \\((.*), (\\d+)\\), \\((.*), (\\d+)\\)$")
	public void createSong2(String songName1, int score1, String songName2, int score2) {
		Song song1 = new Song(songName1, score1);
		Song song2 = new Song(songName2, score2);
		Assert.assertNotNull(song1);
		Assert.assertNotNull(song2);
		this.friend.addSong(song1);
		this.friend.addSong(song2);
		Assert.assertEquals(2, this.friend.getPlaylist().getSongs().size());
	}
	
	@When("^the user searches for the score$")
	public void addSongToPlaylist2() {
		this.score = this.friend.getScore();
	}
	
	@Then("^the score (\\d+) of the playlist is returned$")
	public void returnScoreOfThePlaylist(int score) {
		Assert.assertEquals(score, this.score);
	}
		
}
