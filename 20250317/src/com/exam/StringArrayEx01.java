package com.exam;

public class StringArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] names = {"Kim", "Park", "Lee"};
			for(int i = 0; i < names.length; i++) {
				System.out.println("name [" + i + "]: " + names[i]);
			}
				String temp = names[2];
				System.out.println(temp);
				
				names[0] = "Choi";
				for(String s : names) {
					System.out.println(s);
				}
			}
	}
