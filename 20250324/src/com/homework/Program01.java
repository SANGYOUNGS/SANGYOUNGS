package com.homework;

/* 1
 * 	2 3	
 * 4 5 6
 * 7 8 9 10
 * 
 */

public class Program01 {

	public static void main(String[] args) {
		int cnt = 4; // 행의크기
		// 2차원 배열 선언
		int[][] arr = new int[cnt][];
		int num = 1;
		// 배열의  값을 저장
		for(int i=0; i < arr.length; i++) {
			//(레기드 배열 , 비정형배열 , 가변 배열) 선언시 2차원 배열의 공간이 늘어남
			arr[i] = new int[i+1];
			for(int j =0; j < arr[i].length; j++) {
				arr[i][j] =num++;
			}
		}
	// 배열에 저장된 값출력
	for(int i = 0; i< arr.length; i++) {
		for(int j =0; j < arr[i].length; j ++) {
			System.out.printf("%d\t", arr[i][j]);
		}
		System.out.println();
	}
}
}
