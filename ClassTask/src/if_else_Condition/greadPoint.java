package if_else_Condition;

import java.util.Scanner;

public class greadPoint {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = scanner.nextInt();
		
		if (num<0 || num>100) {
			System.out.println("Invalid ");
		}
		else if (num>=90) {
			System.out.println("GREAD : A");
		}
		else if (num>=80) {
			System.out.println("GREAD : B");
			
		}else if (num>=70) {
			System.out.println("GREAD : C");
		}else {
			System.out.println("f");
		}
	
	}

}
