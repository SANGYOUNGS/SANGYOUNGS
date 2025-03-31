package com.polyex;

public class CastingTest1 {
	
		public static void main(String[] args) {
			FireEngine fe = new FireEngine();
			fe.water();
			Car car = null;
			//car = fe;
			//Car car = new FireEngine();
			//car.water();
			fe = (FireEngine)car; // 자식 <- 부모
			fe.water();
		}
}
