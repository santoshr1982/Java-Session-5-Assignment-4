package Polymorphism.Bank;

public class SubIcici extends SuperBank {
	@Override
	public void getRateOfInterest()
	{
		System.out.println("The rate of interest provided by ICICI Bank is 7%.");
	}
}
