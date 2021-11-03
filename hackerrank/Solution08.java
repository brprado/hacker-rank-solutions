package hackerrank;

import java.util.Scanner;

public class Solution08 {

	public static void main(String[] args) {
		String s = "";
		Scanner input = new Scanner(System.in);
		int contLinhas = 1;
		boolean temLinha = true;
		
		while(temLinha) {
			s=input.nextLine();
			temLinha = input.hasNext();
			System.out.println(contLinhas + " " + s);
			contLinhas++;
			
		}
		
		input.close();
	}

}
