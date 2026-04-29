package ForLoop__whileLoop;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
//			System.out.println("Enter the name : ");
//			String name= scanner.nextLine();
//			System.out.println("your output = "+name);
//			
			System.out.println("Enter the value A : ");
			int a= scanner.nextInt();
//			System.out.println(a);
			
			
			System.out.println("Enter the values B : ");
			int b= scanner.nextInt();
//			System.out.println(b);
			
			int SUM = a+b;
			System.out.println(SUM);
			
			
		}

	}

}
