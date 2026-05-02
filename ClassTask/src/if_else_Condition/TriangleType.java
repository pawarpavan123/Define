package if_else_Condition;

import java.util.Scanner;

public class TriangleType {
	public static void main(String[] args) {

//		        Scanner sc = new Scanner(System.in);
//
//		        System.out.print("Enter side a: ");
//		        int a = sc.nextInt();
//
//		        System.out.print("Enter side b: ");
//		        int b = sc.nextInt();
//
//		        System.out.print("Enter side c: ");
//		        int c = sc.nextInt();
//
//		        // check valid triangle
//		        if (a + b > c && a + c > b && b + c > a) {
//
//		            if (a == b && b == c) {
//		                System.out.println("Equilateral Triangle");
//		            } else if (a == b || b == c || a == c) {
//		                System.out.println("Isosceles Triangle");
//		            } else {
//		                System.out.println("Scalene Triangle");
//		            }
//
//		        } else {
//		            System.out.println("Not a valid triangle");
//		        }
//		        sc.close();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side a : ");
		int a = scanner.nextInt();

		System.out.println("Enter side b : ");
		int b = scanner.nextInt();

		System.out.println("Enter side c : ");
		int c = scanner.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				System.out.println("Equilateral Triangle");
			} else if (a == b || b == c || a == c) {
				System.out.println("Isosceles Triangle");
			} else {
				System.out.println("Scalene triangle");
			}
		} else {
			System.out.println("not a valid triangle");
		}
	}
}
