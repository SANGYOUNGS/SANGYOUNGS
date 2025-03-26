package com.homework;
/*
 *  1 2 3 4 5
 * 	10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 
 * 
 * 
 */

public class Problem02 {

	public static void main(String[] args) {
		int cnt = 5;
		int[][] arr =new int [4][cnt];
		int add = 1;
		//행
		for(int i = 0; i < arr.length; i++) {
				
				if(i % 2 ==0) {
						for(int j = 0; j < arr[i].length; j++)
						arr[i][j] = add++;
				}else {
						for(int j =(arr[i].length-1); j >=0; j--) {
							arr[i][j] = add++;
						}
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
