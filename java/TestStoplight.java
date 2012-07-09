import java.awt.*;
import acm.program.*;

public class TestStoplight extends ConsoleProgram {
	
	public void init() {
		/** create instance of Stoplight class */
		myLight = new Stoplight();
	}
	
	public void run() {
		
		/**TEST 1: verify initial state is GREEN */
		myState = myLight.getState();

		if (myState.equals(Color.GREEN)) {
			println("PASS: Initial State is GREEN as expected");
		} else {
			println("FAIL: Initial State is not GREEN.");
		}
		
		/**TEST 2: advance the light. verify next state is YELLOW */
		 myLight.advance();
		 myState = myLight.getState();
			if (myState.equals(Color.YELLOW)) {
				println("PASS: Initial State is YELLOW as expected");
			} else {
				println("FAIL: Initial State is not YELLOW.");
			}
			
		/**TEST 3: advance the light. verify next state is RED */
		 myLight.advance();
		 myState = myLight.getState();
			if (myState.equals(Color.RED)) {
				println("PASS: Initial State is RED as expected");
			} else {
				println("FAIL: Initial State is not RED.");
			}
			
		/**TEST 4: advance the light. verify next state is GREEN */
		 myLight.advance();
		 myState = myLight.getState();
			if (myState.equals(Color.GREEN)) {
				println("PASS: Initial State is GREEN as expected");
			} else {
				println("FAIL: Initial State is not GREEN.");
			}
	}
	
/** Instance variables */
	Stoplight myLight;
	Color myState;

}
