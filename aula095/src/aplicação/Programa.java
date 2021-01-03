package aplicação;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import java.util.List;

import entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionarios> lista = new ArrayList<Funcionarios>();

		// Lendo os dados dos funcionários:

		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Empregado #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(lista, id)) {
				System.out.println("Utilize outra Id:");
				id = sc.nextInt();
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			lista.add(new Funcionarios(id, nome, salario));
			System.out.println();
		}

		// Dando aumento ao funcionário:

		System.out.print("Entre o id do funcionário que receberá o aumento: ");
		int id = sc.nextInt();
		Funcionarios fun = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (fun == null) {
			System.out.println("Essa ID não existe!");
		} else {
			System.out.print("Entre a porcentagem: ");
			double porcentagem = sc.nextDouble();
			fun.aumento(porcentagem);
		}
		
		// Listando os empregados:
		
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Funcionarios obj : lista) {
			System.out.println(obj);
		}
		

		sc.close();
	}

	public static boolean hasId(List<Funcionarios> lista, int id) {
		Funcionarios fun = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fun != null;
	}

}
