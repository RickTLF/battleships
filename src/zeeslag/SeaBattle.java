/*=================================================================
 *author: Rick Kock
 *date: 08/01/2016
 *Description: Game should be initialized. Ships must be placed
 *on random fields. They should overlap eachother.
================================================================= */

package zeeslag;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeaBattle {
	private Player player1;
	private Player player2;
	
	
	
	
	public SeaBattle(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}


	public void play() {
		
		
		//Give a warm welcome.
		System.out.println("Welcome to battleships!");
		
		//Intro.
		System.out.println("Try to destroy your opponent's ship before he destroys yours.");
		
		//Validate number of players entered by user.
		player1.validateInput();
		
		//Request player name.
		System.out.println("What is your name?");
	}
}
