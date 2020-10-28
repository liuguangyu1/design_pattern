package design_pattern.Iterator;

import java.util.ArrayList;

//useless file

public class PancakeHouseIterator implements IteratorSave<MenuItem> {
	ArrayList<MenuItem> menuItems;
	int position = 0;
	
	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	public boolean hasNext() {
		if(position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public MenuItem next() {
		MenuItem ret =  menuItems.get(position);
		position = position + 1;
		return ret;
	}
}
