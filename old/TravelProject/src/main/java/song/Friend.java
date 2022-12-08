package song;

import java.util.Objects;

public class Friend implements FriendInterface{
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
        this.addSong(song);
    }

    public Friend(String name, Playlist playlist) {
    	this(name);
    	this.playlist = playlist;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Playlist getPlaylist() {
        return this.playlist;
    }
    
    public void addSong(Song song) {
    	this.playlist.addSong(song);
    }
    
    public void removeSong(Song song) {
    	this.playlist.removeSong(song);
    }
    
    public int getScore() {
    	return this.playlist.getScore();
    }
    
    public int getScoreOfASong(String songName) {
    	return this.playlist.getScoreOfASong(songName);
    }
    
    public boolean compareToFriend(Friend friend) {
    	return this.getScore() > friend.getScore();
    }
    
    public String playSong(String song) {
    	return "This song: "+song+" is being played";
    }
    
}
