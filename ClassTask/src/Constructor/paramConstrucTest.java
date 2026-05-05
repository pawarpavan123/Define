package Constructor;

public class paramConstrucTest {
public String name;
	
	public int age;
	
	public paramConstrucTest(String name, int age) {
		this.name = name;
		this.age=age;
	}
	
	
	
	public void printName() {
		System.out.println("Name is : " +name);
		System.out.println(age);
	}
	
	public void mydetails(String name, int pin, long number) {
		System.out.println("name: "+name + " your pin : "+pin+" your number: "+number);
		System.out.println(age);
	}

}
