
package hackerrank;

import java.util.Scanner;


public class Solution05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
       
        for(int j = 1; j <= 10; j++) {
    		System.out.printf("%d x %d = %d%n", N, j, N*j);
    	}

	
	}

}
