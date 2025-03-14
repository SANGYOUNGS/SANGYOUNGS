package com.ifex;
/*
 * 문] 
 * 		윤년의 조건 
 * 			- 년도가 4의 배수
 * 									이면 서 100의  아니거나 
 * 			400의 배수이면 윤년
 * 그렇 지 않으면 -> 평년	
 * 
 * 		사용자로 부터 임의의 년도를 입력 받아 
 * 		입력 받은 년도 가 윤년인지 평년인지를 판정하는 프로그램작성 
 * 		년도 입력 " 2012 
 *  	2012 -> 윤년
 *  	년도 입력 : 2013
 *   	2013 -> 평년
 * 
 */
import java.util.*;
public class IfEx09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int year;
		String year1;
		System.out.println("년도를 입력해주세요");
		year = sc.nextInt();
		year1 = (year % 4 ==0 && (year % 100 != 0 || year % 400 == 0)) ? year +" 윤년입니다" : year + " 평년입니다";
		System.out.print(year1);
//		if(year % 4 ==0 && (year % 100 != 0 || year % 400 == 0)) {
//			System.out.printf("%d는 윤년입니다", year);			
//		} else {
//			System.out.printf("%d는 평년입니다", year);
//		}
	}
}
