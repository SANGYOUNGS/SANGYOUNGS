package com.exam;

import java.util.*;

public class MathMaxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//^ 
		int a, b, c ;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if ( a < b) {
			int temp= a; 
			a = b;
			b = temp;		
//			a < b 비교 → 10 < 20 → a와 b를 교환 → a = 20, b = 10
		}
		if (a < c) {
			int temp = a;
			a = c;
			c = temp;
//			a < c 비교 → 20 < 15 → 거짓 → 교환 없음
		}
		if (b < c) {
			int temp = b;
			b = c;
			c = temp;
//			b < c 비교 → 10 < 15 → b와 c를 교환 → b = 15, c = 10
		}
		
		
		
		
		
		/* if(secondsu >= firstsu && secondsu >= thirdsu ) {
		 * 		imsi = first;
		 * 		first = seconds;
		 * 		sconds = imsi; 
		 * } else (thirdsu >= firstsu) {
		 * 		imsi = firstu;
		 * 		firstu = thirdsu;
		 * 		thirdsu = imsu
		 * } else if (thirdsu >= secondsu) {
		 * 		imsi =secondsu;
		 * 		secondsu = thirdsu
		 * 		thirdsi = imsi;
		 * }
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println(a + ">" + b + ">" + c); 
	}
}
//	최종값: a = 20, b = 15, c = 10