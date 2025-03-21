package com.example;

/*
 *  	중첩 반복문(for , while , do ~ while) 을 이용하여 다음 문제를 구현하시오 .
 * 
 * 		임의의 정수를 입력 받고 * 출력 하는 프로그램 구현하시오.
 * 
 * 		정수입력 : 5 개
 *   	*****
 *   	****
 *   	***
 *   	**
 *   	*
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요");
		int a = sc.nextInt();
		int i = a;
//		for(int i = a; i > 0; i--) {
//				for(int j =1; j <= i; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		while(i > 0) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}