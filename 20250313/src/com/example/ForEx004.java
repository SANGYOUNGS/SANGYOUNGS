package com.example;

/*	문] 
 * 		두개의 정수를 입력 받아 그 사이에 존재하는 
 * 		정수들의 합계를 구하는 프로그램을 작성하시오
 *  
 * 		ex )  3+ 4 +5 
 * 				12
 * 
 */

import java.util.*;
public class ForEx004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int a ,b ;
		int temp;
		int total = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > b) { // 첫번째 정수가 두번째 정수보다 큰 경우 자리를 바꾼다.
						// 두번째 정수가 if 를 수행하지 않는다.
			temp = a; 
			a = b;
			b = temp;			
			} // 멍청이 temp 에 a 를 넣고  a 에 b를 넣고 b 에 temp를 넣는다 /
		for(int i = a; i <= b; i++) {
			// 첫번째수를 초기값으로 설정하고 두번째 수를 조건식으로
			total += i;
			System.out.print(i);
			if(i <=(b-1)) // 첫번째 수와 두번쨰 보나 하나 작은 수 까지 +
				System.out.print("+");
			else { // 두번째 값인 경우= 출력;
			System.out.print("=");
			System.out.println(total);
		}	
	}
}
}
// 첫번째 수와 두 번째 보다 하나 작은 수까지는 + 출력
// 두번째 값인 경우 = 출력 ;
