/*=================================================================
 *author: Rick Kock
 *date: 08/01/2016
 *
 *Game will be initialized and started. Variables of players
 *will also be saved
================================================================= */

package zeeslag;

public class Ship {
	private int length;
	private int hits;
	
	public Ship(int length) {
		super();
		this.length = length;
	}
	public int getLength() {
		return length;
	}
}
