package ControlStatement;

import java.util.Scanner;

public class greadPoint {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int s = scanner.nextInt();
		
		if (s<0 || s>100) {
			System.out.println("invalid input");
		
		}
		else if (s>=90) {
			System.out.println("a");
		}
		else if(s>=80) {
			System.out.println("b");
		}
		else if (s>=70) {
			System.out.println("c");
		}
		else if (s>=60) {
			System.out.println("d");
		}
		else {
			System.out.println("f");
		}
		
	}

}
