package if_else_Condition;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter balance");
		int balance = scanner.nextInt();

		System.out.println("Enter the withdrawal amount");
		int amount = scanner.nextInt();

		if (amount % 100 == 0) {
			if (amount <= balance) {
				System.out.println("withdrowal Approved");
				balance = balance - amount;
				System.out.println("remaining Balnace : " + balance);
			} else {
				System.out.println("Rejected: Insufficient Balance");
			}
		} else {
			System.out.println("Rejected: Amount not multiple of 100");
		}
	}

}
