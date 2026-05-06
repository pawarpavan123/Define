package String;

public class today {
	public static void main(String[] args) {
		
		String name ="pavan";
		
		for(int i=0;i<name.length();i++) {
			if (i%2==0) {
				System.out.println(name.charAt(i));

			}
		}
		System.out.println("===================");
		
		for(int i=name.length()-1;i>=0;i--) {
			if (i%2==1) {
				System.out.println(name.charAt(i));

			}
		}
	}

}
