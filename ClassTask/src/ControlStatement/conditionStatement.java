package ControlStatement;

import java.util.Scanner;

public class conditionStatement {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the values");
		String light = scanner.next();
		
//		String light = "red";
		
		if (light.equals("red")) {
			System.out.println("Stop");
		}
		else if (light.equals("yellow")) {
			System.out.println("Ready");
		} 
		else if (light.equals("green")) {
			System.out.println("GO");
		}
		else {
			System.out.println("invalid input");
		}
		
	}

}

