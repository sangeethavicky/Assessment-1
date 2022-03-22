/*3. Write a Java program that takes a year from user and print whether that year is a leap year or not*/import java.util.Scanner;
public class leapyear {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year=scanner.nextInt();
		
		if(year%4==0)
		{
			System.out.println(year+" is leap year");
			
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
		
	return;
		
	}

}
