package com.forEx;
// A ~~~ Z
public class forEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(char ch= 'A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
		System.out.println();
		for(int i = 97; i <= 122; i++) {
		 System.out.print((char)i);
		}
	}
	*/
		for(char ch='A'; ch<= 'Z'; ch++) {
			for(char b = 'A'; b <= 'Z' -(ch - 65); b++) {
				System.out.print('*');
				}
			System.out.println();
			}
		}

}
