package com.exam;

/* 문]
 *  배열에 저장된 값중 최대값과 최소값을 구하는
 * 	프로그램을 구현하시오
 * 
 * 
 */
public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {79,88,91,33,100,95,55};
		
		int max = arr[0]; // 배열의 첫번째 값으로 최댓값을 초기화 한다.
		int min = arr[0];		// 배열의 첫번째 값으로 최소값을 초기화 한다.
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] > max) { // 최댓값
				max =arr[i]; 
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최댓값은 " + max);
		System.out.println("최소값은 " + min);
	}

}
