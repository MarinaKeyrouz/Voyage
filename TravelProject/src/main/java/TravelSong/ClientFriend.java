package TravelSong;

import java.util.Objects;

import song.Friend;
import song.Playlist;

public class ClientFriend {
	
	private Friend friend;
	private Playlist playlist;

	public ClientFriend(String name) {
		Objects.requireNonNull(name);
		friend = new Friend(name);
	}
	
	public Friend getFriend() {
		return this.friend;
	}

	public String entertain(String type, String title) {
		if (type.equals("Music")) {
			return friend.playSong(title);
		}
		return "Wrong format";
	}

	public void update() {
		Playlist playlist = this.playlist.getUpdate(this);
		if (playlist != null) {
			this.friend.setPlaylist(playlist);
			System.out.println("the playlist has been updated : " + playlist.getSongs());
		}
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
