package problemreview;

import java.util.Scanner;

public class Solution06Review {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            
            for(int j = 0; j < n; j++) { //j = potencia em ordem crescente do '0' ao 'n'
            	c += Math.pow(2, j) * b; //c=a(somador) + pow 2^n + pow2^n-1... * b(fixo)
            	System.out.printf("%s ",c);
            }
        	System.out.println();
        }
        in.close();
//a potencia sempre é multiplicada pelo b e o a sempre vem somando tudo!

	}

}
