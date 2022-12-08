package TravelImplementationTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TravelSong.ClientListener;
import song.Playlist;
import song.Song;

class PlaylistTest {

	Playlist playlist;
	Song djadja;
	
    public PlaylistTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
    	playlist = new Playlist();
    	djadja = new Song("djadja", 1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    	playlist = null;
    	djadja = null;
    }
    
    @Test
    public void testGetSongs() {
        assertEquals(0, playlist.getSongs().size());
    }
    
    @Test
    public void testGetScore() {
        playlist.addSong(djadja);
        assertEquals(1, playlist.getScore());
    }
    
    @Test
    public void testGetScoreOfSong() {
        assertThrows(NullPointerException.class,
                ()->{
                    playlist.getScoreOfASong(null);
                });
        playlist.addSong(djadja);
        assertEquals(1, playlist.getScoreOfASong("djadja"));
        assertEquals(-1, playlist.getScoreOfASong("brbr"));
    }
    
    @Test
    public void testAddSong() {
        assertThrows(NullPointerException.class,
                ()->{
                    playlist.addSong(null);
                });
        playlist.addSong(djadja);
        assertEquals(djadja, playlist.getSongs().get(0));
    }
    
    @Test
    public void testRemoveSong() {
        assertThrows(NullPointerException.class,
                ()->{
                    playlist.removeSong(null);
                });
        playlist.addSong(djadja);
        playlist.removeSong(djadja);
        assertEquals(0, playlist.getSongs().size());
    }
    
    @Test
    public void testRegister() {
    	ClientListener client1 = new ClientListener("test");
    	ClientListener client2 = new ClientListener("test2");
    	client1.getListener().getPlaylist().register(client2.getListener());
    	client1.getListener().addSong(djadja);
    	assertEquals(1, client2.getListener().getPlaylist().getSongs().size());
    }
}
