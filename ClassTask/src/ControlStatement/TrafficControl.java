package ControlStatement;

import java.util.Scanner;

public class TrafficControl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value");
		String light = scanner.next();
		
//		String light = "green";
		
		if (light.equals("red")) {
			System.out.println("STOP");
		}
		else if (light.equals("yellow")) {
			System.out.println("READY");
		}
		else if (light.equals("green")) {
			System.out.println("GO");
		}
		else {
		System.out.println("Invalid Input");
		}
	}

}
