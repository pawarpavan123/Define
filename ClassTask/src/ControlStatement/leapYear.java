package ControlStatement;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the values");
		int year= scanner.nextInt();
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println("leap ");
				}
				else {
					System.out.println("not leap");
				}
			}else {
				System.out.println("leap");
			}
		}else {
			System.out.println("not leap");
		}
		scanner.close();
		
	}

}
