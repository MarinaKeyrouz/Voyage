package stepDefinition;

import org.junit.Assert;

import TravelSong.ClientListener;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import song.Playlist;
import song.Song;

public class US_007_Subscribe_to_a_Playlist {
	
	private ClientListener client1;
	private ClientListener client2;
	private Playlist playlist;
	
	@Given("^a client c1 named (.*) with a playlist having the songs: (.*), (.*), (.*)$")
	public void a_client_c1(String name, String song1, String song2, String song3) {
	    // Write code here that turns the phrase above into concrete actions
		client1 = new ClientListener(name);
		playlist = new Playlist();
		Song s1 = new Song(song1, 1);
		Song s2 = new Song(song2, 1);
		Song s3 = new Song(song3, 1);
		playlist.addSong(s1);
		playlist.addSong(s2);
		playlist.addSong(s3);
		client1.setPlaylist(playlist);
		Assert.assertNotNull(this.playlist);
		Assert.assertNotNull(this.client1);
	}

	@Given("^another client c2 named (.*)$")
	public void another_client_c2(String name) {
	    // Write code here that turns the phrase above into concrete actions
		client2 = new ClientListener(name);
		Assert.assertNotNull(client2);
	}

	@When("^c1 subscribe to the playlist of c2")
	public void c1_subscribe_to_the_djadja_scientist_viva_la_vida_of_c2() {
	    // Write code here that turns the phrase above into concrete actions
		client1.getFriend().getPlaylist().register(client2);
		client2.update();
	}

	@Then("^the playlist of c2 is in the (.*) of c1")
	public void the_playlist_of_c2_is_in_the_djadja_scientist_viva_la_vida_of_c1(String playlistSongs) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(client2.getFriend().getPlaylist());
		Assert.assertEquals(client2.getFriend().getPlaylist().toString(),playlistSongs);
	}

}
