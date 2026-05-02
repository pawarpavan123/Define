package if_else_Condition;

import java.util.Scanner;

public class ExamConditonPassFail {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Subject One : ");
		int subj1=scanner.nextInt();
		
		System.out.println("Subject Two : ");
		int subj2=scanner.nextInt();
		
		System.out.println("Subject tree : ");
		int subj3=scanner.nextInt();
		
		if (subj1<=33 || subj2 <=33 || subj3 <=33) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
		
	}

}
