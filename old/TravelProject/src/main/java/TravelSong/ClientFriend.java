package TravelSong;

import TravelImplementation.Client;
import TravelImplementation.ClientInterface;
import TravelImplementation.Travel;
import song.Friend;
import song.FriendInterface;
import song.Song;

public class ClientFriend implements ClientInterface {
	
	Friend friend;

	public ClientFriend(String name) {
		friend = new Friend(name);
	}
	
	@Override
	public String entertain(String type, String title) {
		if (type.equals("Music")) {
			return friend.playSong(title);
		}
		return "Wrong format";
	}
}
