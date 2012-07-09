import java.awt.*;
import acm.program.*;

public class TestStoplight extends ConsoleProgram {
	
	public void init() {
		/** create instance of Stoplight class */
		myLight = new Stoplight();
	}
	
	public void run() {
		
		/**Test 1: Initial State, GREEN*/
		verifyState(Color.GREEN, myLight.getState());
		 myLight.advance();
		 
		/**Test 2: Yellow*/
		 verifyState(Color.YELLOW, myLight.getState());
		 myLight.advance();
		 
		/**Test 3: Red*/
		 verifyState(Color.RED, myLight.getState());
		 myLight.advance();
		 
		/**Test 4: Return to Green*/
		 verifyState(Color.GREEN, myLight.getState());
		 myLight.advance();

/*
 * Confirms whether the actual color of the Stoplight instance matches the expected color. 
 * Prints the result to the console.
 * 
 * @param expectedColor  Initially green, then yellow, then red, then back to green
 * @param actualColor    The current color state of myLight.
 */
	}
	
	private void verifyState(Color expectedColor, Color actualColor) {		
		if (actualColor.equals(expectedColor)) {
			println("PASS: Actual color " + actualColor + "matches expected color " + expectedColor + " as expected.");
		} else {
			println("FAIL: Actual color, " + actualColor + ", does not match expected color, which is " + ".");
		}
	}
	
/** Instance variables */
	Stoplight myLight;
	Color myState;

}
