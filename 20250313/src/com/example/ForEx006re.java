package com.example;

/*
 *  문] 
 * 			사용자로 부터 임의의 정수를 입력 받아
 * 			1부터 입력 받은 수까지 의 전체 합계와 짝수의 합계 및 홀수의 합계를 
 * 			출력하는 프로그램을 작성하시오
 *  	출력 결과 
 *  		정수입력 : 59;
 *  		1 ~ 10 까지 의 전체 합계  : 55; 짝수의합계  홀수합계
 *  		1 ~ 20
 *  		1 ~ 30
 *  		1 ~ 40
 *  		1 ~ 59
 * 
 */
import java.util.*;
public class ForEx006re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		int total = 0;
		a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
				total += i;
			if(i % 2 == 0) {
				b += i;
			}else {
				c += i;
			}
			if (i % 10 == 0) {
				System.out.println(i+"의 전체합계"+total);
				System.out.println(i+"의 전체짝수"+b);
				System.out.println(i+"의 전체홀수"+c);
				System.out.println();
			}
		}
			System.out.println(a+"의 전체합계"+total);
			System.out.println(a+"의 전체짝수"+b);
			System.out.println(a+"의 전체홀수"+c);
	}
}
