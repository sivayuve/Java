import java.util.Scanner;
import java.util.regex.Pattern;

public class Password
{
	private static final String pat ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&^+=])(?=.*[8,15]).{8,15}";
    private static final Pattern Pat = Pattern.compile(pat);
private static final String user ="^[a-zA-Z0-9_+&*-+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";
    private static final Pattern User = Pattern.compile(user);
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String Username;
		System.out.println("Ex: you@gmail.com");
		System.out.println("User name:");
        Username=sc.nextLine();
		if(Username.matches(user))
		{
			System.out.println("User name valid");
		}
		else
		{
		    System.out.println("User name not valid");

		}
		String password;
		System.out.println("Must have 8 characters - upper lower num & special character");
		System.out.println("Pass word:");
        password=sc.nextLine();
		if(password.matches(pat))
		{
			System.out.println("Password valid");
		}
		else
		{
		    System.out.println("Password not valid");

		}
	}
}