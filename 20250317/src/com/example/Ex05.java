package com.example;

/*
 *  	문] 
 * 			행 4 , 열 4 인 2차원 배열을 생성하고 1에서 부터 10까지 범위의
 * 			정수를 랜덤하게 생성하여 정수 16개를 
 * 			배열에 저장하고 출력하는 프로그램을 작성하시오.
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][4];
		for(int i = 0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j] += (int)(Math.random() * 10 + 1);
			}
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	}
}
}
