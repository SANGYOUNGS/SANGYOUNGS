package com.polyex;

public class Castingtest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		//fe = (FireEngine)car; // 컴파일  ok ,실행시 에러 발생
		//fe.derive();
		//car = fe;
		//car2.drive();
	}
}
