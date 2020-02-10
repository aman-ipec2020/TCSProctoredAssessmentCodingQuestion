package main.generalProblemStatements;

import java.util.Scanner;

public class PrintMaximunValuedCharacter {

public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		maximunValuedCharacter(str);
	}

	public static char maximunValuedCharacter(String str)	{
		int max = 0;
		
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++)	{
			if(arr[i] > max)
				max = arr[i];
		}
		
		char ch = (char) max;
		System.out.println(ch);
		return '\0';
	}
}
