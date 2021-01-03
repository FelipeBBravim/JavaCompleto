package entities;

public class Company extends Person {
	
	private Integer numberOfEmployee;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double tax() {
		Double perc;
		
		if(numberOfEmployee <= 10) {
			perc = 0.16;
		} else {
			perc = 0.14;
		}
		
		return super.getAnualIncome() * perc;
	}
	
	

}
