package song;

import java.util.Objects;

public class Friend {
    private String name;
    private Playlist playlist;

    public Friend() {
    	this.playlist = new Playlist();
    }
    
    public Friend(String name) {
    	this();
    	Objects.requireNonNull(name);
    	this.name = name;
    }
    
    public Friend(String name, Song song) {
        this(name);
        Objects.requireNonNull(song);
        this.addSong(song);
    }

    public Friend(String name, Playlist playlist) {
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
    
    public Friend compareToFriend(Friend friend) {
        Objects.requireNonNull(friend);
    	if (this.getScore() > friend.getScore()) {
            return this;
        }
        return friend;
    }
    
    public String playSong(String song) {
        Objects.requireNonNull(song);
    	return "This song: " + song + " is being played";
    }
    
}
