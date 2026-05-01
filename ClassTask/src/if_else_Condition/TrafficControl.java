package if_else_Condition;

import java.util.Scanner;

public class TrafficControl {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the values");
//		String light = sc.next();
//		
//		// String light = "red";
//		
//		if (light.equals("red")) {
//			System.out.println("Stop");
//			
//		}
//		else if (light.equals("yellow")) {
//			System.out.println("ready");
//		}
//		else if (light.equals("green")) {
//			System.out.println("go");
//		}
//		else {
//			System.out.println("Invalid input");
//		}
//		
//		
		
		String one = new String("Hello"); 
		String two=  new String ("Hello");
		
		// it check the both reference then
		System.out.println(one==two);
		
		// it check the both values(literals) same then true (case-sensitive)
		System.out.println(one.equals(two));
		
		// same as .equals method but it is sensitive
		System.out.println(one.equalsIgnoreCase(two));
		
	}

}
