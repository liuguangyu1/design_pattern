package design_pattern.TemplateFunc;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		this.boilWater();
		this.brew();
		this.pourInCup();
		this.addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
