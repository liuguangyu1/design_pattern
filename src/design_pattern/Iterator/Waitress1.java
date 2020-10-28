package design_pattern.Iterator;

import java.util.Iterator;

public class Waitress1 {
	MenuComponent allMenus;
	
	public Waitress1(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator(); // 创建根菜单迭代器
		while(iterator.hasNext()) {
			MenuComponent component = iterator.next();
			try {
				if(component.isVegetarian()) {
					component.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}
