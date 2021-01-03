package aplicattion;

import java.util.Scanner;

import entidades.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.soma());
		aluno.aprov();
		
		
		sc.close();
	}

}
