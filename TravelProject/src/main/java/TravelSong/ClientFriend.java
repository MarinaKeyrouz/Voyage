package TravelSong;

import java.util.Objects;

import TravelImplementation.Client;
import song.Friend;
import song.Playlist;

public class ClientFriend extends Client {
	
	private Friend friend;

	public ClientFriend(String name) {
		Objects.requireNonNull(name);
		friend = new Friend(name);
	}

	public Friend getFriend() {
		return this.friend;
	}

	@Override
	public String entertain(String type, String title) {
		if (type.equals("Music")) {
			return this.friend.playSong(title);
		}
		return "Wrong format";
	}

	public void update() {
		Playlist playlist = this.friend.getPlaylist().getUpdate(this);
		if (playlist != null) {
			this.friend.setPlaylist(playlist);
			System.out.println("the playlist has been updated : " + playlist.getSongs());
		}
	}

	public void setPlaylist(Playlist playlist) {
		Objects.requireNonNull(playlist);
		this.friend.setPlaylist(playlist);
	}
}
