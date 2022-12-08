package TravelSong;

import java.util.Objects;

import TravelImplementation.Client;
import song.Listener;
import song.Playlist;

public class ClientListener extends Client {
	
	private Listener listener;

	public ClientListener(String name) {
		Objects.requireNonNull(name);
		listener = new Listener(name);
	}

	public Listener getListener() {
		return this.listener;
	}

	@Override
	public String entertain(String type, String title) {
		if (type.equals("Music")) {
			return this.listener.playSong(title);
		}
		return "Wrong format";
	}

	public void setPlaylist(Playlist playlist) {
		Objects.requireNonNull(playlist);
		this.listener.setPlaylist(playlist);
	}
}
