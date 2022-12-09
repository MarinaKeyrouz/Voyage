package TravelImplementationTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import song.Listener;
import song.Playlist;
import song.Song;

public class ListenerTest {
    private Song song;
    private Listener listener;

    /**
     * Default constructor for test class TestAmi
     */
    public ListenerTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        song = new Song("djadja", 1);
        listener = new Listener("Nicolas", song);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    	song = null;
    	listener = null;
    }
    
    @Test
    public void testGetScore() {
    	assertEquals(1, listener.getScore());
    }
    
    @Test
    public void testGetName() {
    	assertEquals("Nicolas", listener.getName());
    }
    
    @Test
    public void testListener() {
    	Playlist playlist = new Playlist();
    	Song song = new Song("test", 1);
    	playlist.addSong(song);
    	Listener listener = new Listener("test", playlist);
    	assertEquals(listener.getPlaylist().getSongs().size(), 1);
    }
    
    @Test
    public void testAddSong() {
    	listener.addSong(song);
    	assertEquals(1, listener.getScore());
    	assertEquals(1, listener.getPlaylist().getSongs().size());
    	listener.addSong(new Song("test", 2));
    	assertEquals(3, listener.getScore());
    	assertEquals(2, listener.getPlaylist().getSongs().size());
    }
    
    @Test
    public void testGetScoreOfASong() {
    	listener.addSong(new Song("test", 2));
    	assertEquals(listener.getScoreOfASong("test"), 2);
    }
    
    @Test
    public void testPlaySong() {
    	assertEquals("This song: djadja is being played", listener.playSong("djadja"));
    }
    
    @Test
    public void testCompareToListener() {
    	Listener listener2 = new Listener("friend2");
    	listener.addSong(new Song("test", 2));
    	listener2.addSong(new Song("test2", 1));
    	assertEquals(listener.compareToListener(listener2), listener);
    	assertEquals(listener2.compareToListener(listener), listener);
    }
    
    @Test
    public void testRemoveSong() {
    	listener.removeSong(new Song("test", 2));
    	assertEquals(1, listener.getScore());
    	assertEquals(1, listener.getPlaylist().getSongs().size());
    	listener.removeSong(song);
    	assertEquals(0, listener.getScore());
    	assertEquals(0, listener.getPlaylist().getSongs().size());
    }
}