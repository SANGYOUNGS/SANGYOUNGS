package com.ifex;
/*
 *  	if 문은 가장 기본적인 조건문임 
 * 		구조
 *  		if( 조건 ) { -> 블레이스
 *  	조건이 참일 경우 수행하는 문장이 온다.(true)
 *  	}
 * 		=> 여기는 조건식 결과는 true 또는 false 여야함
 * 
 *  {} => 블레이스는 여러문장을 하나의 단위로 묶을 때 사용한다 .
 */
public class IfEx01 {

	
	public static void main(String[] args) {
		// 변수 선언
		int score = 77;
		// 조건문을 작성한다.
		if(score > 60) { // 60점 이상 이면 범위안에 있는 문장을 수행합니다.
			System.out.println("합격입니다.");
		}
		if(score > 70) {
			System.out.println("A");
		}else {
			System.out.println("B");
			System.out.println("C");
		}
		}
		
	}
