package String;

import java.util.Scanner;

public class detail {
	public static void main(String[] args) {
		
		String username="pavan";
		String password="pavan@123";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username : ");
		String user = scanner.next();
		System.out.println("Enter the pass : ");
		String pass =scanner.next();
		
		if (username.equals(user)) {
			if (password.equals(pass)) {
				System.out.println("valid");
			}
			else {
				System.out.println("access Exit !");
			}
			
		}
		else {
			System.out.println("access Exit");
		}
		scanner.close();
		
	}

}
