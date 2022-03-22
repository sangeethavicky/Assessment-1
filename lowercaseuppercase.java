/*Write a program to check whether given char is lower case or upper case.*/import java.util.Scanner;
public class lowercaseuppercase {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Letter: ");
		char ch=scanner.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("This is Uppercase");
		}
		else if(ch>='a'&& ch<='z')
		{
			System.out.println("This is Lowercase");
		}
	}

}
