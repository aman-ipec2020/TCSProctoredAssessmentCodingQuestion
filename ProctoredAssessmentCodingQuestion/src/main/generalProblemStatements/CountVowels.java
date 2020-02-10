package main.generalProblemStatements;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		System.out.print(countTotalVowels(str));
	}
	
	public static int countTotalVowels(String str)	{
		
		int vowels = 0;
		for(int i =0;i<str.length();i++)	{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e' ||
					str.charAt(i) == 'A' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'E')
				++vowels;
		}
		return vowels;
	}
}
