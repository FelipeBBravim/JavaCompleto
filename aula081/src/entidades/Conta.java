package entidades;

public class Conta {
	
	private int numero;
	private String nome;
	private double valor;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Conta(int numero, String nome, double valorInicial) {
		this.numero = numero;
		this.nome = nome;
		addValor(valorInicial);
	}

	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void addValor(double valor) {
		this.valor += valor;
	}
	
	public void subValor(double valor) {
		this.valor -= (valor+5);
	}
	
	public String toString() {
		return "Account "
				+ numero
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", valor);
	}
	
	
}
