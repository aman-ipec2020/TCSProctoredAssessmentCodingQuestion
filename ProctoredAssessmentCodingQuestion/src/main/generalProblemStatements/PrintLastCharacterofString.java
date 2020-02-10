package main.generalProblemStatements;
/*
 * 		Question 	:	Write a Program to print last character in a String
 * 		Example-1 	:	input:		Hi tcs
 * 						output:		is
 * 
 *		Example-2 	:	input:		Welcome home buddY
 * 						output:		eeY
 * 		
 * 		Example-3 	:	input:		Hi how are you ?
 * 						output:		iweu?
 */
import java.util.Scanner;

public class PrintLastCharacterofString {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		printCharacter(str);
	}

	public static void printCharacter(String str)	{
		
		String[] words = str.split(" ");
		
		for(int i=0;i<words.length;i++)	{
			System.out.print(words[i].charAt(words[i].length()-1));
		}
	}
}
