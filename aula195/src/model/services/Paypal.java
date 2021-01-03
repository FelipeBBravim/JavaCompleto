package model.services;

public class Paypal implements OnlineService{
	
	private static final double paymentTax = 0.02;
	private static final double monthlyInterest = 0.01;
	
	@Override
	public double interest(Double amount, Integer months) {
		return amount * monthlyInterest * months;
	}

	@Override
	public double paymentFee(Double amount) {
		return amount * paymentTax;
	}

	
}
