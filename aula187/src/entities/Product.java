package entities;

public class Product {

	private String bruteProduct;
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String bruteProduct) {
		this.bruteProduct = bruteProduct;
	}

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getBruteProduct() {
		return bruteProduct;
	}

	public void setBruteProduct(String bruteProduct) {
		this.bruteProduct = bruteProduct;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void toProduct() {
		String[] vect = bruteProduct.split(",");
		String name = vect[0];
		Double price = Double.parseDouble(vect[1]);
		Integer quantity = Integer.parseInt(vect[2]);
		
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		setBruteProduct(null);
	}
	
	public Double totalPrice() {
		return price * quantity;
	}
	
	public String toString() {
		return name + ", $" + totalPrice();
	}
}
