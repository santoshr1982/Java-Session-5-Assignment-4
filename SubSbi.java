package Polymorphism.Bank;

public class SubSbi extends SuperBank {
	@Override
	public void getRateOfInterest()
	{
		System.out.println("The rate of interest in provided SBI is 8%.");
	}
}
