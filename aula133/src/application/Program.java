package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company(i/c)? ");
			char ic = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ic == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else if(ic == 'c') {
				System.out.print("Number of employees: ");
				Integer numberOfEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for (Person p : list) {
			System.out.printf("%s: $ %.2f%n", p.getName(), p.tax());
			sum += p.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
		sc.close();
	}

}
