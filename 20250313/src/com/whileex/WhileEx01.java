package com.whileex;
/* 사용자로 부터 숫자 하나를 입력받아서 그 수만큼 "사랑해요 여러분 !!"을  출력하시오.
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int i = 1;
		a = sc.nextInt();
/*		while(i <= a) {
			System.out.println("사랑해요 여러분!");
			i++;
		}*/
	 do {
			System.out.println("사랑해요 여러분!");
			i++;
		} while(i < a);
		
	}	

}
