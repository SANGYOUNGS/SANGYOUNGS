package com.ex;
/*
 *  short : 2byte , 값의 범위 : 65535 (-32768 ~ 32767)
 * 		
 * 
 * 
 */
public class ShortEx {

	public static void main(String[] args) {
		short s; 
		s = 66;
		// 초기화 안하면 에러 발생 
		// 이유 : 초기화 하지 않으면 쓰레기 저장되지 때문에 초기화를 하는 것이 안전하다.
		
		System.out.println(s);
	}

}
