package com.ifex;
/*
 * 	if - else if 문
 * 한 문장에 여러개의 조건식을 쓸 수 있는 else if문 사용
 * if(조건식 1){
 * 		조건식 1의 연산 결과가 참일 경우 수행하는 문장
 * } else if(조건식 2){
 * 		조건식 2의 연산 결과가 참일 때 수행하는 문장 	
 * }else if(조건식 3){
 * 		조건식 3의 연산 결과가 참일 때 수행하는 문장 
 * } else { 마지막에는 else로  끝나며 , else 블럭은 생략이 가능하다
 * 		위의 어느 조건식도 만족하지 않을 때 수행될 문장을 적음
 * }
 *기호를 영어로 p
 * 
 */

import java.util.*;


public class IfEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int jumsu;
		// 학점을 저장하기 위한 변수를 선언 -> 초기화(문자)
		char hak =' ', p=' ' ;
		

		System.out.print("점수를 입력해주세요");
		//점수를 입력해 달라고 하는 안내 메시지 출력
		jumsu = sc.nextInt();
		
		if(jumsu >= 90) {
			hak ='A';
			if(jumsu >= 95 ) {
				p ='+';
			}else if(jumsu < 95){
				p ='-';
			}
		}else if(jumsu >= 80) {
			hak ='B';
			if(jumsu >= 85 ) {
				p ='+';
			}else if(jumsu < 85){
				p ='-';
			}
		}else if(jumsu >= 70 ) {
			hak ='C';
			if(jumsu >= 75 ) {
				p ='+';
			}else if(jumsu < 75){
				p ='-';
			}
		}else if(jumsu >= 60) {
			hak ='D';
			if(jumsu >= 65 ) {
				p ='+';
			}else if(jumsu < 65){
				p ='-';
			}
		}else { //위의 조건이 아니면 무조건 처리함
			hak ='F';
		}
		System.out.printf("당신의 학점은 %c%c 입니다." , hak, p);
		}
}

