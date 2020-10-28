
public class ClockSystemVersion1 {

	private static int counter = 0;
	
	public static String alarm(int time)
	{
		//takes a time and outputs a string when the time is up
	}
	
	public static int stopwatch(boolean start)
	{
		// takes a boolean that, if true, starts the timing of the stopwatch. when false, the timer is stopped and the amount of 
		// time the program was running for is returned
		 
	}
	
	public static String timer(int time)
	{
		//takes a time and decrement by one each second until it reaches zero. at zero, display a string saying time is up
	}
	
	public static void main(String[] args)
	{
		// use a scanner to receive input for the alarm function
		System.out.println(alarm(60));
		// should produce a string after 60 seconds of runtime
		
		//uses a scanner to start the stopwatch
		System.out.println(stopwatch(true));
		//uses a scanner to decide when to stop the stopwatch
		// when stopped, it should print the amount of time that the stopwatch had been running for
		
		System.out.println(timer(60));
		// should display a message showing time is up after 60 seconds pass
	}
	
}

/* Explanation for Differences Between Versions
 * -------------------------------------------
 * For alarm: I didn't originally realize that all of the stuff should be done in different methods, so i only included one in the original
 * version. I added the string of alarms so that there was a way to reference what alarms existed, as well as creating them in the first place.
 * 
 * For stopwatch: I made a String to keep track of each time that the user wants to lap with a variable. There are also
 * options for users to be able to pause and stop the stopwatch when they desire.
 * 
 * for Timer: this one is pretty much the same, just in a different class.
 * 
 * For ALL: each system now belongs to its own class. They are all now also being tested in their own main function.
 */
