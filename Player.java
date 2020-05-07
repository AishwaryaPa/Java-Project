/*
Name:          Aishwarya Panchumarty
File:          Player.java
Date:          12/12/17
Description:   This class keeps information about each player. 

*/

import java.util.List;
import java.util.ArrayList;

public class Player{
    private int points;
    private int guesses; 
    private List<Integer> matches = new ArrayList<Integer>();    // Matches per single turn for player
    private int longestStreak;
    
    public Player(){
	this.points = 0;
	this.guesses = 0;
    }

    public void setPoints(int numPoints){
	points = points + numPoints;
    }

    public int getPoints(){
	return points;
    }

    public void setMatches(int numMatches){
	matches.add(numMatches);
    }

    public List<Integer> getMatches(){
	return matches;
    }

    public void setGuesses(int numGuesses){
        guesses = guesses + numGuesses;
    }

    public int getGuesses(){
	return guesses;
    }

    public int getLongestStreak(){
	longestStreak = 0;
	for(int i = 0; i < matches.size(); i++){
	    if (matches.get(i) > longestStreak){
		longestStreak = matches.get(i);
	    }
	}

	return longestStreak;
    }
}
