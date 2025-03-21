package com.array;

/*
 * 자바의 배열은 1차원 관리한다. 
 * int[][] arr = new int[3][];
 * 
 * arr[0] = new int[2];
 * arr[1] = new int[1];
 * arr[1] = new int[3];
 */

public class ArrayEx04 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		
		arr[1][0] = 300;
		arr[2][0] = 400;
		arr[2][1] = 500;
		arr[2][2] = 600;
		
		for(int i = 0 ; i < arr.length; i++) { // 행 => i 
			for(int j = 0; j < arr[i].length; j++) { //열 => j
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
