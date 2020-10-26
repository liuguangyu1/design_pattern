package design_pattern.TemplateFunc;

public class Tea1 extends CaffeineBeverage {
	public void brew() {
		System.out.println("Steeping the tea");
	}
	
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
