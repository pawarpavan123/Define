package if_else_Condition;

import java.util.Scanner;

public class ArithmeticalNestedConditon {
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("first Number : ");
	int a=sc.nextInt();
	
	System.out.println("second number : ");
	int b=sc.nextInt();
	
	System.out.println("Choice (1:add, 2:mul , 3:sub, 4:div ) ");
	int choice=sc.nextInt();
	
	if (choice==1) {
		System.out.println("result : "+(a+b));
	}else {
		if (choice==2) {
			System.out.println("result : "+(a-b));
		}else {
			if (choice==3) {
				System.out.println("result : "+(a*b));
			}else {
				if (choice==4) {
					if (choice!=0) {
						System.out.println("not divisible of zero");
					}
				}else {
					System.out.println("invalid choice");
				}
			}
		}
	}

	}

}
