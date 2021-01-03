package model.services;

public interface OnlineService {
	
	double interest(Double amount, Integer months);
	
	double paymentFee(Double amount);

}
