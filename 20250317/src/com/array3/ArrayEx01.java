package com.array3;

/* 3차원 배열
 * 	면 행 열 로 구성되어 있음
 * 	배열선언
 * int[][] arr = new int[2][3][4]
 * 	면이 2개 ,행이 3개 열이 4
 * 	배열크기 : 면 * 행 * 열 = 24
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr = new int[2][3][4];
		int v = 1;
		
		for(int k=0; k < arr.length; k++) {//면
			for(int i = 0; i< arr[k].length; i++) {//행
				for(int j =0; j < arr[k][i].length; j++) {//열
					arr[k][i][j] = v++;
				}
			}
		}
		// 면 
		for(int k=0; k < arr.length; k++) {//면
			for(int i = 0; i< arr[k].length; i++) {//행
				for(int j =0; j < arr[k][i].length; j++) {//열
					System.out.print(arr[k][i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
