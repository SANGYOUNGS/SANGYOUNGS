package com.forEx;

/*
 *   i -> 1 ~ 10 증가되면서 출력 , j -> 10  ~ 1 감소하면서 출력
 * 		
 * 
 * 
 * 
 */


public class forEx03 {

	public static void main(String[] args) {
		for(int i=1 ,j=10; i<=10; i++, j--) {
			System.out.printf("%d\t %d%n", i, j);
		}
	System.out.println();
	for(int i=1; i<=10; i++) {
		System.out.printf("%d\t %d%n",i , 11-i);
	}
	}

}
