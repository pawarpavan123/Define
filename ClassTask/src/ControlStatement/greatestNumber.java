package ControlStatement;

import java.util.Scanner;

public class greatestNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("A");
		int a = scanner.nextInt();
		
		System.out.println("B");
		int b= scanner.nextInt();
		
		System.out.println("C");
		int c=scanner.nextInt();
		
		
		if (a>b) {
			if (a>b) {
				System.out.println("greater"+a);
			}else {
				System.out.println("greter"+b);
			}
				
				
		}else {
			if (a>c) {
				System.out.println("greter"+a);
			}else {
				System.out.println("greter"+c);
			}
		}
		scanner.close();

	}

}
