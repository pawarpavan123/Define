package ForLoop__whileLoop;


import java.util.Scanner;

public class NaturalNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the values : ");
	int n=sc.nextInt();
	
	for(int i=10;i>=1;i--){
		System.out.println("your number : "+i*n);
	}
	sc.close();
}
}
