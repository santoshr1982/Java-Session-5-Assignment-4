package Polymorphism.Bank;

public class MainClass {

	public static void main(String[] args) {
		
		SubSbi objSbi = new SubSbi();				//Creating object for Sub Class SBI.
		objSbi.getRateOfInterest();					// Calling a method from the Sub Class.
		
		SubIcici objIcici = new SubIcici();			//Creating object for Sub Class ICICI.
		objIcici.getRateOfInterest();				// Calling a method from the Sub Class.
		
		SubAxis objAxis = new SubAxis();			////Creating object for Sub Class Axis.
		objAxis.getRateOfInterest();				// Calling a method from the Sub Class.
		
	}
	
}
