package design_pattern.TemplateFunc;

public class Coffee1 extends CaffeineBeverage {
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
