package com.ifex;
/* 
 *  조건 삼항 연산자 
 * 		
 * 		조건식, 식1, 식2
 * 
 * 		결과 = 조건식에 ? 식1(참일 때) : 식2(거짓일 때); 
 * 					
 *		int x = 20, y =30; 
 *		result = (x > y ) ? x : y; 
 *  				20    	30	
 *  	
 *  	result = 30
 *  
 *  	if(x > y) 
 *  	x 
 * 		else
 * 		y
 *  	문 ] 숫자 하나를 입력받아 그 수가 1이면 "남성" , 2이면 "여성" 이라는 
 *  			글자를 출력하는 프로그램을 작성하시오.
 *  			단, 조건 삼항 연산자로 처리하시오
 */

import java.io.*;
public class IfEx05 {

	public static void main(String[] args) throws IOException {
		
			int dist = 0;
			String gender = "";
			System.out.print("성별 입력(1:남성, 2: 여성) :");
			dist = System.in.read()-48;
			
			System.out.println();
//			if(dist == 1)
//				System.out.println("남성");
//			else
//				System.out.println("여성");
			
			gender = ((dist == 1) ? "남성" : "여성");
			System.out.println("당신의 성별은 : " + gender);
	}

}
