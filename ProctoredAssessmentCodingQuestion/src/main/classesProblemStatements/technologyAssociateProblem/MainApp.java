package main.classesProblemStatements.technologyAssociateProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	private static List<Associate> associateList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Associate obj1 = new Associate("101","Alex","Java",15); 
			associateList.add(obj1);
		
		Associate obj2 = new Associate("102","Albert","Unix",20); 
			associateList.add(obj2);
			
		Associate obj3 = new Associate("103","Alferd","Testing",13); 
			associateList.add(obj3);
			
		Associate obj4 = new Associate("104","Alfa","Java",29); 
			associateList.add(obj4);
			
		for(Associate obj : associateList)
				System.out.println(obj);
		
		Collections.sort(associateList, new SortByExperince());
		
		for(Associate obj : associateList)
			System.out.println(obj);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter Technology : ");
		String str = sc.nextLine();
			
		for(Associate obj : assocaiteforGivenTechnology(str))
			System.out.println(obj.getAssociateID());
	}
	
	public static List<Associate> assocaiteforGivenTechnology(String tech)	{
		
		List<Associate> list = new ArrayList<>();
		
		for(Associate obj : associateList)	{
			if(obj.getAssociateTechnology().equalsIgnoreCase(tech) && obj.getExperinceInYear() > 5)
				list.add(obj);
		}
		return list;
	}

}
