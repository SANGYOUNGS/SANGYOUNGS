package com.example;

/*
 * 문 ]
 * 		사용자로 부터 원하는 단을 입력 받아
 * 		해당하는 구구구단을 출력하는 프로그램을 작성하시오.
 * 		단, 구구단은 2단에서 부터 9단 까지로 한다.
 * 		이외의 수가 9단까지로 한다.
 * 
 */
import java.util.*;
public class forEx007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("단 입력 :");
		n = sc.nextInt();
		if(n >= 2 && n <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d%n" ,n,i, n*i);
			}
			
		} else {
			System.out.println("2부터 9까지의 정수만 가능합니다");
			return;
		}	
	}
}
