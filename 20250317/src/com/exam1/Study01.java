package com.exam1;


import java.util.*;
public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); 
			}
		int max = arr[0]; // 맥스 값을 받고
		int min =  arr[0]; // 중간 값
		for(int i=0; i< arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.printf("%d\t",arr[i]);
			}
		}
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] > max) { // 최댓값
				max =arr[i]; 
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		System.out.print(min);
	}
}