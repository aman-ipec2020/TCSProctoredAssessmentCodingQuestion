package main.classesProblemStatements.billGeneratingProblem;

public class Item {

	private String itemName;
	private double itemPrice;
	private int avaliableQty;

	public Item() {
		
	}

	public Item(String itemName, double itemPrice, int avaliableQty) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.avaliableQty = avaliableQty;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getAvaliableQty() {
		return avaliableQty;
	}

	public void setAvaliableQty(int avaliableQty) {
		this.avaliableQty = avaliableQty;
	}

	
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + ", avaliableQty=" + avaliableQty + "]";
	}	
}
