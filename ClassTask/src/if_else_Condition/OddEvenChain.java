package if_else_Condition;

import java.util.Scanner;

public class OddEvenChain {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number :");
	int a=scanner.nextInt();
	
	System.out.println("Enter the second number : ");
	int b=scanner.nextInt();
	
	System.out.println("Enter the thrid number: ");
	int c=scanner.nextInt();
	
	if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0) {
		System.out.println("odd chain");
	}else if(a%2==0 && b % 2 == 0 && c % 2 == 0) {
		System.out.println("even chain");
	}else {
		System.out.println("mixed chain");
	}
	scanner.close();
	}

}
