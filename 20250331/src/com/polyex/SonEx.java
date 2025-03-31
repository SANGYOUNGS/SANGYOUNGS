package com.polyex;
/* 다형성
 * 	1. 한 타입을 참조변수로 여러 타입의 객체를 참조할 수 있도록 하는 것
 * 2. 한 부모 클래스 타입의 참조클래스로 자식 클래스의 인스턴스 참조할 수 있도록 하는 것
 * 3. 부모 클래스 = 자식 
 * 
 * 			객체를 생성
 * 				기존 방식
 * 					ParentEx p = new ParentEx();
 * 					SonEx s = new SonEx();
 * 				
 * 		다향성에서의 객체 생성
 * 			ParentEx s1 = new SonEx;
 * 			ParentEx s2 = new SonEx;
 * 			ParentEx s3 = new SonEx;
 * 
 * 		***** : 다향성에서 메소드는 자식, 멤버 변수는 부모것을 사용함
 * 
 * 
 */
public class SonEx extends ParentEx{
	
		int foo = 7;
		
		@Override
		public int getNumber(int a) {
		// TODO Auto-generated method stub
		return a + 2 ;
		}
		
	
	public static void main(String[] args) {
		// 다양성의 객체 생성
			ParentEx pe = new SonEx();
			System.out.println(pe.getNumber(0)); // 자식
			System.out.println(pe.foo); // 부모거
	}
}
