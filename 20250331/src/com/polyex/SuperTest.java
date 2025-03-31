package com.polyex;



// 자식 클래스 (부모 클래스를 상속 받음)
public class SuperTest {
	// 멤버 필드
	int a = 10 , b = 20;
	// 메소드
	void write() {
		System.out.println("부모 클래스 write() 메소드 ....");
	}
	int hap() {
		return a + b;
	}
}	
