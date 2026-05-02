package if_else_Condition;

import java.util.Scanner;

public class VowelCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the values : ");
		
		char c = scanner.next().charAt(0);
		c=Character.toLowerCase(c);
		
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
	}

}
