package com.scanner;

import java.util.Scanner;

public class DynamicInput {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		dynamicLogic logic = new dynamicLogic();
		
		System.out.println("Enter the fName ");
		 logic.name = scanner.next();
		
		System.out.println("Enter the lname ");
		logic.sur =  scanner.next();
		
		System.out.println("Enter the doy");
		logic.date = scanner.nextInt();
		
		System.out.println("your Fname : "+logic.name);
		System.out.println("your lname :"+logic.sur);
		System.out.println("your date year : "+logic.date);
	}

}
