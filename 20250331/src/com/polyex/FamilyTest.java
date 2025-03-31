package com.polyex;

public class FamilyTest {

	public static void main(String[] args) {
		
		// 서브 클래스 인스턴스 생성
		SubTest ob1 = new SubTest();
		System.out.println("ob1.b : " +  ob1.b);
		
		//업 캐스팅 
		SuperTest ob2 = ob1;
		// SuperTes ob2 = (SuperTest)ob1;
		System.out.println("ob2.b : " + ob2.b);
		// ob2.b = 20
		// 변수는 객체 별로 따로 할당 되므로 변수 ob2 의 변수
		System.out.println("합계 : " + ob2.hap());
		// ==== > 합계 : 310
		// hap() 메소드는 오버라이딩이 되어있고
		// ob2 를 ob1을 업캐스팅 한 상태이므로 
		/*
		 *  SuperTest 의 hap() 메소드를 호출헌 것이 아니라
		 *  SubTest 의 hap() 메소드를 호출하게 된다.
		 *  즉 , 메소드는 업 캐스팅이 되도라도 원래의 것으로 나온다.
		 *  
		 *  
		 */
		ob2.write();
		// 부모 클래스의 write() 메소드.... 
		// 호출이 정상적으로 이루어졌음(부모클래스의 메소드)
		
		// ob2.print();
		// 에러 발생
		// 해결책 : 형변환 ( 다운 캐스팅)
		((SubTest)ob2).print();
		// 서브 클래스의 print() 메서드 ;
		// 다운 캐스팅이 안되는 경우
		SuperTest parent = new SuperTest();
		SubTest child;
		
		//System.out.println(parent.c); // 에러 발생
		// 이유 : 부모 객체는 자식 객체의 멤버의 접근이 불가능하다 
		//child = (SubTest)parent; // 에러 발생 // 런타임에러 다.
		// 이유 : 부모 객체는 자식 객체에 넣을 수 없다.
		/* 	다운 캐스팅
		 * 		현재 SubTest 객체가 메모리에 할당되지 않았기 때문에
		 * 			다운 캐스팅이 불가능함
		 * 
		 */
		//System.out.println(child.b);
		
		/* 중요함(*****)
		 * 	- 업 캐스팅 , 다운 캐스팅이 정상적 인 경우
		 *   1. 하위 객체 생성
		 * 	  2. 상위  = 하위; 업 캐스팅 - > 정상
		 * 	  3. 하위  = 상위; 에러 발생	
		 	 4. 하위 = (하위)상위 ; 다운 캐스팅 -> 정상
		 *
		 *		-다운 캐스팅이 안되는 경우
		 *			1.상위 객체 생성
		 *			2. 하위 = 상위; 에러발생
		 *			3. 하위 = (하위)상위; 다운 캐스팅(런타임 에러)
		 *
		 *			업 캐스팅은 항상 가능, 다운 캐스팅 경우에 따라서 가능
		 *
		 */	
	}

}
