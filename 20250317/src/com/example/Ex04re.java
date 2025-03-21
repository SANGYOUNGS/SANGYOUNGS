package com.example;

/* 문]
 * 		돈의 액수를 입력받아 오만원권 , 만원권 , 천원권 , 5백원짜리 동전, 
 * 		100원 짜리 동전 50원 짜리 동전 , 10원짜리 동전 ,1원짜리 동전
 * 
 * 		각 몇 개인지 변환하는 프로그램을 구현하시오.
 * 		배열 과 반복문을 이용해서 
 * 		돈의 액수를 입력받아서 
 * 		int[] unit = {50000, 10000, 1000, 5000, 500, 100, 50, 10, 1}
 		돈 입력 : 65123
 		1 5만 if(
 		1 1만
 		5 천원 5개
 		1 백원 1개
 		2 십원 2개
 		3 일원 3개
 */
import java.util.*;
public class Ex04re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int[] unit = {50000, 10000, 1000, 5000, 500, 100, 50, 10, 1};
	int mok = 0;
	int money = sc.nextInt();
	for(int i = 0; i < unit.length; i++) {
		mok = money / unit[i];
		money = money % unit[i];
		if(mok > 0) {
			System.out.printf("%d원짜리 동전 개수 : %d개%n", unit[i],mok);
		}
	}
	}
}
