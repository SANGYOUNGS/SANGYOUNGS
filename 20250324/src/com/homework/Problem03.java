package com.homework;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt_i = 4; // 행의 크기
		int cnt_j = 5; // 열의 크기
		int[][]arr = new int[cnt_i][cnt_j];
		// 2차원 배열 선언
		
		// 행
		for(int i=0; i < arr.length; i++) {
			// 숫자는 하나씩 증가한다.
			// 행의 시작값은 행*열 - 1 시작
			// 열의 시작은 행의 크기 * 열의 인덱스 
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (cnt_i * cnt_j - i) - (cnt_i * j);	
			}
		}
		//출력
		for(int i = 0; i< arr.length; i++) {
			for(int j =0; j < arr[i].length; j ++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
