package ControlStatement;

import java.util.Scanner;

public class TriangleValidity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A");
		int a=scanner.nextInt();
		
		System.out.println("B");
		int b=scanner.nextInt();
		
		System.out.println("C");
		int c=scanner.nextInt();
		
		if(a>0 && b>0 && c>0&&(a+b+c==180)) {
			System.out.println("valid trangal");
		}else {
			System.out.println("invalid trangal");
		}
	}

}
