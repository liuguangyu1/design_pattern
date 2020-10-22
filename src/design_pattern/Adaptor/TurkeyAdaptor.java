package design_pattern.Adaptor;

public class TurkeyAdaptor implements Duck {
	Turkey turkey;
	
	public TurkeyAdaptor(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
