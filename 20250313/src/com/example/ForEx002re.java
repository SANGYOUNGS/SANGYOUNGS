package com.example;
/* 문] 
 * 		양의 실수만 입력 받아 합계를 구하고 평균을 프로그램을 작성하시오.
 * 		단,음의 정수를 입력하면 종료하고 계산함
 * 		결과
 * 	양의 실
 * 
 */

import java.util.*;
public class ForEx002re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a = 0.0f , avg = 0.0f , total = 0.0f;
		int cnt = 0;
		for(;;) {
			System.out.print("양의 정수를 입력해주세요");
			a = sc.nextFloat();
		
			if(a < 0.0) {
			System.out.println("음의 정수를 입력했습니다.");
			break;
			}
			cnt ++;
			total += a;
			avg = total / cnt;
		}
		System.out.println("카운트 :" +cnt);
		System.out.println("합계 : " +total);
		System.out.println("평균 : " + avg);
	}
}
