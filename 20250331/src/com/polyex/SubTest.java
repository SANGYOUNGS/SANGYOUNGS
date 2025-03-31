package com.polyex;

public class SubTest extends SuperTest{
	
	int b = 100, c = 200;
	
	@Override
	int hap() {
		return a + b + c;
	}
	
	void print() {
		System.out.println("자식 클래스 print() 메서드");
	}
	
}
