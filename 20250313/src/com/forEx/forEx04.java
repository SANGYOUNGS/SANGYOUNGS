package com.forEx;
/*
 *  변수 : i
 *  1~ 10 까지 반복
 *  i  짝수 홀수 제곱		역순 		i%3      i / 3
 * 	1	2    1 	1       10		1 			0														
 * 	2
 * 	3
 * 4
 * 5
 * 
 * 10 20  19  	100   1          1         3     
 */
public class forEx04 {
	public static void main(String[] args) {
		System.out.println("i\t2*i\t2*i-1\ti*i\t11-i\ti%3\t i/3");
		System.out.println("-------------------------------------------");
		for(int i = 1; i <=10; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%n" , i, 2 * i, 2*i-1, i*i, 11-i, i%3, i/3);
		}
	}
}
