package com.array;
//양의 정수 5개를 입력받아 배열에 저장하고 , 
//제일 큰수를 출력하는 프로그램을 구현하시오.
import java.util.*;
public class ArrayEx02re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0 ; i < arr.length; i++) {
			System.out.print("정수를 입력해주세요");
			arr[i] = sc.nextInt();
		}
			System.out.println("배열 값");
			for(int i= 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
	}
}
