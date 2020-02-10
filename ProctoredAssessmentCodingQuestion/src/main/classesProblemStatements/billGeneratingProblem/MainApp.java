package main.classesProblemStatements.billGeneratingProblem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MainApp {

	private static List<Item> list = new ArrayList<>();
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".##");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int qty = sc.nextInt();
		
		
		
		df.format(calculatePrice(qty));

	}
	
	public static double calculatePrice(int qty)	{
		
		
		for(Item obj : list)	{
			if(qty >= obj.getAvaliableQty())
				return obj.getAvaliableQty()*obj.getItemPrice();
			else
				return 0;
		}		
		return 0;
	}

}

class Store	{
	
	private List<Item> list = new ArrayList<>();
	
	private Map<String, Integer> billList = new Hashtable<>();
//	private Entry<Set<String, Integer>> obj = new EntrySet<>();
	
	public void setList(List<Item> list) {
		this.list = list;
	}
	
	public List<Item> getList() {
		return this.list;
	}
	
	public void setStore(String itemName, Integer qty)	{
		billList.put(itemName, qty);
	}
	
	public void generateBill()	{

	}
}
