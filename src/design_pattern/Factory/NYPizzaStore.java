package design_pattern.Factory;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		//实际生产多种pizza时，利用switch case语句，此处省略
		return new NYStyleCheesePizza();
	}
}
