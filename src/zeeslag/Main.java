/*=================================================================
 *author: Rick Kock
 *date: 08/01/2016
 *
 *Description:
================================================================= */

package zeeslag;

public class Main {

	public static void main(String[] args) {
		Field field1 = new Field();
		Field field2 = new Field();
		Player player1 = new Player("Rick", field1);
		Player player2 = new Player("Verney", field2);;
		
		SeaBattle seaBattle;
		seaBattle = new SeaBattle(player1, player2);
		seaBattle.play();
		
	}

}
