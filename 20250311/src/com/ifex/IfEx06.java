package com.ifex;

/*		문]
 * 			문자 하나를 입력받아 그 문자가 산술연산자 인지 아닌지를 판단하는
 * 			프로그램을 구현하시오.
 * 			삼항연산자로 처리하시오
 * 			+ - *  / % = > 
 * 			이 문자 외에 입력 되는 문자는 산술연산자가 아닙니다. 
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class IfEx06 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자 입력");
		char i = sc.next().charAt(0);
		String e ="";
		e = ((i == '-' || i == '+' || i == '*' || i == '/' || i == '%') ? "산술연산자" : "산술연산자 아닙니다");
		
		
//		if (i == '-' || i == '+' || i == '*' || i == '/' || i == '%' ){
//			System.out.print("산술연산자");
//		} else {
//			System.out.println("산술연산자 아닙니다.")
		System.out.println(e);
	}
		}
