package hackerrank;

import java.util.Locale;
import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH); //se quiser usar ponto flutuante
		
		int i = scan.nextInt(); 
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        
        
        scan.close();
	}

}
