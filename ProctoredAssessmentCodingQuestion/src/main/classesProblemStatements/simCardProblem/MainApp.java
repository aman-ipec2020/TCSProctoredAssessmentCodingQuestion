package main.classesProblemStatements.simCardProblem;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MainApp {

	private static List<Sim> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Sim obj1 = new Sim("1","jio",430,1.32,"mumbai");
			list.add(obj1);
		Sim obj2 = new Sim("2","idea",320,2.26,"mumbai");
			list.add(obj2);
		Sim obj3 = new Sim("3","airtel",500,2.54,"mumbai");
			list.add(obj3);
		Sim obj4 = new Sim("4","vodafone",640,3.21,"mumbai");
			list.add(obj4);
			
		sim(list,"mumbai",3.4);
		
	}
	
	public static void sim(List<Sim> list, String circle, double ratePerSec)	{

		List<Sim> newList = new ArrayList<>();
		
		for(Sim obj : list)	{
			if(obj.getCircle().equalsIgnoreCase(circle) && obj.getRatePerSec()<ratePerSec)
			newList.add(obj);	
		}

		System.out.println("Sort by Balance");
		Collections.sort(newList, new SortByBalance());
		
		for(Sim obj : newList)
			System.out.println(obj);
	}
}
