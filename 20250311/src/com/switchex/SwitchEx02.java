package com.switchex;

/* 	switch ~ case 문은 조건식을 먼저 계산한 다음 
 * 		그결과와 일치하는 case 문으로 이동함
 * 
 * 
 * 
 * 		이동한 case 문 있는 문장을 수행한 후 
 * 		break문을 만나면 전체 switch문을 빠져 나간다.
 * 
 * 		1.조건식을 계산한다.
 *		2.조건식과 일치하는 case문으로 이동함   
 * 		3. case문에 있는 문장을 수행한다.
 * 		4. break문을 만나면 switch문을 종료함 
 * 
 * 	
 * 		switch 문의 제약 조건
 * 		1. 조건식의 결과는 정수 또는 문자열이여야한다.
 * 				-자바 버전 1.7이전 버전에서는 조건식에 문자열을 허용하지 않았다.
 * 		2. case 문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
 * 				int num , 
 * 				final int ONE =1;
 * 				case "YES" :
 * 
 */

/*
 * 	문 ] 현재가 몇월인지 입력받아서 해당하는 계절을 출력하는 프로그램을 구현
 * 			월입력 : 3
 * 			현재의 계절은 봄입니다.
 * 
 */



import java.util.*;

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("월을 입력해주세요.!");
		int month = sc.nextInt();
		//if(a >=  1 && a <= 12)
		/*
		switch (a) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다");
			break;
		case 12:
		case 1:
		case 2:
			System.out.print("현재의 계절은 겨울입니다");
			break;
		default :
			System.out.print("잘못입력했습니다");
		}
		*/
		if(month >= 3 && month <= 12) {
		if(month ==3 || month ==4 || month ==5) {
			System.out.println("현재의 계절은 봄입니다.");
		} else if(month ==6 || month==7 || month ==8) {
			System.out.println("현재의 계절은 여름입니다.");
		} else if(month ==9 || month==10 || month ==11) {
			System.out.println("현재의 계절은 가을입니다.");
		} else {
			System.out.println("현재의 계절은 겨울입니다.");
		}
		} else {
			System.out.println("월의 범위를 벗어났습니다.");
		}
	}
// else {System.out.println("월의 범위를 벗어났습니다.")}
}
