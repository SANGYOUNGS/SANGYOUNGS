package com.example;

/* 문] 
 * 		양의 실수만 입력 받아 합계를 구하고 평균을 프로그램을 작성하시오.
 * 		단,음의 정수를 입력하면 종료하고 계산함
 * 		결과
 * 	양의 실
 * 
 */
import java.util.*;
public class ForEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float input=0.0f, sum=0.0f, avg=0.0f;
		int cnt = 0;
		for(;;) {
			System.out.println("양의 실수 입력");
			input =sc.nextFloat();
			if(input < 0.0) {
				System.out.println("음수가 입력되었습니다.");
				break;
			}
			sum += input;
			cnt++;
		}
		if(cnt > 0) {
			avg = sum / cnt;
		}
		System.out.println("카운트" + cnt);
		System.out.println("입력된 양의 실수의 합계" + sum);
		System.out.println("입력된 양의 실수의 평균" + avg);
	}
}
