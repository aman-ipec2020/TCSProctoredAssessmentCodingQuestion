package main.classesProblemStatements.inventoryProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {

	private static List<Inventory> list = new ArrayList<>();

	public static void main(String[] args) {	
		
		Inventory inv1 = new Inventory("1",100,50,50);
			list.add(inv1);
		Inventory inv2 = new Inventory("2",200,60,80);
			list.add(inv2);
		Inventory inv3 = new Inventory("3",150,35,45);
			list.add(inv3);
		Inventory inv4 = new Inventory("4",80,45,40);
			list.add(inv4);

/*			
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Filling Amount : ");		
		int filling = sc.nextInt();
*/		
		System.out.println("Sort Inventory by Maximum Quantity");
		Collections.sort(list, new SortByMaxQuantity());
		
		for(Inventory obj : list)
			System.out.println(obj);
		
		System.out.println("Sort Inventory by Current Quantity");
		Collections.sort(list, new SortByCurrentQuantity());
		
		for(Inventory obj : list)
			System.out.println(obj);
		
		System.out.println("Sort Inventory by Threshold Value");
		Collections.sort(list, new SortByThreshold());
		
		for(Inventory obj : list)
			System.out.println(obj);
		
		
		
//		checkCriticality();
	}
	
	public static void checkCriticality()	{
		
		for(Inventory obj : list)	{
		
			if(obj.getThreshold()>=75)
				System.out.println("Crititcal Filling at " + obj.getInventoryID());
			else	{
				if(74 <= obj.getThreshold() && obj.getThreshold() <= 50)
					System.out.println("moderate Filling at " + obj.getInventoryID());
				else
					System.out.println("Non-crititcal Filling at " + obj.getInventoryID());
			}
		}	
	}
}
