package com.ifex;
import java.util.*;
// 알파벳 
//대문자 65 보다 크거나 같고 90 보다 작거나 같음
//소문자 97 보다 크거나 같고 122 보다 작음

public class ifEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력해주세요");
		char a = sc.next().charAt(0);
		String c="";
		c = ((a >= 65 && a <90) || (a >= 97 && a <122)) ?(a >=65 && a < 90) ?  "대문자입닌다":"소문자입니다":"잘못된 값을 입력하였습니다";
	}
}
		
		
		
		
		
		
		
		//		System.out.println("알파벳을 입력해주세요");
//		char a =sc.next().charAt(0);
//		String c ="";
//							// 1 번                                                                                                                                                      1번     
//		c =(a >= 65 && a <= 90)||(a >= 97 && a <= 122) ? ((a >= 65 && a <= 90) ? "대문자입니다" : "소문자입니다") : "알파벳이 아닙니다";
//		if((a >= 65 && a <= 90)||(a >=97 && a <= 122)){
//			if((a >= 65 && a <= 90)) {
//			System.out.println("대문자 입니다.");
//			}else{
//			System.out.println("소문자 입니다.");	
//			}
//		} else {
//			System.out.println("알파벳 이 아닙니다");
//		}
//			System.out.println(c);
//		
//	}
//		
