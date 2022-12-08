package song;
import TravelSong.ClientFriend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Playlist {
	private ArrayList<Song> songs;
	private int score;
	private List<ClientFriend> observers;
	private boolean changed;
	
	public Playlist() {
		this.observers = new ArrayList<>();
		this.songs = new ArrayList<Song>();
		this.score = 0;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public ArrayList<Song> getSongs() {
		return this.songs;
	}
	
	public void addSong(Song song) {
		Objects.requireNonNull(song);
		if (!this.songs.contains(song)) {
			this.songs.add(song);
			this.score += song.getScore();
		}
	}
	
	public void removeSong(Song song) {
		Objects.requireNonNull(song);
		if (this.songs.contains(song)) {
			this.songs.remove(song);
			this.score -= song.getScore();
		}			
	}
	
	public int getScoreOfASong(String songName) {
		Objects.requireNonNull(songName);
		Iterator<Song> iterator = this.songs.stream()
				.filter(song -> song.getName().equals(songName))
				.iterator();
		if (iterator.hasNext()) {
			return iterator.next().getScore();
		}
		return -1;
	}

	public void register(ClientFriend obj) {
		Objects.requireNonNull(obj);
		if(!observers.contains(obj)) {
			observers.add(obj);
		}
	}

	public void unregister(ClientFriend obj) {
		Objects.requireNonNull(obj);
		observers.remove(obj);
	}
	
	public void notifyObservers() {
		List<ClientFriend> observersLocal = null;
		if (!changed)
			return;
		observersLocal = new ArrayList<>(this.observers);
		this.changed=false;
		for (ClientFriend obj : observersLocal) {
			obj.update();
		}
	}

	public Playlist getUpdate(ClientFriend obj) {
		Objects.requireNonNull(obj);
		return this;
	}

	public void broadcastSong(String songName, int score) {
		Objects.requireNonNull(songName);
		this.changed = true;
		Song newSong = new Song(songName, score);
		this.addSong(newSong);
		notifyObservers();
	}
	
	public String toString() {
		return this.getSongs().toString();
	}
}
