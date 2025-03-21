package com.exam;
//길이가 10인 배열을 생성하고 0 ~ 9 까지의 숫자로 초기화 한다.
//random()함수를 이용해서 배열의 임의의 위치에 있는 값과 
//배열에 첫번째 값에 값을 바꾼다. 

//
import java.util.*;
public class ArrayExam03re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[10];
		// 0~ 9까지 숫자로 초기화한다.
		for(int i = 0; i < 10; i++) {
			arr[i] += i;
			System.out.println(arr[i] + " ");
		}
		for(int i =0; i < 100; i++) {
			int n = (int)(Math.random()*10);
				int temp = arr[0];
				arr[0] = arr[n];
				arr[n] = temp;		
		}
		for(int i =0 ; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
	}
}
}
