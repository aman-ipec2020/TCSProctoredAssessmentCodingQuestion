package main.generalProblemStatements;

/*
 * 		Question	:	Write a Program to print no. of spaces and 
 * 						Characters in a given input
 *	
 * 		Example-1	:	Input	:	Hello This is ABCD from XYZ city
 * 						Output 	:	no. of spaces    : 6 
 * 									no. of character : 26
 */	

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		countCharacter(str);
	}
	
	public static void countCharacter(String str)	{
		
		int chCount = 0;
		int spaceCount = 0;
		
		for(int i=0;i<str.length();i++)	{
			if(str.charAt(i) == ' ')
				++spaceCount;
			else
				++chCount;
		}
		
		System.out.println("No. of Character : " + chCount);
		System.out.println("No. of Spaces : " + spaceCount);
	}
}
