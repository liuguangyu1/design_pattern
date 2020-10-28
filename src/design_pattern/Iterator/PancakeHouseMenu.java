package design_pattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
		
		addItem("K&B's Pancake Breakfast",
				"Pancakes with fried eggs, toast",
				true, 2.99);
		addItem("Regualr Pancake Breakfast",
				"Pancakes with fried eggs, sausage",
				false, 2.99);
		addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries",
				true, 3.49);
		addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true, 3.59);
	}
	
	public void addItem(String name, String description,
						boolean vegetarian, double price) {
		MenuItem menuitem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuitem);
	}
	
	/*
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	*/
	
	/*
	public IteratorSave<MenuItem> createIterator() {
		return new PancakeHouseIterator(menuItems);
	}
	*/
	
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
	
	
}
