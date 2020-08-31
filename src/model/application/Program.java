package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PaypalServices;

public class Program {
	
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = scanner.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		scanner.nextLine();
		Date initialDate = sdf.parse(scanner.nextLine());
		System.out.print("Contract value: ");
		Double contractValue = scanner.nextDouble();
		System.out.print("Enter number of installments: ");
		int numberInstallment = scanner.nextInt();
		
		Contract contract = new Contract(number, contractValue, numberInstallment, new Installment(initialDate, (contractValue/numberInstallment), numberInstallment, new PaypalServices()));
		
		System.out.println("Installments: ");
		System.out.println(contract.toString());
		
		scanner.close();
	}
	
}
