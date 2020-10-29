package design_pattern.State;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis()); //随机数产生器
	GumballMachine1 gumballMachine;
	
	public HasQuarterState(GumballMachine1 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarrterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && gumballMachine.getCount() > 1) {
			//count > 1才能中奖
			gumballMachine.setState(gumballMachine.geWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		 System.out.println("No gumball dispensed");
	}
	
}
