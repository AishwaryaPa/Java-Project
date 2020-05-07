/*
Name:          Aishwarya Panchumarty
File:          Proj.java
Date:          12/12/17
Description:   Main driver of the entire project
*/
import java.io.IOException;
import java.util.Scanner;

public class Proj{

    public static void main(String[] args)throws IOException{
	int count = 0;
	boolean stop = false;
	String answer;
	while(stop != true){
	    count = count + 1;

	    System.out.println("");
	    Game game = new Game(count);
	    game.startGame();
	    game.declareWinner();
	    game.writeFile();
	    
	    System.out.println("");
            System.out.println("Would you like to initiate another game? ('y' or 'n')");
            Scanner read = new Scanner(System.in);
            answer = read.nextLine();

	    if (answer.equals("n")){
		stop = true;
	    }
	}
    }
}