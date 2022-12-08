package TravelImplementationTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import song.Playlist;
import song.Song;

class TestPlaylist {

	Playlist playlist;
	Song djadja;
	
    public TestPlaylist() {
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
        playlist.addSong(djadja);
        assertEquals(1, playlist.getScoreOfASong("djadja"));
    }
    
    @Test
    public void testAddrSong() {
        playlist.addSong(djadja);
        assertEquals(djadja, playlist.getSongs().get(0));
    }
    
    @Test
    public void testRemoveSong() {
        playlist.addSong(djadja);
        playlist.removeSong(djadja);
        assertEquals(0, playlist.getSongs().size());
    }
}
