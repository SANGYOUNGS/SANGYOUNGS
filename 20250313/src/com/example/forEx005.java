package com.example;
/*
 * 	문] 
 * 		팩토리얼 구하는 프로그램을 작성하시오.
 * 		사용자로 부터 n이라는 수를 입력받아
 * 		n까지의 팩토리얼을 출력하는 프로그램을  작성
 * 
 * 		5! =  1  * 2 * 3  * 4 *5 =120
 * 		
 * 
 * 
 */
import java.util.*;
public class forEx005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		int sum =1; // 0이면 0 값이 반복되서 안되는겁니다.
		n = sc.nextInt();
		for( i =1; i <= n; i++) {
			sum *= i; // 제곱해서 넣어줌 ;;
			sum += i * n;
		}
		System.out.println(sum);
	}

}
