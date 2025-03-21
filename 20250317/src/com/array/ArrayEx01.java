package com.array;

/* 배열의 개념
 *  - 배열은 같은 자료형들끼리 모아두는 하나의 묶음이다.
 *  - 자바에서 하나의 배열은 하나의 객체로 인식된다. 
 * 	 - 동일 자료형이 여러 개 반복될 때 이를 하나의 변수 명으로 관리하며,	
 * 		각각의 구분은 순차적인 첨자
 * 	- 참조(reference) 자료형의 크기 4바이트임
 *  	
 *  	1차원 배열
 *  		배열 선언 
 *  		int[] 배열명 ; 또는 int 배열명[];
 *  	초기화
 *  		배열명 = new 자료형[개수];
 *  		배열명 = {값1, 값2, 값3, ......};
 *  		
 *  		new 에 의해서 할당되면 자동으로 초기화됨
 *  
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열선언
			int[] arr = {1,2,3,4,5,6,7,8,9,0};
			// int arr[];
		
			
			// 메모리 할당
			// arr  = new int[10]; // 0 1 2 3 4 5 6 7 8 9
			
			
			int arr2[] = {1,2,3,4,5,6,7,8,9,0};
			
			System.out.println(arr2.length);
			
			for(int i=0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			arr[0] = 11;
			arr[1] = 12;
			System.out.println(arr[0]);
			
			// 반복문을 활용하여 배열에 저장된 데이터를 출력 
			for(int i=0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();	
			// 배열 사용시 향상된 for문 활용
			System.out.println("새로운 반복문");
			for(int t : arr)
				System.out.print(t + "\t");
	}		
}
