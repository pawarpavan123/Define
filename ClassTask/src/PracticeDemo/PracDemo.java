package PracticeDemo;

//import java.util.Iterator;
import java.util.Scanner;

public class PracDemo {
	public static void main(String[] args) {
//		System.out.println("Start->");
//		for (int i=0;i<5;i++) {
//			System.out.println("Ram = "+i);
//		
//		for(int i=5;i<=50;i++) {
//			if (i % 2==0) {
//				System.out.println(i);
//			}
//		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value = ");
		int a = scanner.nextInt();
		
		
		for(int i=1 ;i<=10;i++) {
			System.out.println(a+" x "+i+" = "+i*a);
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please eneter a number to get table");
//		int input = sc.nextInt();
//		sc.close();
		
		// consider input = 5
		// as table has 10 numbers so we want numbers from 1 to 10
		
//		System.out.println("Table of "+ input +" is as follow - ");
//		for(int i = 1 ; i <= 10 ;  i++) {
//			System.out.println(  i * input);
//		}
		}
	}


