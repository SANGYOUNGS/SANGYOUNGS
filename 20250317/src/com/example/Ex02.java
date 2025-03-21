package com.example;

/*
 * 영어의 소문자를 하나 입력 아래와 같이 출력하는 프로그램을 구현하시오.  
 * 
 * 	알파벳 입력: e
 * abcde
 * abcd
 * abc
 * ab
 */
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a < 'a' || a > 'z') {
			System.out.println("소문자가 아닙니다.");
			return;
		}
		for(char i =a; i >= 'a'; i--) {
			for(char j ='a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
