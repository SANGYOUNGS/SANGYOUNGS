package com.exam;
/*
	문]
			정수 새개를 입력받아 큰 순서대로 나열하는 프로그램을 구현하시오
			
			 결과 출력
			 첫번째 수 2--
			 두번째 수 78
			 세번째 수 800
			 
			 800 > 200 > 78
*/
import java.util.*;
public class Ex06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b, c;
		int max;
			//System.out.println("첫번째 수입력");
			a = sc.nextInt();
			//System.out.println("두번째 수 입력");
			b = sc.nextInt();
			//System.out.println("세번째 수 입력");
			c = sc.nextInt();
			max = a;
			if (max > b ) {
				max = b;
			}
			if (max > c) {
				max =  c;
			}
			
		System.out.println(max);
	}
}
