package com.mathodex;

/* 메소드
 * 		- 특정 작업을 수행하는 일련의 문장들 하나로 묶은 것임
 * 		
 * 메소드 사용하는 이유 (*****) 
 * 		- 1. 높은 재사용성 -> 한번 만들어 놓은 메소드는 몇번이고 호출하여 사용할 수 있다.
 * 		  2. 중복된 코드의 제거		
 * 				- 같은 내용의 문장들이 여러곳에서 반복해서 만들어진다.
 * 				- 반복되는 문장들 대신 메소드를 호출하는 만들어서 대체 할 수 있다.
 * 		 3. 프로그램의 구조화
 * 			- 큰 프로그램에서는 문장들을 작업단위로 나눠서 여러개의 메소드로 저장해서 구조화 시켜
 * 				단순화 시켜서 사용함
 * 		
 * 		메소드의 선언 과 구현 	
 * 			메소드는 크게 두부분으로 나뉨 (선언부와 구현부)
 * 
 * 	선언부	- public(접근제한자) 반환타입 메소드 이름(타입(자료형)변수명 , )
 * 	구현부		{ 
 * 					메소드 호출시 수행되는 코드
 * 				}			
 * 
 * 			public int add(int a, int b) // 매개변수
 * 			{
 * 				return a + b;	//결과 반환
 * 			}
 * 
 * 			public void add(int a, int b) // 매개변수
 * 			{
 * 				System.out.println(a + b);	//결과 반환
 * 			}
 * 		int n  = add(3,4) => 메소드 호출
 * 					add(3,4) 
 * 
 */


public class MethodEx {
	
	private static Object subtract;



	//메소드의 정의 (선언부와 전언부)
	public int add(int a, int b) {
		int result = 0;
		result = a+ b;
		return result;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public void subtract(int a, int b, int c, int d) {
		//return a - b;
		System.out.println(a-b-c-d);
	}
	public int subtract(int a, int b, int c) {
		return a - b -c;
	}
	public float subtract(float a, float b) {
		return a - b;
	}
	
	
	
	public static void main(String[] args) {
		// 만들어진 메소드를 사용하는 것을 메소드 호출
		MethodEx m = new MethodEx();
		int a = m.add(3, 4); // 메소드 호출
		int b = m.subtract(5,4); // 메소드 호출
		System.out.println("더한 결과 : " +a);
		System.out.println("뺀 결과 : " + b); 
	}
}
