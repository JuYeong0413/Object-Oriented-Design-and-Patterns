package memento;

public class Item {
	private String itemName;
	
	public Item(String itemName) {
		this.itemName = itemName;
	}
	
	public void setItem(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItem() {
		return itemName;
	}
}
