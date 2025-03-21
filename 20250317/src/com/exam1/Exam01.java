package com.exam1;

public class Exam01 {
	
	public static int[][] addOneDArr(int[][] arr, int add) {
		for(int i = 0; i < arr.length; i++) {
			arr[i][] += add;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,},{3,4}};
		int add = 2;
		int[] result = addOneDArr(arr, add);
		for(int num : result) {
			System.out.print(num + " ");
		}
		}
	}
