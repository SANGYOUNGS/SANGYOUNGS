package com.ex;

import java.io.*;


public class Test003 {

	public static void main(String[] args) throws IOException {
		
		// 숫자하나 입력 받음
		System.out.println("숫자 입력 :");
		int x = System.in.read()-'0'; // 숫자 48
//		System.in.read();
//		System.in.read();
		System.in.skip(2);
		
		System.out.println("숫자 입력 :");
		int y = System.in.read()-'0';
		
		
		System.out.println(x);
		System.out.println(y);
	}

}
