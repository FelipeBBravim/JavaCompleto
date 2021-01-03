package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		read(path, emp);
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		
		System.out.println("Email of people whose salary is more than " + salary + ": ");
		List<String> emails = emp.stream()
				.filter(e -> e.getSalary() > salary)
				.map(e -> e.getEmail())
				.sorted()
				.collect(Collectors.toList());
		
		emails.forEach(System.out::println);
		
		System.out.print("Sum of salary of people whose name starts with 'M': ");
		double sum = emp.stream()
				.filter(e -> e.getName().charAt(0) == 'M')
				.map(e -> e.getSalary())
				.reduce(0.0, (x,y) -> x + y);
		System.out.println(sum);		
		
		/*for (Employee e : emp) {
			if(e.getSalary() > 2000) {
				System.out.println(e.getEmail());
			}
		}
		
		System.out.print("Sum of salary of people whose name starts with 'M': ");
		double sum = 0.0;
		for(Employee e : emp) {
			if(e.getName().charAt(0) == 'M') {
				sum += e.getSalary();
			}
		}
		System.out.println(String.format("%.2f", sum));*/
		
		sc.close();
	}
	
	public static void read(String path, List<Employee> list) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
