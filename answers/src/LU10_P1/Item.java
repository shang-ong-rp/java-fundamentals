package LU10_P1;

public class Item {

	private String description;
	private ItemInfo info;

	public Item(String description, ItemInfo info) {
		this.description = description;
		this.info = info;
	}

	public String getDescription() {
		return description;
	}

	public ItemInfo getInfo() {
		return info;
	}
}



