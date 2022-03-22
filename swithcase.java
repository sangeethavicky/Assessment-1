
/* Write a program to display the message for the days like if day is monday then print "first day of the week"
Tuesday--second day of week
wed and thursday---Mid day of the week
Friday---last working day
Sat and sunday ---Week end */
import java.util.Scanner;

public class swithcase {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String text=scanner.next();
		
		System.out.println("1:Monday");
		System.out.println("2:Tuesday");
		System.out.println("3:wed and thursday");
		System.out.println("4:Friday");
		System.out.println("5:sat and sunday");
		System.out.println("*****Enter the Option*****");
		String option=scanner.next();
		switch(option)
		{
		case "Monday":
		{
			System.out.println("First day of the week");
			break;
		}
		
		case "Tuesday":
		{
		
			System.out.println("Second day of the week");
		break;
		}
		case "wed and thursday":
		{
		
			System.out.println("Mid day of the week");
		break;
		}
	
		case "Friday":
		{
			System.out.println("Last day of the week");
		break;
		}
		case "sat and sunday":
		{
			System.out.println("Week end");
		break;
		}
		default:System.out.println("check your value");
		{
			
		}
	}
	}
}


