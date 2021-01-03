package entities;

public class Individual extends Person {

	private Double healthExpenditure;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpendure() {
		return healthExpenditure;
	}

	public void setHealthExpendure(Double healthExpendure) {
		this.healthExpenditure = healthExpendure;
	}

	@Override
	public Double tax() {
		Double perc;
		if(super.getAnualIncome() < 20000) {
			perc = 0.15;
		}
		else {
			perc = 0.25;
		}
		
		return (super.getAnualIncome() * perc) - (healthExpenditure * 0.5);
	}

}
