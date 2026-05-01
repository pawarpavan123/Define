package if_else_Condition;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("enter the values");
		Scanner sc = new Scanner(System.in);
		
		int j=sc.nextInt();
		
		//int i;
		for(int i=1;i<=j;i++) {
			if (i%2==0) {
				System.out.println(i+" = even");
			}
			else {
				System.out.println(i+" = odd");
			}
		}

	}

}
