package hello;
 //enum
public class WorkingDays {
enum Days
{	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}
public static void main(String args[])
{
	for(Days d: Days.values())
	{
		weekend(d);
}
}
private static void weekend(Days d)
{
	if(d.equals(Days.SUNDAY))
		System.out.println("value="+d+"is a Holiday");
	else
		System.out.println("value="+d+"is a Working day");
}
}