package song;

import java.util.Objects;

public class Song {
    private String name;
    private int score;

    public Song(String name, int score) {
    	Objects.requireNonNull(name);
    	if (score < 0) {
    		throw new IllegalArgumentException("Score must be positive");
    	}
        this.name = name;
        this.score = score;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void setScore(int score) {
    	this.score = score;
    }
    
    public int reevaluation(int y) {
        this.score += y;
        return this.score;
    }
}
