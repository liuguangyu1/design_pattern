package design_pattern.State;

public class GumballMachine1 {
	State soldOutState;
	State noQuartState;
	State hasQuarterState;
	State soldState;
	State WinnerState;
	
	State currentState = soldOutState;
	int count = 0;
	
	public GumballMachine1(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuartState = new NoQuartState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			currentState = noQuartState;
		}
	}
	
	public void insertQuarter() {
		currentState.insertQuarter();
	}
	
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
	
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}
	
	public void setState(State state) {
		this.currentState = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0) {
			count = count - 1;
		}
	}
	
	public State getNoQuarrterState() {
		return noQuartState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State geWinnerState() {
		return WinnerState;
	}
	
	public int getCount() {
		return count;
	}
	
	public void refill(int count) {
		this.count = count;
		currentState = noQuartState;
	}

}
