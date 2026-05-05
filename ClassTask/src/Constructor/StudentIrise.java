package Constructor;


public class StudentIrise {
	public static void main(String[] args) {
		//Rohit
		Irise iriseRohit = new Irise();
		String course = iriseRohit.learnFromSuyash();
		System.out.println(course);
//		System.out.println(iriseRohit.learnByABC());
		String name = iriseRohit.learnByABC();
		System.out.println(name);
		int age=iriseRohit.ageofme();
		System.out.println(age);
	}

}
