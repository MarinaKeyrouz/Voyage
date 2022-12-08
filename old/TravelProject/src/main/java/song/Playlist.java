package song;
import java.util.ArrayList;
import java.util.Iterator;

public class Playlist {
	private ArrayList<Song> songs;
	private int score;
	
	public Playlist() {
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
		if (!this.songs.contains(song)) {
			this.songs.add(song);
			this.score += song.getScore();
		}
	}
	
	public void removeSong(Song song) {
		if (this.songs.contains(song)) {
			this.songs.remove(song);
			this.score -= song.getScore();
		}			
	}
	
	public int getScoreOfASong(String songName) {
    	Iterator<Song> iterator = this.songs.stream()
    			.filter(song -> song.getName().equals(songName))
    			.iterator();
    	if (iterator.hasNext()) {
    		return iterator.next().getScore();
    	}
    	return -1;
    }
	
}
