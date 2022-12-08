package song;

public interface FriendInterface {
	
	 public void addSong(Song song);
	    
	    public void removeSong(Song song);
	    
	    public int getScore();
	    
	    public int getScoreOfASong(String songName);
	    
	    public boolean compareToFriend(Friend friend);
	    
	    public String playSong(String song);

}
