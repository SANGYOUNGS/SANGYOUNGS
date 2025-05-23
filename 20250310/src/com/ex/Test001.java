package com.ex;

// 변수와 자료형
// 원의 넓이와 둘레 구하는 프로그램
/*
 * 	원의 넓이 : 반지름 * 반지름 * 3.14159
 * 원의 둘레 :	반지름 * 2 * 3.141592
 * 
 * 
 * 반지름이 10인 원의 넓이 , 둘레를 구하시오.
 */




public class Test001 {

	public static void main(String[] args) {
	
		
		//  1.변수 선언 및 초기화
			int r = 10;// 반지름을 r에  저장
			double a, b; /// a-> 넓이 , b -> 둘레
			final double p = 3.141592;
			// 변수를 상수화 시킨 = final 을 자료형 앞에 선언함
			
			// 연산 - > 수식 처리;
			// 원의 넓이
			a = r * r * p;
			
			//원의 둘레
			b = r * 2 * p;
			
			//연산 결과 출력
			System.out.println("반지름이 " + r + "인 원의 넓이 : " + a);
			System.out.println("반지름이 " + r + "인 원의 둘레 : " + b);
			System.out.println();
		
			//서식을 이용한 출력
			System.out.printf("반지름이 %d인 원의 넓이 : %.2f%n",r , a);
			System.out.printf("반지름이 %d인 원의 둘레 : %.2f",r , b);
	}

}
