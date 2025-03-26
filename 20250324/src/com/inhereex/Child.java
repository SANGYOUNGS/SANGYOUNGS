package com.inhereex;

	/* 		
	 *  상속관계에서의 클래스의 용어 
	 *  
	 * 		상속 관계의 키워드 : extends(확장)
	 * 	 	
	 * 		조상 클래스 : 부모클래스(Parent) , 상위 클래스(Super) , 기반클래스(Base) 
	 * 						상속해 주는 클래스
	 * 
	 * 		자손 클래스 : 자식클래스(Child) , 하위 클래스(Sub) , 파생된 클래스(Derived)
	 * 		 				상속을 받는 클래스
	 * 
	 */


public class Child extends Parent {
	// 생성자 와 초기화 블럭은 상속되지 않는다.
	// 자식 클래스에서 멤버 개수는 조상클래스 보다 항상 같거나 많다.
	
	// 메소드 정의
	void play() {
		System.out.println("달마야 놀자 !!!");
	}
	
}
