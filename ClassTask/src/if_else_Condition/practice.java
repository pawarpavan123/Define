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
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter first number : ");
//		int a =scanner.nextInt();
//		
//		System.out.println("Enter the second number : ");
//		int b=scanner.nextInt();
//		
//		if (a % 2!=0 && b % 2!=0) {
//			int diff = Math.abs(a-b);
//			System.out.println("output : "+diff);
//		}else {
//			System.out.println("invalid");
//		}
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the value : "); int a = scanner.nextInt(); if (a <=
		 * 0 || a > 100) { System.out.println("invalid"); } else if (a >= 90) {
		 * System.out.println("A"); } else if (a >= 80) { System.out.println("B"); }
		 * else { System.err.println("Good"); } scanner.close();
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the number : "); int a = scanner.nextInt();
		 * 
		 * if (a>0) { System.out.println("positive"); }else if(a<0) {
		 * System.out.println("negitive"); }else { System.out.println("zero"); }
		 */
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the unit : "); int unit = scanner.nextInt();
		 * 
		 * int bill; if (unit <= 100) { bill = unit * 12; } else { if (unit <= 300) {
		 * bill = unit * 7; } else { bill = unit * 10; }
		 * 
		 * } System.out.println(bill);
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the sub1 : ");
		int a = scanner.nextInt();
		System.out.println("enter the sub2 : ");
		int b=scanner.nextInt();
		System.out.println("enter the sub3");
		int c= scanner.nextInt();
		
		if (a<=33 || b<=33 || c<=33) {
			System.out.println("fail");
		}
		else {
			System.out.println("pass");
		}
	}
}
