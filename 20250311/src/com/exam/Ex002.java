package com.exam;

import java.util.*;
public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c ;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println(max);
	}

}
