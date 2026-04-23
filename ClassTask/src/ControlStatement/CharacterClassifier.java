package ControlStatement;

import java.util.Scanner;

public class CharacterClassifier {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the values");
	char ch = scanner.next().charAt(0);
	
//	if (ch>='A' && ch<='Z') {
//		System.out.println("upper Case");
//	}else if (ch>='a'&& ch<='z') {
//		System.out.println("loworcase");
//	}
//	else if(ch>='0'&&ch<='9') {
//		System.out.println("digit");
//	}else {
//		System.out.println("special charater");
//	}
//	scanner.close();
		
		
		if (Character.isUpperCase(ch)) {
			System.out.println("uppercase");
		}else if (Character.isLowerCase(ch)) {
			System.out.println("lowercase");
		}else if (Character.isDigit(ch)) {
			System.out.println("digit");
		}else {
			System.out.println("special charater");
		}
		
	
	}
}
