package TravelImplementationTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import TravelSong.ClientListener;
import song.Playlist;
import song.Song;

class ClientListenerTest {
	private static ClientListener adapter;
	
	@BeforeAll
	public static void testClientFriend() {
		assertThrows(NullPointerException.class,
	            ()->{
	            	new ClientListener(null);
	            });
        adapter = new ClientListener("Alexy");
	}
	
	@Test
	public void testSetPlaylist() {
		Song song = new Song("test", 1);
		Playlist playlist = new Playlist();
		playlist.addSong(song);
		adapter.setPlaylist(playlist);
		assertEquals(1, adapter.getListener().getPlaylist().getSongs().size());
	}
	
	@Test
	public void testEntertain() {
		assertThrows(NullPointerException.class,
	            ()->{
	            	ClientListenerTest.adapter.entertain(null, null);
	            });
		assertEquals(adapter.entertain("Music", "Rock"), "This song: Rock is being played");
	}

}
