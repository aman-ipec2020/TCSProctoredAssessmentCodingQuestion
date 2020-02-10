package main.classesProblemStatements.inventoryProblem;

import java.util.Comparator;

public class Inventory	{

	private String inventoryID;
	private int maxQuantity;
	private int currentQty;
	private int threshold;

	public Inventory() {
	
	}

	public Inventory(String inventoryID, int maxQuantity, int currentQty, int threshold) {
		super();
		this.inventoryID = inventoryID;
		this.maxQuantity = maxQuantity;
		this.currentQty = currentQty;
		this.threshold = threshold;
	}

	public String getInventoryID() {
		return inventoryID;
	}

	public void setInventoryID(String inventoryID) {
		this.inventoryID = inventoryID;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public int getCurrentQty() {
		return currentQty;
	}

	public void setCurrentQty(int currentQty) {
		this.currentQty = currentQty;
	}

	public int getThreshold() {
		return threshold;
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryID=" + inventoryID + ", maxQuantity=" + maxQuantity + ", currentQty=" + currentQty
				+ ", threshold=" + threshold + "]";
	}
}

class SortByMaxQuantity implements Comparator<Inventory>	{

	@Override
	public int compare(Inventory obj1, Inventory obj2) {
		// TODO Auto-generated method stub
		return obj1.getMaxQuantity() - obj2.getMaxQuantity();
	}
}

class SortByCurrentQuantity implements Comparator<Inventory>	{

	@Override
	public int compare(Inventory obj1, Inventory obj2) {
		// TODO Auto-generated method stub
		return obj1.getCurrentQty() - obj2.getCurrentQty();
	}
}

class SortByThreshold implements Comparator<Inventory>	{

	@Override
	public int compare(Inventory obj1, Inventory obj2) {
		// TODO Auto-generated method stub
		return obj1.getThreshold() - obj2.getThreshold();
	}
}
