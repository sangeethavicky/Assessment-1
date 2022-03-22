
/*Write a Java program to get a number from the user and print whether it is positive or negative. 

Test Data
Input number: 35
Expected Output :
Number is positive*/
import java.util.Scanner;
public class positivenagative {

	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Test Data");
		System.out.println("Inputnumer:");
		int inputnumber=scanner.nextInt();
		if(inputnumber>0)
		{
			System.out.println("Expected output:");
			System.out.println("Number is Positive");
		}
		else 
		{
			System.out.println("Expected output:");
			System.out.println("Number is nagative");
		
			
		}
	}
}
