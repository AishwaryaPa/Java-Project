/*
Name:          Aishwarya Panchumarty
File:          SetUpDeck.java
Date:          12/12/17
Description:   Sets up all the cards so the players are ready to play the game.
*/

import java.util.List;
import java.util.ArrayList;

public class SetUpDeck{
    private List<Card> Deck = new ArrayList<Card>();  

    public SetUpDeck(){ 
	Card card0 = new Card(0, " ", " ", " ", " ", " ");
	Card card1 = new Card(1, "1", "S", "OO", "1S", "Black");
	Card card2 = new Card(2, "J", "D", "OO", "JD", "Red");
	Card card3 = new Card(3, "Q", "C", "OO", "QC", "Black");
	Card card4 = new Card(4, "9", "D", "OO", "9D", "Red");
	Card card5 = new Card(5, "7", "C", "OO", "7C", "Black");
	Card card6 = new Card(6, "4", "C", "OO", "4C", "Black");
	Card card7 = new Card(7, "7", "S", "OO", "7S", "Black");
	Card card8  = new Card(8, "6", "H", "OO", "6H", "Red");
	Card card9  = new Card(9, "9", "C", "OO", "9C", "Black");
	Card card10  = new Card(10, "K", "D", "OO", "KD", "Red");
	Card card11  = new Card(11, "3", "C", "OO", "3C", "Black");
	Card card12  = new Card(12, "J", "C", "OO", "JC", "Black");
	Card card13  = new Card(13, "J", "S", "OO", "JS", "Black");

	Card card14  = new Card(14, "8", "D", "OO", "8D", "Red" );
	Card card15  = new Card(15, "2", "S", "OO", "2S", "Black");
	Card card16  = new Card(16, "1", "H", "OO", "1H", "Red");
	Card card17  = new Card(17, "7", "D", "OO", "7D", "Red");
	Card card18  = new Card(18, "T", "D", "OO", "TD", "Red");
	Card card19  = new Card(19, "6", "S", "OO", "6S", "Black");
	Card card20  = new Card(20, "5", "H", "OO", "5H", "Red");
	Card card21  = new Card(21, "8", "S", "OO", "8S", "Black");
	Card card22  = new Card(22, "7", "H", "OO", "7H", "Red");
	Card card23  = new Card(23, "6", "C", "OO", "6C", "Black");
	Card card24  = new Card(24, "2", "D", "OO", "2D", "Red");
	Card card25  = new Card(25, "Q", "S", "OO", "QS", "Black");
	Card card26  = new Card(26, "K", "H", "OO", "KH", "Red");

	Card card27  = new Card(27, "5", "D", "OO", "5D", "Red");
	Card card28  = new Card(28, "J", "H", "OO", "JH", "Red");
	Card card29  = new Card(29, "3", "S", "OO", "3S", "Black");
	Card card30  = new Card(30, "2", "H", "OO", "2H", "Red");
	Card card31  = new Card(31, "5", "S", "OO", "5S", "Black");
	Card card32  = new Card(32, "4", "H", "OO", "4H", "Red");
	Card card33  = new Card(33, "4", "D", "OO", "4D", "Red");
	Card card34  = new Card(34, "T", "C", "OO", "TC", "Black");
	Card card35  = new Card(35, "9", "S", "OO", "9S", "Black");
	Card card36  = new Card(36, "8", "H", "OO", "8H", "Red");
	Card card37  = new Card(37, "K", "S", "OO", "KS", "Black");
	Card card38  = new Card(38, "T", "H", "OO", "TH", "Red");
	Card card39  = new Card(39, "5", "C", "OO", "5C", "Black");

	Card card40  = new Card(40, "Q", "H", "OO", "QH", "Red");
	Card card41  = new Card(41, "2", "C", "OO", "2C", "Black");
	Card card42  = new Card(42, "8", "C", "OO", "8C", "Black");
	Card card43  = new Card(43, "4", "S", "OO", "4S", "Black");
	Card card44  = new Card(44, "3", "H", "OO", "3H", "Red");
	Card card45  = new Card(45, "Q", "D", "OO", "QD", "Red");
	Card card46  = new Card(46, "1", "C", "OO", "1C", "Black");
	Card card47  = new Card(47, "K", "C", "OO", "KC", "Black"); 
	Card card48  = new Card(48, "3", "D", "OO", "3D", "Red");
	Card card49  = new Card(49, "T", "S", "OO", "TS", "Black");
	Card card50  = new Card(50, "9", "H", "OO", "9H", "Red");
	Card card51  = new Card(51, "6", "D", "OO", "6D", "Red");
	Card card52  = new Card(52, "1", "D", "OO", "1D", "Red");

	Deck.add(card0);
	Deck.add(card1);
	Deck.add(card2);
	Deck.add(card3);
	Deck.add(card4);
	Deck.add(card5);
	Deck.add(card6);
	Deck.add(card7);
	Deck.add(card8);
	Deck.add(card9);
	Deck.add(card10);
	Deck.add(card11);
	Deck.add(card12);
	Deck.add(card13);
	Deck.add(card14);
	Deck.add(card15);
	Deck.add(card16);
	Deck.add(card17);
	Deck.add(card18);
	Deck.add(card19);
	Deck.add(card20);
	Deck.add(card21);
	Deck.add(card22);
	Deck.add(card23);
	Deck.add(card24);
	Deck.add(card25);
	Deck.add(card26);
	Deck.add(card27);
	Deck.add(card28);
	Deck.add(card29);
	Deck.add(card30);
	Deck.add(card31);
	Deck.add(card32);
	Deck.add(card33);
	Deck.add(card34);
	Deck.add(card35);
	Deck.add(card36);
	Deck.add(card37);
	Deck.add(card38);
	Deck.add(card39);
	Deck.add(card40);
	Deck.add(card41);
	Deck.add(card42);
	Deck.add(card43);
	Deck.add(card44);
	Deck.add(card45);
	Deck.add(card46);
	Deck.add(card47);
	Deck.add(card48);
	Deck.add(card49);
	Deck.add(card50);
	Deck.add(card51);
	Deck.add(card52);
	
    }

    public List<Card> getDeck(){
	return Deck;
    }
}