package entities;

import java.util.List;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static Double avaragePrice(List<Product> list) {
		Double sum = 0.0;
		
		for (int i=0;i<list.size();i++) {
			sum += list.get(i).getPrice();
		}
		
		return sum;
	}
	

}
