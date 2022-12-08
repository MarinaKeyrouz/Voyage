package TravelImplementationTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import TravelSong.ClientFriend;

class ClientFriendTest {
	private static ClientFriend adapter;
	
	@BeforeAll
	public static void testClientFriend() {
		assertThrows(NullPointerException.class,
	            ()->{
	            	new ClientFriend(null);
	            });
        adapter = new ClientFriend("Alexy");
	}

	@Test
	public void testEntertain() {
		assertThrows(NullPointerException.class,
	            ()->{
	            	ClientFriendTest.adapter.entertain(null, null);
	            });
		assertEquals(adapter.entertain("Music", "Rock"), "This song: Rock is being played");
	}

}
