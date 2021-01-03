package aplicação;

import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = null;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char opt = sc.next().charAt(0);
		
		if (opt == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valorInicial = sc.nextDouble();
			conta = new Conta(numero, nome, valorInicial);
		} 
		else if (opt == 'n') {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valor = sc.nextDouble();
		conta.addValor(valor);
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withraw value: ");
		valor = sc.nextDouble();
		conta.subValor(valor);
		System.out.println(conta);
		
		
		
		
		sc.close();
	}

}
