package com.ifex;
/*
 * 
 *  임의의 정수 두개를 입력받아 작은 수가 먼저 출력 되도록 하는 
 *  프로그램을 구현하시오
 * 
 * 
 */
import java.util.*;
public class ifEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x , y; // imsi
		
		System.out.print("첫번째 정수 :");
		x = sc.nextInt();
		System.out.print("두번째 정수 :");
		y = sc.nextInt();
		System.out.println("바꾸기 전의 X 값 : " + x + " ,y 값 : " + y);
//		if(x > y) {
//		imsi = x;
//		x = y;
//		y = imsi;
//		}
		if(x > y) {
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		}
		
		 
		//bit 연산자  && ||  ~ ^
		// 2진수 로 바꿈  21 = > 10101 7 => 00111  
		System.out.println("바꾸기 후의 X 값 : " + x + " ,y 값 : " + y);
	}

}
