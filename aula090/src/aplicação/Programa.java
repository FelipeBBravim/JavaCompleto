package aplicação;

import java.util.Scanner;

import entidades.Quartos;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Quartos[] lista = new Quartos[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i=0;i<n;i++) {
			System.out.println("Aluguel #" + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			lista[quarto] = new Quartos(nome, email, quarto);
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Quartos ocupados:");
		
		for (int i=0;i<lista.length;i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
		
		
		sc.close();
	}

}
