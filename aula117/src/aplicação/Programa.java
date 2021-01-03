package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuintes;
import entidades.Departamento;
import entidades.HorasDeContrato;
import entidades.enums.NivelContribuinte;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do departamento: ");
		String departamento = sc.nextLine();
		System.out.println("Dados do Contribuinte:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível: ");
		String level = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		Contribuintes contribuinte = new Contribuintes(nome, NivelContribuinte.valueOf(level), salarioBase, new Departamento(departamento));
		
		System.out.print("Quantos Contratos para esse Contribuinte?: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com os dados do contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por Hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			HorasDeContrato contrato = new HorasDeContrato(dataContrato, valorHora, horas);
			contribuinte.addContrato(contrato);
		}
		
		System.out.println();
		System.out.println("Entre com o mês e ano (MM/YYYY) para calcular o salário:");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + contribuinte.getNome());
		System.out.println("Departamento: " + contribuinte.getDepartamento().getName());
		System.out.println("Salário total" + mesEAno + ": " + String.format("%.2f", contribuinte.income(ano, mes)));
		
		sc.close();
	}

}
