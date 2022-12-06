package TravelImplementationTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import TravelImplementation.Client;
import TravelSong.ClientFriend;
import song.Friend;

class ClientFriendTest {
	private static ClientFriend adapter;
	
	@BeforeAll
	public static void testClientFriend() {
        adapter = new ClientFriend("Alexy");
	}

	@Test
	public void testEntertain() {
		assertThrows(NullPointerException.class,
	            ()->{
	            	ClientFriendTest.adapter.entertain(null,null);
	            });
		assertEquals(adapter.entertain("Music", "Rock"), "This song: Rock is being played");
	}

}
