package com.ifex;
/*
 * 		if(조건식 {
 * 			조건이 참일때	
 * 		} else {
 * 			조건이 거짓일때
 * 		}
 * 
 * 
 * 
 * 
 */







import java.util.*;





public class ifEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int input;
		System.out.print("숫자 입력: ");
		input = sc.nextInt();
		
		if(input == 0 ) {// 0이 입력되었을 경우
			System.out.println("입력하는 숫자는 0입니다.");
		} else  { // 0이 아닌 경우
			System.out.println("입력하는 숫자는 0이 아닙니다.");
			System.out.printf("입력하는 숫자는 %d 입니다.", input);
		}
	}
}
