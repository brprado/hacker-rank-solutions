package hackerrank;

import java.util.Scanner;

public class Solution09 {

static Scanner input = new Scanner(System.in);
static int B = input.nextInt();
static int H = input.nextInt();
static boolean flag = true;

static {
	try {
		if(B <= 0 || H <= 0){
			flag = false;
			throw new Exception("Breadth and height must be positive"); // jogou
		}
	}catch (Exception e) {
		System.out.println(e); //pegou
	}
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
