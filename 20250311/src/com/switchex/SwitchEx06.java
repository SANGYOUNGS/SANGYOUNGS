package com.switchex;

/* 주민번호를 입력받아 성별을 확인하는 프로그램	
 * 	주민버노 뒷번호의 첫번째 자리의 값은 성별을 의미한다.
 * 	1, 3 남자 , 2, 4여자 
 * 주민번호 13자리
 * 	
 * 
 */
import java.util.*;



public class SwitchEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String jumin;
			char gender; 
			System.out.println("주민번호 입력 : ");
			jumin = sc.next();
			gender= jumin.charAt(7);
			
			switch(gender){
			case '1' :
			case '3' :
				switch(gender) {
				case '1' : 
					System.out.println("당신은 2000년 이전의 남성입니다.");
				break;
				case '3' :
					System.out.println("당신은 2000년 이후의 남성입니다.");
				break;
				}	
				//	System.out.println("당신은 남자 입니다.");
			break;
			case '2' :
			case '4' :
				switch(gender) {
				case '2' :
					System.out.println("당신은 2000년 이전의 여성입니다.");
				break;
				case '4' :
					System.out.println("당신은 2000년 이후의 여성입니다.");
				}
					//System.out.println("당신은 여자 입니다.");
			break;
			default :
				System.out.println("유효하지 않은 주민번호 입니다.");
			};
	}
}
