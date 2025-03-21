package com.whileex;

/*
 *  문 ] 
 *  	사용자로 부터 하나의 수를 입력받아 그 수만큼 3의 배수를 출력하시오;
 * 정수입력
 * 3 6 9 15
 * 
 * 
 * 
 */


import java.util.*;
public class WhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i =1; 
		int a = sc.nextInt();
		/*
		 * while(i <= a) { System.out.print( i * 3+"\t"); i++; }
		 */
		 do{
		  		System.out.print(i * 3 + "\t");
		  		i++;
		   }while(i <= a);
	}
}
