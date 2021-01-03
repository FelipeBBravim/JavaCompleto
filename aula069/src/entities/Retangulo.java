package entities;

public class Retangulo {
	
	public double larg, alt;
	
	public double area() {
		return larg * alt;
	}
	
	public double perim() {
		return (larg+alt)*2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(alt, 2)+Math.pow(larg, 2));
	}
	
}
