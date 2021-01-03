package entidades;

public class Quartos {

	private String nome;
	private String email;
	private int quarto;
	
	
	
	public Quartos(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Quartos(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public int getQuarto() {
		return quarto;
	}

	public String toString() {
		return quarto
				+ ": "
				+ nome
				+ ", "
				+ email;
	}
	
}
