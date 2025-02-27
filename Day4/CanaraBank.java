package week2.Day4;

public class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		System.out.println("Implemented cashOnDelivery method");
	}
	
	public void upiPayments() {
		System.out.println("Implemeted upiPayments method");
	}
	
	@Override
	public void cardPayments() {
		System.out.println("Implemented cardPayments method");
	}
	
	@Override
	public void internetBanking() {
		System.out.println("Implemented internetBanking method");
	}
	
	public void recordPaymentDetails() {
		System.out.println("Method for recordPaymentDetails");
	}
	
	

}
