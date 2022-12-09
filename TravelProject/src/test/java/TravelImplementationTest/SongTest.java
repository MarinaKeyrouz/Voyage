package TravelImplementationTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import song.Song;

public class SongTest {
	Song djadja;
    public SongTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
    	djadja = new Song("djadja", 1);
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
    public void testSong() {
        assertThrows(NullPointerException.class,
                ()->{
                    new Song(null, 1);
                });
        assertThrows(IllegalArgumentException.class,
                ()->{
                    new Song("djadja", -1);
                });
    }

    @Test
    public void testGetName() {
    	assertEquals("djadja", djadja.getName());
    }
    
    @Test
    public void testGetScore() {
    	assertEquals(1, djadja.getScore());
    }
    
    @Test
    public void testSetScore() {
    	djadja.setScore(0);
    	assertEquals(0, djadja.getScore());
    }
    
    @Test
    public void testReevaluation() {
        assertEquals(0, djadja.reevaluation(-1));
    }
}
