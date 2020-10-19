package design_pattern.Strategy;

import design_pattern.Strategy.Duck;
import design_pattern.Strategy.MallardDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		
	}
}
