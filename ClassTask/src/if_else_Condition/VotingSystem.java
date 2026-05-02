package if_else_Condition;

import java.util.Scanner;

public class VotingSystem {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = scanner.nextInt();
		
		System.out.println(" are you a citizen ? (Y/N)  : ");
		char citizen = scanner.next().toUpperCase().charAt(0);
		
		if (age>=19 && citizen =='Y') {
			System.out.println("eligible to vote");
		}else if(age>=18){
			System.out.println("wait same days");
		}else{
			System.out.println("not eligible");
		}
		scanner.close();
	}

}
