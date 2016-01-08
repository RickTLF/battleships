/*=================================================================
 *author: Rick Kock
 *date: 08/01/2016
 *Description: Every player has his own name and Field.
================================================================= */

package zeeslag;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
	private String name;
	private Field field;
	
	public Player(String name, Field field) {
		this.name = name;
		this.field = field;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}
	
	//Validate input
	public void validateInput() {
		Scanner sc = new Scanner(System.in);;
		int userInput; 
		
		try {
			//Number of players.
			System.out.print("Please enter the number of players(1/2): ");
			userInput = sc.nextInt();
		} catch(InputMismatchException exception) {
			System.out.println("This is not an integer.");
		}
	}
	
}
