package hackerrank;

import java.util.Scanner;

public class Solution02 {
	/*Task
Given an integer,n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.*/
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(" ");
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if( (N % 2 == 1) || (N % 2 == 0 && N >= 6 && N <= 20) ) { //weird condition
        	System.out.println("Weird");
        
        }else if( (N % 2 == 0 && N >= 2 && N <= 5) || (N % 2 == 0 && N > 20) ) { //not wierd condition
        	System.out.println("Not Weird");
        }
        	
        scanner.close();

	
	}
}
