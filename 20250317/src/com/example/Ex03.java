package com.example;
/* 문 ]
 * 		양의 정수 10개를 입력받아 배열의 저장하고,
 * 		배열에 저장된 정수 중에서 3의 배수만 출력하는 프로그램을 
 * 		구현하시오.
 * 
 * 
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[]arr = new int[10];
		for(int i =0; i < arr.length; i++) {
			System.out.printf("%d 번째 정수 입력 : " , i+1);
				 arr[i] = sc.nextInt();
			}
		for(int i=0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] +" ");
			}
		}
		}
	
	}
// arr[0] 이면 1 [1] 이면 5 [2] 이면 9 9이걸
// 반복은 arr[0] <- 의 값을 반복해서 배열 10까지 반복;
// if는 조건문에는 arr[i] 의 반복값 [1] = 1  , [2] = 5 ,[3] = 99 
// 이렇게 들어가서 3이 나눠서 0 이 되었을경우 arr[i] 값을 출력한다. 