package design_pattern.Strategy;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
