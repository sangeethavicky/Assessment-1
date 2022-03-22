/*Write a program to check whether given number is multiple of 12 or not*/
import java.util.Scanner;

public class multiple {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scanner.nextInt();
		if(num%12==0)
		{
			System.out.println(num+" This is number multiple by 12");
		}
		else
		{
			System.out.println(num+" This is number not multiple by 12");
		}
	}

}
