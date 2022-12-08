package song;

import java.util.Objects;

public class Listener {
    private String name;
    private Playlist playlist;

    public Listener() {
    	this.playlist = new Playlist();
    }
    
    public Listener(String name) {
    	this();
    	Objects.requireNonNull(name);
    	this.name = name;
    }
    
    public Listener(String name, Song song) {
        this(name);
        Objects.requireNonNull(song);
        this.addSong(song);
    }

    public Listener(String name, Playlist playlist) {
        this(name);
        Objects.requireNonNull(playlist);
    	this.playlist = playlist;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Playlist getPlaylist() {
        return this.playlist;
    }

    public void setPlaylist(Playlist playlist) {
        Objects.requireNonNull(playlist);
        this.playlist = playlist;
    }
    
    public void addSong(Song song) {
        Objects.requireNonNull(song);
    	this.playlist.addSong(song);
    }
    
    public void removeSong(Song song) {
        Objects.requireNonNull(song);
    	this.playlist.removeSong(song);
    }
    
    public int getScore() {
    	return this.playlist.getScore();
    }
    
    public int getScoreOfASong(String songName) {
        Objects.requireNonNull(songName);
    	return this.playlist.getScoreOfASong(songName);
    }
    
    public Listener compareToListener(Listener listener) {
        Objects.requireNonNull(listener);
    	if (this.getScore() > listener.getScore()) {
            return this;
        }
        return listener;
    }
    
    public String playSong(String song) {
        Objects.requireNonNull(song);
    	return "This song: " + song + " is being played";
    }
    
    public void update() {
		Playlist playlist = this.getPlaylist().getUpdate();
		if (playlist != null) {
			this.setPlaylist(playlist);
		}
	}
    
}
