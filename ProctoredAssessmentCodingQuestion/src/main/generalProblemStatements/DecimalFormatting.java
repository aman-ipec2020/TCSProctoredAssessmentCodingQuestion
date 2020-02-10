package main.generalProblemStatements;

import java.text.DecimalFormat;

public class DecimalFormatting {

	public static void main(String[] args) {
		
		double num1 = 40.44;
		int num2 = 3;
	
		double num = num1/num2;
		
		System.out.println(num);
		
		formatDecimalValue1(num);
		
		formatDecimalValue2(num);
		
	}
	
	public static void formatDecimalValue1(double num)	{
		
		DecimalFormat df = new DecimalFormat(".##");
		
		System.out.println("number : " + df.format(num));
	}

	public static void formatDecimalValue2(double num)	{
		System.out.printf("number : %.2f",num);
	}

}
