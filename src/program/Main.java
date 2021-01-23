package program;

import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
					
		System.out.print("What is the dollar price? ");
		double cambio = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double valDollar = sc.nextDouble();
		
		double pagar = CurrencyConverter.pagar(cambio, valDollar);
		
		System.out.printf("Amount to be paid in reais = %.2f", pagar);
		
		sc.close();
	}

}
