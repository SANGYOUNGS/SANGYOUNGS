package com.forEx;
/*
 *  1~ 10까지의 합계
 */
public class forEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 누적 변수 선언 0 +1 + 2 +3 + 4 + 5~ + 10 =
		int total = 0;
		int i;
		for(i = 1; i <= 10; i++) {
			total += i; // 복합 대입 연산자 
			System.out.println("1부터 " + i + " 까지의 합 : " + total );
		}
	}
}
