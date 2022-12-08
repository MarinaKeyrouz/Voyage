package TravelImplementationTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import song.Friend;
import song.Song;

public class TestFriend {
    private Song song;
    private Friend friend;

    /**
     * Default constructor for test class TestAmi
     */
    public TestFriend() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        song = new Song("djadja", 1);
        friend = new Friend("Nicolas", song);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testGetScore() {
    	assertEquals(1, friend.getScore());
    }
    
    @Test
    public void testGetName() {
    	assertEquals("Nicolas", friend.getName());
    }
    
    @Test
    public void testAddSong() {
    	friend.addSong(song);
    	assertEquals(1, friend.getScore());
    	assertEquals(1, friend.getPlaylist().getSongs().size());
    	friend.addSong(new Song("test", 2));
    	assertEquals(3, friend.getScore());
    	assertEquals(2, friend.getPlaylist().getSongs().size());
    }
    
    @Test
    public void testRemoveSong() {
    	friend.removeSong(new Song("test", 2));
    	assertEquals(1, friend.getScore());
    	assertEquals(1, friend.getPlaylist().getSongs().size());
    	friend.removeSong(song);
    	assertEquals(0, friend.getScore());
    	assertEquals(0, friend.getPlaylist().getSongs().size());
    }
}
