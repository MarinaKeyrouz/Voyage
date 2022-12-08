package song;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Playlist {
	private ArrayList<Song> songs;
	private int score;
	private List<Listener> observers;
	private boolean changed;
	
	public Playlist() {
		this.songs = new ArrayList<Song>();
		this.observers = new ArrayList<Listener>();
		this.score = 0;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public ArrayList<Song> getSongs() {
		return this.songs;
	}
	
	// when we add a new song the publisher gonna notify all Listeners
	public void addSong(Song song) {
		Objects.requireNonNull(song);
		if (!this.songs.contains(song)) {
			this.songs.add(song);
			this.score += song.getScore();
			this.changed = true;	
			notifyObservers();
		}		
	}
	
	public void removeSong(Song song) {
		Objects.requireNonNull(song);
		if (this.songs.contains(song)) {
			this.songs.remove(song);
			this.score -= song.getScore();
			this.changed = true;
			notifyObservers();
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
	

	public void register(Listener observer) {
		Objects.requireNonNull(observer);
		if(!observers.contains(observer)) {
			observer.setPlaylist(this);
			observers.add(observer);
		}
	}

	public void unregister(Listener obj) {
		Objects.requireNonNull(obj);
		observers.remove(obj);
	}
	
	public void notifyObservers() {
		List<Listener> observersLocal = null;
		if (!changed)
			return;
		observersLocal = new ArrayList<>(this.observers);
		this.changed = false;
		for (Listener listener : observersLocal) {
			listener.update();
		}
	}

	public Playlist getUpdate() {
		return this;
	}
	
	public String toString() {
		return this.getSongs().toString();
	}

}
