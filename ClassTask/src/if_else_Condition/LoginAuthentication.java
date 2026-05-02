package if_else_Condition;

import java.util.Scanner;

public class LoginAuthentication {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String correctUnsername = "Admin";
		String correctPassword = "Admin@123";

		System.out.println("Enter the userName : ");
		String userName = scanner.next();

		System.out.println("Enter the password : ");
		String password = scanner.next();

		if (userName.equals(correctUnsername)) {
			if (password.equals(correctPassword)) {
				System.out.println("Access Granted");

			} else {
				System.out.println("Access Denied");
			}

		} else {
			System.out.println("Access Denied");
		}

	}

}
