package com.exam;
/*
 * 
 *   문] 
 *   	컴퓨토와 사용자가 가위 바위 보를 한다.
 *   	사용자로부터 1(가위), 2(바위), 3(보) 중의 하나를 입력 받고
 *   	컴퓨터는 랜덤으로 임의 숫자를 선택 받는다.
 *   	난수(임의의 숫자) = > Math.randam () -> 범위 : 0.0 ~ 1.0 사의의 범위에 속하는 
 *   																		double 값을 반환함
 *   																		단, 0.0 은 범위에 포함
 *   																		1.0 은 범위에 포함하지 않음					
 *   
 * 							0.0 <= Math.random() < 1.0 												  
 *   
 *   						1 .각 변에 3을 곱한다
 *   						 	0.0 * 3 <= Math.random() * 3 < 1.0 *3
 *   									0.0 < = Math.random() * 3 < 3.0						
 *   								
 *   						2. 각 변을 정수형으로 강제형 변환한다.				
 *   											(int)0.0 < = (int)Math.random() * 3 < (int)3.0
 
 *										0 < = (int)Math.random() * 3 < (3
										0 , 1, 2						
 *							3. 각 변에 1을 더한다.								
 *										0 +1 < = (int)(Math.random() * 3) +1 < (3 +1

 *										1 <=(int)(Math.random() * 3)+1 < 4
 
 *							사용자   -> 1 무승부 컴승 유저승			
 *											2 유저승 		
 *
 */

import java.util.*;		  
public class Ex004 {
		public static void main(String[] args) {
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력 받음");
			Scanner sc = new Scanner(System.in);
			String player;
			int user,com;
			System.out.print("숫자 입력 :");
			user = sc.nextInt();
			com = (int)(Math.random()* 3) + 1;ㅌ
			System.out.println("사용자 " + user);
			System.out.println("컴퓨터 " + com);
			switch(user - com) {
			case 2 :
			case -1:
				System.out.println("컴퓨터가 이겼습니다.");
			break;
			case 1:
			case -2:
				System.out.println("사용자가 이겼습니다.");
			break;
			case 0 :
				System.out.print("비겼습니다.");
			break;
			}
		}
}
