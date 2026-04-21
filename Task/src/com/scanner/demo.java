package com.scanner;

import java.util.Scanner;

public class demo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = scanner.next();
		System.out.println("your name : "+name);
		
		System.out.println("Enter the number");
		long number = scanner.nextLong();
		System.out.println("your number : "+number);
		
		
	}

}
