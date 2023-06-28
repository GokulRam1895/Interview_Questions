package com.org.interview;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String s="Automation";
		String r=" ";
		char c;
		for (int i = s.length()-1; i >=0; i--) {
			
			c=s.charAt(i);
			
			r=r+c;
			
			
		}
		System.out.println(r);
		
		
	}

}
