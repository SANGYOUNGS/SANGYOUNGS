package com.switchex;
import java.util.*;
import java.io.*;
/*
 * 
 *  문] 두 수와 연산자를 입력받아 계산하는 프로그램 구현하시오.
 *   		연산자를 받아 
 * 			단, 입력은 BufferdReader 로 
 * 			출력 결과
 * 			첫번째 수 : 3 
 * 			연산자  : (+,-,x,/,%): +
 * 			두번 째 수 : 2
 * 			
 *  		3 + 2 = 5 
 *  		되도록 출력(print f로 처리)
 *  //  스위치 import 
 */
public class SwitchEx03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader 객체 생성
		Scanner sc = new Scanner(System.in);
		int x , y;
		int r = 0;
		char op= ' ';
		// 변수 선언 
		System.out.print("정수를 입력해주세요.");
		x = //Integer.parseInt(br.readLine());
				sc.nextInt();
		System.out.print("연산자를 입력해주세요.");
		op = //(char)System.in.read();
				// br.readLine.charAt(0)
				sc.next().charAt(0);
		//System.in.skip(2); //  BufferdReader 로 입력했을 때 char  입력시 엔터 값 들어가서 생략필요
		System.out.print("정수를 입력해주세요.");
		y = //Integer.parseInt(br.readLine());
			  sc.nextInt();
		if(op == '-' ||  op == '+' || op == '*' || op == '/' || op == '%') {
		if(op == '+') {
			r = x + y;
		}
		else if(op == '-') {
			r = x - y;
		}
		else if(op == '*') {
			r = x * y;
		}
		else if(op == '/') {
			r = x / y;
		}
		else if(op == '%') {
			r = x % y;
		}
	} else {
		System.out.println("연산자를 잘못입력하였습니다");
	}
//		switch(op) {
//		case '+' : 
//			 r = x + y; 
//		break;
//		case '-' :
//			 r = x - y;
//		break;
//		case '*' :
//			r = x * y;
//		break;
//		case '/' :
//			r = x / y;
//		break;
//		case '%' :
//			r = x % y;
//		break;
//		default:
//			System.out.println("연산자 잘못 입력하였습니다.");
//			return;
		System.out.printf("%d %c %d = %d", x,op,y,r);
	}
}
