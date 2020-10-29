package design_pattern.State;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(5);
		
		System.out.println(gumballMachine1);
		
		gumballMachine1.insertQurter();
		gumballMachine1.turnCrank();
		
		System.out.println(gumballMachine1);
		
		gumballMachine1.insertQurter();
		gumballMachine1.ejectQuarter();
		gumballMachine1.turnCrank();
		
		System.out.println(gumballMachine1);
		
		gumballMachine1.insertQurter();
		gumballMachine1.turnCrank();
		gumballMachine1.insertQurter();
		gumballMachine1.turnCrank();
		gumballMachine1.ejectQuarter();
		
		System.out.println(gumballMachine1);
		
		gumballMachine1.insertQurter();
		gumballMachine1.insertQurter();
		gumballMachine1.turnCrank();
		gumballMachine1.insertQurter();
		gumballMachine1.turnCrank();
		gumballMachine1.insertQurter();
		gumballMachine1.turnCrank();
		
		System.out.println(gumballMachine1);
	}
}
