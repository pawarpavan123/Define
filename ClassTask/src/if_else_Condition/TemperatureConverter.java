package if_else_Condition;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter temperature: ");
//        double temp = sc.nextDouble();
//
//        System.out.print("Enter unit (c/f): ");
//        char unit = sc.next().toLowerCase().charAt(0);
//
//        if (unit == 'c') {
//            double f = (temp * 9/5) + 32;
//            System.out.println("Temperature in Fahrenheit = " + f);
//        } else if (unit == 'f') {
//            double c = (temp - 32) * 5/9;
//            System.out.println("Temperature in Celsius = " + c);
//        } else {
//            System.out.println("Invalid unit");
//        }
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature : ");
		double temp = scanner.nextDouble();
		
		System.out.println("Enter unit (c/f): ");
		char unit = scanner.next().charAt(0);
		
		if (unit =='c') {
			double f=(temp*9/5)+32;
			System.out.println("Tempetature in Fahrenheit = "+f);
		}else if (unit=='f') {
			double c= (temp-32)*5/9;
			System.out.println("Temperature in celsius = "+c);
		}else {
			System.out.println("invalid unit");
		}
		
	}

}
