package entities;

public class Employee {
	
	public String name;
	public double salario, imposto;
	
	public double salarioDescontado() {
		return salario - imposto;
	}
	
	public double aumento(double porcentagem) {
		return salarioDescontado() + (salario*porcentagem/100);
	}
	
	public String toString() {
		return name
				+ ", $ ";
	}
}
