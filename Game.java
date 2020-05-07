/*
Name:          Aishwarya Panchumarty
File:          Game.java
Date:          12/12/17
Description:   This is where the game actually begins. Two player are 
               asked to pick cards until the pairs have been matched.
	       Finally the results are written to a file called data.txt
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Game{
    private Player player1 = new Player();
    private Player player2 = new Player();
    private int gameCount;
    private int matchesFound;
    private List<Card> deck;
    private int turn;
    private int numCards;

    public Game(int gameCount){
	this.gameCount = gameCount;
	this.matchesFound = 0;
	this.turn = 1;
	this.numCards = 52;
	
	SetUpDeck setCards = new SetUpDeck();
	deck = setCards.getDeck();
    }
    
    public void startGame(){
	Boolean stop = false;
	while(numCards != 0){
	    printDeck();
	    printWhoseTurn();
	   
	    int card1 = getUserInput();
	    int card2 = getUserInput();
	    
	    checkCards(card1, card2);
	}
       
    }

    public void printDeck(){
	String printStatement = "| ";
	for (int i = 1; i < deck.size(); i++){
	    if (i == 13 || i == 26 || i == 39 || i == 52){
		System.out.println("|----------------------------------------------------------------|");
		if (i == 13){
		    System.out.println("| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 | 11 | 12 | 13 |");
		}

		else if(i == 26){
		    System.out.println("| 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 | 23 | 24 | 25 | 26 |");
		}

		else if(i == 39){
		    System.out.println("| 27 | 28 | 29 | 30 | 31 | 32 | 33 | 34 | 35 | 36 | 37 | 38 | 39 |");
		}
		else if(i == 52){
		    System.out.println("| 40 | 41 | 42 | 43 | 44 | 45 | 46 | 47 | 48 | 49 | 50 | 51 | 52 |");
		}
		
		printStatement = printStatement + deck.get(i).getStatus() + " |";
		System.out.println(printStatement);
		printStatement = "| ";
	    }
	    
	    else{
		printStatement = printStatement + deck.get(i).getStatus() + " | ";		
	    }
	}

	System.out.println("|----------------------------------------------------------------|");
    }

    public void printWhoseTurn(){
	System.out.println("");
	if (turn == 1){
	    System.out.println("Player 1 Turn");
	}

	else if (turn == 2){
	    System.out.println("Player 2 Turn");
        }
	System.out.println("");
    }

    public int getUserInput(){
	System.out.println("Please select a card number(1 - 52)");
	Scanner read = new Scanner(System.in);
	int index = read.nextInt();

	while (index <= 0 || index > 52 || ((deck.get(index).getStatus()).equals("XX"))){
	    System.out.println("Please select a valid number (1 - 52) and a card that has not been matched");
	    index = read.nextInt();
	}

	return index;
    }

    public void checkCards(int card1, int card2){
	if (((deck.get(card1).getNumber()).equals(deck.get(card2).getNumber())) && 
	    ((deck.get(card1).getColor()).equals(deck.get(card2).getColor())))
	    {
		System.out.println("Congrats! You matched the cards " + 
				   deck.get(card1).getPrintVal() + " and  " +
				   deck.get(card2).getPrintVal());
		
		deck.get(card1).setStatus("XX");
		deck.get(card2).setStatus("XX");
		matchesFound = matchesFound + 1;
		numCards = numCards - 2;
		increasePoints();
	    }

	else{
	    System.out.println("You mismatched the cards " +
			       deck.get(card1).getPrintVal() + " and " +
			       deck.get(card2).getPrintVal());
	
	    swapTurns();
	    
	}
	
	if (numCards == 0){
	    swapTurns();
	}

	increaseGuesses();
    }
	    
    public void increasePoints(){
	if(turn == 1){
	    player1.setPoints(1);
	}

	else if (turn == 2){
	    player2.setPoints(1);
	}
    }
	
    public void increaseGuesses(){
	if(turn == 1){
	    player1.setGuesses(1);
        }

        else if (turn == 2){
            player2.setGuesses(1);
	}
    }

    public void swapTurns(){
	if (turn == 1){
	    player1.setMatches(matchesFound);
	    turn = 2;
	}
	
	else{
	    player2.setMatches(matchesFound);
	    turn = 1;
	}

	matchesFound = 0;

    }

    public void declareWinner(){
	int player1Points = player1.getPoints();
        int player2Points = player2.getPoints();
	
	if (player1Points > player2Points){
	    System.out.println("Player 1 is the winner");
	}
	else if (player1Points < player2Points){
	    System.out.println("Player 2 is the winner");
	}
	
	else{
	    System.out.println("Its's a tie");
	}
    }

    public void writeFile()throws IOException {
	int player1Points = player1.getPoints();
	int player2Points = player2.getPoints();
	int totalGuesses = player1.getGuesses() + player2.getGuesses();

        List<Integer> player1Matches = player1.getMatches();
        List<Integer> player2Matches = player2.getMatches();
	
	String statement1 = Integer.toString(player1Matches.get(0));
	for(int i = 1; i < player1Matches.size(); i++){
	    statement1 = statement1 + " " + player1Matches.get(i);
	}
	
	String statement2 = Integer.toString(player2Matches.get(0));
        for(int i = 1; i < player2Matches.size(); i++){
            statement2 = statement2+ " " + player2Matches.get(i);
        }

	System.out.println("");
	System.out.println("What is the filename?");
	Scanner read = new Scanner(System.in);
	String fileName = read.nextLine();

	try
	    {
		PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
		output.println(gameCount);
		output.println(player1Points);
		output.println(player2Points);
		output.println(totalGuesses);	
		output.println(player1.getLongestStreak());
		output.println(player2.getLongestStreak());
		output.close();
		
	    }
	
	catch (IOException ex)  
	    {
		System.err.println("Could not open file data.txt");
	    }
    }
}