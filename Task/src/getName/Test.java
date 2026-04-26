package getName;

import java.util.Scanner;
//import java.getName.*;
public class Test {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the values");
		int sc =scanner.nextInt();
		
		repository repository = new repository();
		Entity entity=repository.FindByid(sc);
		
		if (entity!=null) {
		    entity.display();
		}else {
			System.out.println("not exit");
		}
		
	}

}
