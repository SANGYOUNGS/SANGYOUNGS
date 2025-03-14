package com.ex;

import java.io.IOException;

//숫자하나 입력
// System.in.read() -48 or '0' ;
// System.in.read() -'0';
public class InputEx02 {
	public static void main(String[] args) throws IOException{
		int n1, n2;
		System.out.print("첫번째 숫자 :");
		n1 = System.in.read() -48 ;
		System.in.skip(2);
		System.out.print("두번째 숫자 :");
		n2 = System.in.read() -'0';
		
		System.out.println("n1 : "+n1 + ", n2 : " +n2);
	}
}
