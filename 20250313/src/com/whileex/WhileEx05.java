package com.whileex;
/*
 * 2의 승수를 입력받아 승수를 구하는 값을 구하는 프로그램을 작성하시오.
 *  결과
 *  10
 *  *  
 *  2의 10승은 1024 입니다.
 * 
 * 
 * 
 */
import java.util.*;
public class WhileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i =1 , multi = 1;
		n = sc.nextInt();
/*		while(i <= n) {
			multi *= 2;
			i ++;
		}*/
			do {
		  		multi *= 2;
		  		i ++;
		  }while(i <=n);
		System.out.println("2의 " + n + "승은" + multi + "입니다");
	}
}
