import java.util.Scanner;
import java.util.*;
public class Datestamp
{
	public static void main(String[]args)
	{
		Calendar c=Calendar.getInstance();
		Date today=c.getTime();
		System.out.println("The current date is:"+today);
		c.add(c.DAY_OF_YEAR,1);
		Date tomorrow=c.getTime();
		System.out.println("Tomorrow date:"+tomorrow);
	}
}