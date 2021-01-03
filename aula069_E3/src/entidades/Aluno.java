package entidades;

public class Aluno {
	public String nome;
	public double n1, n2, n3;
	
	public double soma() {
		return n1+n2+n3;
	}
	
	public void aprov() {
		if (soma() > 60) {
			System.out.println("PASS");
		} else {
			double miss = 60 - soma();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", miss);
		}
	}
	
	
}
