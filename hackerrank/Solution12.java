package hackerrank;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Solution12 {

	public static void main(String[] args) {
		
		System.out.println("payment: ");
		Locale indiaLocale = new Locale("en", "IN");
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		//INPUT PAGAMENTO
		double pagamento = input.nextDouble();
		input.close();
		
		
		//FORMATANDO MOEDA PARA CADA PAIS
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat ind = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		//OUTPUT
		System.out.println("US: " + us.format(pagamento));
		System.out.println("India: " + ind.format(pagamento).replace("\u20B9", "Rs."));
		System.out.println("China: " + chi.format(pagamento));
		System.out.println("France: " + fr.format(pagamento).replace('?', ' ').replace(',', ' '));

		
	}

}
