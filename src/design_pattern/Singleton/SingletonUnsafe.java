package design_pattern.Singleton;

public class SingletonUnsafe {
	private static SingletonUnsafe uniqueInstance;
	private SingletonUnsafe() {
		
	}
	
	public static SingletonUnsafe getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonUnsafe();
		}
		return uniqueInstance;
	}
	
}
