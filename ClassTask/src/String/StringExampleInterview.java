package String;

public class StringExampleInterview {
	public static void main(String[] args) {

		String s = "TUESDAY";

		char c = s.charAt(2);
		System.out.println(c);

		for (int i = 0; i <= s.length(); i++) {

			if (i == 2) {
				System.out.println(s.charAt(i));
			}

		}
//		
//		String s="tuesady";
//		char c =s.charAt(2);
//		System.out.println(c);
//		String sc=s.toUpperCase();
//		System.out.println(sc);
//		
//		for(int i=0;i<=s.length();i++) {
//			if (i==2) {
//				System.out.println(s.charAt(i));
//			}
//		}
	}
}
