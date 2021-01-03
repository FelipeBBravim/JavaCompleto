package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installments;

public class ContractService {

	private OnlineService payment;

	public ContractService() {

	}

	public ContractService(OnlineService payment) {
		this.payment = payment;
	}

	public void processContract(Contract contract, Integer months) {
		Double basicQuota = contract.getPrice() / months;

		for (int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getDate(), i);
			double updatedQuota = basicQuota + payment.interest(basicQuota, i);
			double fullQuota = updatedQuota + payment.paymentFee(updatedQuota);
			contract.addInstallment(new Installments(date, fullQuota));
		}
	}

	private Date addMonths(Date date, int i) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, i);
		return cal.getTime();
	}
}
