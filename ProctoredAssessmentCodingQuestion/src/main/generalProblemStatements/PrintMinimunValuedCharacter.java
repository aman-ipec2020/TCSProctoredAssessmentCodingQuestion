package main.generalProblemStatements;

import java.util.Scanner;

public class PrintMinimunValuedCharacter {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		minimumValuedCharacter(str);
	}

	public static char minimumValuedCharacter(String str)	{
		int min = 1111;
		
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++)	{
			if(arr[i] < min)	{
				min = arr[i];
			}
		}
		
		char ch = (char) min;
		System.out.println(ch);
		return '\0';
	}
}
