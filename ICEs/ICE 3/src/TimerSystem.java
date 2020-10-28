
public class TimerSystem {

	public static String timer(int time)
	{
		//takes a number as input and decrements by one every second. when the counter equals 0, an ending message with be displayed.
		return "Time is up.";
	}
	
	public static void main(String[] args)
	{
		System.out.println(timer(60));
		// will print "Time is up" after 60 seconds have passed.
	}
	
}
