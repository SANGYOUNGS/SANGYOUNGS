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
public class forEx005re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int sum = 1;
		a = sc.nextInt();
		for(int i=1; i <= a; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
