
public class AlarmSystem {

	private static String timeSet = "";
	
	public static String setAlarm(String time)
	{
		// takes a time and adds that amount to the string timeSet.
		//returns a message using timeSet
		return timeSet;
	}
	
	public static String deleteAlarm(String time)
	{
		// takes a time and searches through timeSet. if timeSet contains that time, the time is deleted from the string.
		// returns the updated string without the deleted time
		return timeSet;
	}
	
	public static String activateAlarm(String time)
	{
		// searches through the String of alarms that you have. if an alarm is present, a timer will begin counting to that time.
		// if it is not present, an error message will display
		// when the given time is reached, a message will display when the time is reached, and the alarm will deactivate
		return "It is " +time;
	}
	
	public static void main(String[] args)
	{
		System.out.println(setAlarm("10:00 AM"));
		// creates an alarm for 10 and returns timeSet
		System.out.println(activateAlarm("10:00 AM"));
		// creates an alarm for 10 and when it reaches that time prints "It is 10:00 AM"
		System.out.println(deleteAlarm("10:00 AM"));
		//deletes an alarm for 10 and returns whatever is left in timeSet
	}
}
