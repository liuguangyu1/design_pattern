package design_pattern.Decorator;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "DarkRoast";
	}
	
	public double cost() {
		return 1.05;
	}
}
