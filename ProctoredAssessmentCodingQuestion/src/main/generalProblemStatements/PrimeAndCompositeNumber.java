package main.generalProblemStatements;

import java.util.List;
import java.util.ArrayList;

public class PrimeAndCompositeNumber {

	private static List<Integer> primeNumberList = new ArrayList<>();
	private static List<Integer> compositeNumberList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		makeList();
		
		System.out.print("Prime Number     : ");
		for(Integer obj : primeNumberList)
			System.out.print(obj + ", ");
		
		System.out.println();
		
		System.out.print("Composite Number : ");
		for(Integer obj : compositeNumberList)
			System.out.print(obj + ", ");
	}
	
	public static void makeList()	{
		
		for(int i=0;i<=100;i++)	{
			
			if(isPrime(i))
				primeNumberList.add(i);
			else
				compositeNumberList.add(i);
		}
	}
	
	public static boolean isPrime(int num)
	{
		if(num == 2)
			return true;
	
		for(int i=2; i<num; i++)	{
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
}