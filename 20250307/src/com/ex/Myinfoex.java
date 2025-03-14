package com.ex;

public class Myinfoex {

	public static void main(String[] args) {
		Myinfo a = new Myinfo();
		Myinfo b = new Myinfo();
		Myinfo c = new Myinfo();
		
		a.name = "가길동";
		b.name = "나길동";
		c.name = "다길동";
		
		
		
		System.out.println("이름 : " + a.name);
	}

}

/*
 		int a = 정수만 담아야 함 4 byte
 		double b = 실수만 담아야함  8byte
 		float  은 4byte
      변하지 않는 변수 : 리터널
      변할수 있는 수 : 변수 어떤 값을 저장하기 위한 메모리 공간
      정수로 변환(int) 붙이기  -> 정수 대입
      실수형 변수 에 정수를 대입할 때의 처리 방식
      
       연산자 
       대입 연산자  (=) 의 오른쪽에는 (숫자), 변수 , 계산 값이 모두 올 수 있음
        
 */