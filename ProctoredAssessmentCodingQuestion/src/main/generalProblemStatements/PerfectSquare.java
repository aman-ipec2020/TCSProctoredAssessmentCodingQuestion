package main.generalProblemStatements;
/*
 * 		Question : 	In main method read an integer (containing only numeric digits
 * 					without decimal and special Characters) and check whether the
 * 					given number is perfect square or not. If it is print TRUE else
 * 					print FALSE.  
 */
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("ANSWER : " + calculatePerfectSquare(num));
	}
	
	public static boolean calculatePerfectSquare(int num)	{
		
		double k = Math.sqrt(num);
		if((int)k == k)
			return true;
		else
			return false;
	}
}
