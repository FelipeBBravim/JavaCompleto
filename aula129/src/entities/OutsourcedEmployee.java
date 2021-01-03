package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAddionalCharge() {
		return additionalCharge;
	}

	public void setAddionalCharge(Double addionalCharge) {
		this.additionalCharge = addionalCharge;
	}
	
	@Override
	public Double payment() {
		return  super.payment() + additionalCharge * 1.1;
	}
}
