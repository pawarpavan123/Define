package ForLoop__whileLoop;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values = ");
		int input = scanner.nextInt();
		scanner.close();

//	for (int i=1;i<=10;i++) {
//		System.out.println(input+" x "+i+" = "+i*input);
//	}
		int a = 1;
		while (a<=10) {
			System.out.println(input+" x "+a+" = "+(a*input));
			a++;
		}

	}

}
