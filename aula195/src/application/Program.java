package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.Paypal;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double price = sc.nextDouble();
		
		Contract contract = new Contract(number, date, price);
		
		System.out.print("Enter number of installments: ");
		Integer months = sc.nextInt();
		
		ContractService cs = new ContractService(new Paypal());
		
		cs.processContract(contract, months);
		
		System.out.println("INSTALLMENTS:");
		
		for(int i=0;i<contract.getList().size();i++) {
			System.out.println(contract.getList().get(i));
		}
		
		sc.close();
	}

}
