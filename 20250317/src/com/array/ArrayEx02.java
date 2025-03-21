package com.array;
// 양의 정수 5개를 입력받아 배열에 저장하고 , 
// 제일 큰수를 출력하는 프로그램을 구현하시오.

import java.util.*;
public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		// 입력
		for(int i=0; i < a.length; i++) {
			System.out.print("정수를 입력해주세요");
			a[i] = sc.nextInt();
			sum += a[i];
			if(max < a[i]) {
				max = a[i];
			}
		}
		avg = sum /(float)a.length;
		System.out.println("가장 큰 값은 " + max +" 입니다.");
		System.out.println("합계는 " + sum +" 입니다.");
		System.out.printf("평균은 %.2f" , avg);
		sc.close();
	}
}
