package com.example;
/*
 *  문 ] 0 에서 부터 입력한 정수의 합계를 구하는 프로그램을 구현하시오
 * 			단 .입력은 Scanner 로 한다.
 * 			
 * 
 * 
 */

import java.util.*;
public class ForEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int total =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		a = sc.nextInt();
		for(int i =0; i <= a; i++) {
			 total += i;
		}
		System.out.println(total);
	}

}
