package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How much products will we use to calculate the average price? ");
		int quantity = scanner.nextInt();
		Product[] product = new Product[quantity];
		System.out.printf("Please, enter the name and price of %d products to calculate the average price of them:%n", quantity);
		for(int i = 0; i < quantity; i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			product[i] = new Product(name, price);
		}
		double sum = 0.0;
		for(int i = 0; i < quantity; i++) {
			 sum += product[i].getPrice();
		}
		double average = sum / quantity;
		System.out.printf("Average price = %.2f", average);
		
		scanner.close();
	}

}
