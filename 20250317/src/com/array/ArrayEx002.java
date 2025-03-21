package com.array;
/*
 * 
 * 
 * 
 * 
 */



public class ArrayEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 알파벳 대문자  구성 
		 * char arr1;
		 * arr1 = new char[26];
		 * arr1[0] ='A';
		 * arr1[1] ='Z';
		 *
		 * 방법 2
		 * char[] arr2 ={'A','B', .. .. .'Z'}
		 * 방법 3
		 * char[] arr3 = new char[26]
		 * for(int i =0, b = 65 ; i < arr3.length, i++,b++)
		 * 	arr3[i] =(char)b;
		 * 
		 * 
		 */
		char[] arpha = new char[26]; //초기화
		for(int i = 0; i < arpha.length; i++) {
			arpha[i] = (char)('A' + i);
		} // 배열에 데이터 값 저장
		System.out.print(arpha[0]);
		System.out.println();
		// 배열에 저장된 전체 데이터 출력
		for(int i = 0; i < arpha.length; i++) {
			System.out.print(arpha[i]+" ");//
		}
	}
}
