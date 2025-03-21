package com.exam;

import java.util.Arrays;

public class ArrayExam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() *10);
			System.out.print(arr[i] + " ");
		}
		Arrays.sort(arr);
		System.out.println();
		//System.out.print(Arrays.toString(arr));
		// -
		for(int i = 0; i < arr.length-1; i++){
            boolean changed = false; 
            for(int j = 0;  j < arr.length -1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    changed = true; 
                }
            }
            if(!changed) break;
//            for(int k = 0; k < arr.length; k++) {
//                System.out.print(arr[k] + " ");
            }
			for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
	}
}
