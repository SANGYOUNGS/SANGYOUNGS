package com.forEx;

/*
 *  	for문 형식
 * 			초기값 , 조건식 , 증감식 {} ==> 4부분으로 이루어짐
 * 		구조 
 * 		for ( 초기화; 조건식; 증감식) {
 * 				--> 조건식이 참일 때는 수행될 문장이 온다.
 * 		}
 * 
 * 		반복되는 문장이 하나인경우 {} 는 생략 가능하다. 
 */

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i ++)
		System.out.println(i);
		System.out.println();
		for(int i = 1; i <= 5; i++)
			System.out.print(i + "\t");
	}
}
