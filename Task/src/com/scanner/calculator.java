package com.scanner;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the a values: ");
	int a =scanner.nextInt();
	
	System.out.println("Enter the b values : ");
	int b=scanner.nextInt();
	
	int add =a+b;
	System.out.println("addition : "+add);
	
	int subtraction = a - b;
	System.out.println("subtraction : "+subtraction);
			
	
	}
}
