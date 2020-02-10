package main.generalProblemStatements;
/*
 * 		Question	:	Define Method in solution class to read a number (without digits).
 * 						The program should display the answer which is addition of those digits.
 * 
 * 		Example-1	:	input	: 123
 * 						output	: 6
 */
import java.util.Scanner;

public class PrintAdditionOfDigits {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Digit : ");
		int num = sc.nextInt();
		
		System.out.println(additionOfDigits(num));
	}

	public static int additionOfDigits(int num)	{
		
		int n = num;
		int rem;
		int sum = 0;
		
		while(n>0)	{
			rem = n%10;			//	return last digit of the number
			sum = sum + rem;	//	add last digit
			n = n/10;			//	reduce number by 1-digit			
		}
		
		return sum;
	}
}