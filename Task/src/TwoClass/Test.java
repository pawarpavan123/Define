package TwoClass;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = scanner.nextLine();
		//System.out.println("your name : ");
		
		System.out.println("Enter the surname");
		String sur = scanner.nextLine();
		//System.out.println("your surname : "+sur);
		
		System.out.println("Enter the number ");
		long number = scanner.nextLong();
		//System.out.println("your number : "+number);
		
		UserNameGenerator generator = new UserNameGenerator();
		
		String details=generator.getUserName(name,sur,number);
		System.out.println("user details"+details);
	}

}
