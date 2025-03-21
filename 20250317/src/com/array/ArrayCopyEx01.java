package com.array;

public class ArrayCopyEx01 {
	
	public static void main(String[] args) {
		int [] arr = new int [5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1; // arr 배열에 1 ~ 5 저장
		}
		System.out.println("[변경 전]");
		System.out.println("배열의 길이 : "+arr.length);
		// 변경 전 배열의 길이 출력 값은 5
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] "+arr[i]);
		// 각 인덱스에 저장된 값을 출력하는 for문
		}
		
		int [] tmp = new int[arr.length * 2];
		System.out.println("배열의 길이 : "+tmp.length);
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		// 배열 arr에 저장된 값들을 배열 tmp에 복사
		}
		
		arr = tmp;
		// arr (5칸)에 tmp(10칸)를 저장하면 공간까지도 저장한다
		/*
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i]+"\t");
		// 배열 tmp에 저장된 값들을 출력하는 for문
		}
		*/
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		// arr에 tmp를 저장한 후 출력하면 tmp처럼 10칸이 출력된다
		}
	}
}

