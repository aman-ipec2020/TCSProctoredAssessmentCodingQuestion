package main.generalProblemStatements;

import java.util.Scanner;

public class PrintMaximumDigitInNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		numberInReverseOrder(num);
		
	}

	public static void numberInReverseOrder(int num)	{
	
		int rem = 0;
		int max = 0;
		
		while(num>0) {
			rem = num%10;
			
			if(rem>max)
				max = rem;
			
			num = num/10;
		}
		
		System.out.println(max);
	}

}
