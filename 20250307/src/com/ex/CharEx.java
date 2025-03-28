package com.ex;
/* char : 2byte
 *  아스키 코드 (ASCII : American Standard Code for Information Interchange)
 		- 정보 교환을 위한 미국 표준 코드 
 		  KSC 5601 
 * 		(ISO 8859-1 ) : 255  - > (확장 완성형 : cp949) : 8822 
 * 									 			한글 완성형  
 *	
 *	유니코드 (Unicode)
 *  	2byte = > 65536 ( 16bit) 
 * 		- > 21bit (약 200만 문자로 확장됨)
 * 		UTF-8, UTF-16, UTF-32
 * 		UTF-8 : 하나의 문자 1 ~ 4 byte의 가변 크기로 표현 가능함 
 * 						영어,숫자 - 1byte, 한글 3byte로 표현함
 * 
 * 
 */
public class CharEx {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '\u0041';
		
		System.out.println("ch1 + ch2 = " + ch1+ ch2);
		System.out.println("ch1 + ch2 = " + (ch1 +ch2));
		//계산이 가능한 숫자로 변경됨
		System.out.println("ch1 + ch2 = " + (char)(ch1 +ch2));
		// 정수 위에 실수
	}

}
