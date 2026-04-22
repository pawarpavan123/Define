package TwoClass;

public class UserNameGenerator {
	
	public String getUserName(String name , String surename, long number) {
		
		long numberr = (long)number;
		
		String UserName= name + surename +numberr;
		
		return UserName;
	}

}
