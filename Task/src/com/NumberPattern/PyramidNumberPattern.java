package com.NumberPattern;

public class PyramidNumberPattern {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			
			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			// numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("//================================================= second program=========================//\r\n"
				+ "");
		//================================================= second program=========================//
		
		int N=5;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i-n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
