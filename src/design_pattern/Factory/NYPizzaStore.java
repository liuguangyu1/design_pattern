package design_pattern.Factory;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		//ʵ����������pizzaʱ������switch case��䣬�˴�ʡ��
		return new NYStyleCheesePizza();
	}
}
