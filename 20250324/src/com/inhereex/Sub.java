package com.inhereex;
/*
 * 	상속에서의 생성자 : super(); -> 부모생성자
 * 
 * 			자식의 기본 생성자에서 super()가 생략되어 있음
 * 			객체 생성시 무조건 부모 클래스의 생성자를 먼저 생성해야함
 * 			즉 , 부모의 생성자를 무조건 먼저 호출함
 * 			부모의 생성자를 호출할 때는 super();
 */
public class Sub extends Super{
		public Sub() {
			super(5);
			System.out.print("자식클래스의 생성자");
		}
}
