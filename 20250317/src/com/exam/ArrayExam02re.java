package com.exam;
/* 문]
 *  배열에 저장된 값중 최대값과 최소값을 구하는
 * 	프로그램을 구현하시오
 * 
 * 
 */
import java.util.*;
public class ArrayExam02re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[5];
		for(int i=0; i < arr.length; i++) {
			arr[i] += sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
