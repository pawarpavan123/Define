package if_else_Condition;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the a value  : "); int a = scanner.nextInt();
		 * 
		 * System.out.println("Enter the b values :  "); int b= scanner.nextInt();
		 * 
		 * 
		 * int larger =(a>b)? a:b; int smaller =(a<b)? a:b; if (larger % 2==0) {
		 * System.out.println("output : "+larger); }else {
		 * System.out.println("output : "+smaller); }
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a =scanner.nextInt();
		
		System.out.println("Enter the second number : ");
		int b=scanner.nextInt();
		
		if (a % 2!=0 && b % 2!=0) {
			int diff = Math.abs(a-b);
			System.out.println("output : "+diff);
		}else {
			System.out.println("invalid");
		}
	}
}
