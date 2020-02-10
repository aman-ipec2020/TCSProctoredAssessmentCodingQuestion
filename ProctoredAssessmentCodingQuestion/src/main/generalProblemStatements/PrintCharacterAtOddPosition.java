package main.generalProblemStatements;
/*
 * 		Question	:	Write a Program to print character at odd position
 * 						of a String.
 * 
 * 		Example-1	:	input:	matrix
 * 						output:	mti
 * 		
 * 		Example-2	:	input:	Hi how are you?
 * 						output:	h o r o ?
 */
import java.util.Scanner;

public class PrintCharacterAtOddPosition {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		printCharacter(str);
	}
	
	public static void printCharacter(String str)	{
		for(int i = 0;i<str.length(); i++)	{
			if(i%2 == 0)
				System.out.print(str.charAt(i));
		}
	}

}
