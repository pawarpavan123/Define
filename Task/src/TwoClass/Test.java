package TwoClass;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		UserNameGenerator generator = new UserNameGenerator();
		
		String details=generator.getUserName("pavan","pawar",8308003861l);
		System.out.println(details);
	}

}
