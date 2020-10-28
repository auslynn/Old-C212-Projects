
public class StopwatchSystem {

	private static int counter = 0;
	private static String lapTimes = "";
	
	public static int stopwatchActivate(boolean begin)
	{
		//this method starts a stopwatch that will increment the variable counter by 1 each second.
		//after it is activated, more user input will be taken from a scanner.
		// they can choose to pause/resume the timer at this point. if "p" is entered, the timer will stop incrementing. if "r" is entered, the timer will continue incrementing
		// they can also choose to set a lap time. if the user enters "l", the current value of counter will be appended to lapTimes, and lapTimes will be printed.
		// they can also stop/reset the stopwatch. if the user enters "s", the value of counter will be printed and it will stop incrementing.
		// if the user enters "r", counter will return to 0.
		return counter;
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(stopwatchActivate(true));
		//returns however long the stopwatch was running for, and may also print some lap times depending on the inputs in the method
		
	}
	
}
