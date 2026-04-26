package ControlStatement;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the days");
		int day = scanner.nextInt();
		switch (day) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("thusday");
			break;
		}
		case 3: {
			System.out.println("wednesday");
			break;
		}
		case 4: {
			System.out.println("thursday");
			break;
		}
		case 5: {
			System.out.println("friday");
			break;
		}
		case 6: {
			System.out.println("saturday");
			break;
		}
		case 7: {
			System.out.println("sunday");
			break;
		}

		default: {
			System.out.println("please valid input");
		}
		}
		scanner.close();
	}

}
