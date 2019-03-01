

public class Item {
	
	
	

	public double price;
	public int itemID;
	public static int itemID2;
	
	/**
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return itemID
	 */
	public int getItemID() {
		return itemID;
	}

	/**
	 * @param itemID
	 */
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	/** 
	 * @return static item id
	 */
	public static int getItemID2() {
		return itemID2;
	}

	public static void setItemID2(int itemID2) {
		Item.itemID2 = itemID2;
	}

	public Item(int price){

		this.price=price;
	}

public String toString(){
		
		return null;
	

}
/**
 * @param price   All items price value
 * @param itemID	All item have an id
 */
public Item(double price, int itemID) {
	super();
	this.price = price;
	this.itemID = itemID;
}

public void addItem(){
	
}
	
}