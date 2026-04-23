package ControlStatement;

import java.util.Scanner;

public class TrickyEvenOdd {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first values");
		int a = scanner.nextInt();
		
		System.out.println("Enter the second values");
		int b = scanner.nextInt();
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		System.out.println((max%2==0) ? max : min);
          //===============================================
//		        Scanner sc = new Scanner(System.in);
//
//		        System.out.print("Enter first number: ");
//		        int a = sc.nextInt();
//
//		        System.out.print("Enter second number: ");
//		        int b = sc.nextInt();
//
//		        if (a > b) {
//		            if (a % 2 == 0) {
//		                System.out.println(a);
//		            } else {
//		                System.out.println(b);
//		            }
//		        } else {
//		            if (b % 2 == 0) {
//		                System.out.println(b);
//		            } else {
//		                System.out.println(a);
//		            }
//		        }
//
//		        sc.close();

		//====================================================================
//		
//		        Scanner sc = new Scanner(System.in);
//
//		        System.out.print("Enter first number: ");
//		        int a = sc.nextInt();
//
//		        System.out.print("Enter second number: ");
//		        int b = sc.nextInt();
//
//		        int larger, smaller;
//
//		        if (a > b) {
//		            larger = a;
//		            smaller = b;
//		        } else {
//		            larger = b;
//		            smaller = a;
//		        }
//
//		        if (larger % 2 == 0) {
//		            System.out.println("Output: " + larger);
//		        } else {
//		            System.out.println("Output: " + smaller);
//		        }
//
//		        sc.close();
		
		

	}

}
