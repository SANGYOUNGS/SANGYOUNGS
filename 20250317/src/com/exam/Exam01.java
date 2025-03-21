package com.exam;

/*
 * 	문]
 * 		임의의 숫자가 들어있는 배열의 숫자 데이터 중
 * 		짝수인 요소만 골라서 출력하고,
 * 		3의 배수인 요소만 골라서 출력하는 프로그램을 작성하시오.
 * 		임의의 숫자 = > 4 7 9 1 3 2 5 6 8
 * 
 * 		배열의 전체 요소 를 출력
 * 
 * 		짝수만 선택 출력
 *   	4 2 6 8
 * 		3의 배수만 선택 출력
 		9 3 6
 */	


public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		System.out.println("배열의 전체 요소 출력");
		for(int i =0 ; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("배열 전체요소 2의배수 출력");
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println();
		System.out.println("배열 전체요소 3의 배수 출력");
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + "\t");
			}
		}
	}

}
