package com.abstractex;
/*
 *  	추상 클래스의 상속관계
 * 			- 추상 클래스들간의 상속이 가능하다.
 * 				일반 클래스들간의 상속과 유사하지만 , 추상클래스간의 상속에서는
 * 				상속받은 추상 메소드 들을 꼭 재정의 할 필요는 없다.
 * 				그냥 상속해 두었다가 언제가 일반 클래스와 상속관계 이루어지면
 * 				그때 재정의하지 않았던 추상메소들을 모드 일반 클래스에서 재정의
 				해도 되기 때문임
 */	


public abstract class AbsEx01 {
	
	int a = 100; // 변수
	final String str = "abstact test"; //상수
	
	public String getStr() { //일반 메소드
		return str;
	}
	abstract public int getA();
	
}
