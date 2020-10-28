package design_pattern.Iterator;

import java.util.Iterator;

public class MenuItem1 extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem1(String name,
					 String description,
					 boolean vegetarian,
					 double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public void print() {
		System.out.println("  " + getName());
		if(isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("   -- " + getDescription());
	}
	
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
}
