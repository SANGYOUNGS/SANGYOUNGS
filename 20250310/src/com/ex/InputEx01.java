package com.ex;
/* ASCII 입력 받기
 * 
 *  기본으로 알아야할 아스키 코드 값
 * 
 * 		48 ~ 57 -> 0 ~ 9
 * 		65 ~ 90 -> A ~ Z 
 * 		97 ~ 122 -> a ~ z   
 * 
 *   '\r' => 13
 * 	  '\n' => 10
 *	  '\t' => 9
 *	  '/b' => 8	 	
 */


import java.io.*;
public class InputEx01 {
	
	public static void main(String[] args) throws IOException{
		System.out.print("문자입력 : ");
		char i = (char)System.in.read(); // 아스키 코드 값
		//System.in.skip(2);
		System.in.read(); //\r - > 엔터키를 받아서 처리하는 부분
		System.in.read(); //\n - > 엔터키의 줄바꿈 처리를 하는 부분
		// \r\n = > 13 -48 =>  -35 
		System.out.print("문자입력 : ");
		int c = System.in.read(); // 문자 하나 입력
		System.out.println("문자 : " +  i); //a
		System.out.println("숫자 : " +  c); // 13
	}
}
