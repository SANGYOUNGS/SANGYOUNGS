package com.mathodex;

/*		생성자  
 * 			- 메모리 내에 객체가 생성될때 호출되어 객체의 구조를 인식하게 하고 
 * 			 생성되는 멤버 필드들을 초기화하는데 목적을 두고 있다.
 * 			- 생성자 명은 클래스명과 같아야하고 return type을  정의하지 말아야한다.
 * 			- 프로그래머가 어떠한 생성자도 정의 하지 않았을 경우
 * 				컴파일러가 기본 생성자으로 자동으로 만들어준다.
 * 				기본생성자 : 인자가 없는 생성자
 * 			
 * 			- 생성자 접근제한의 의미
 * 			1. 생성자의 접근제한을 둘 경우 해당 객체를 생성 할 수 있는 접근 권한 가짐
 * 			2. 접근제한이 public 으로 정의되어 있어도 생성자를 private로 정의하면
 * 				클래스 내부에서만 접근이 가능하다.
 *			3. 만약 protected로 정의되는 클래스는 상속관계의 객체들만 생성할 수 있음 
 * 
 * 
 * 			-생성자의 구성
 * 			[접근제한자] [생성자명](자료형 인자1, 자료형 인자2, .....){
 * 				수행문 1
 * 				수행문 2
 * 			}
 * 		- 생성자의 특징
 * 			하나의 클래스에는 인자의 수가 다르거나 인자의 자료형이 다른 생성자들이 
 * 				여러개 존재 할수있다(생성자 오버로딩)
 * 
 * 
 * 		생성자의 첫번 째 라인에서 this(인자) this(인자) 생성자를 사용해서 다른 생성자를 
 * 		호출할 수 있다.
 * 
 */

class MyClass {
	
	private String name;
	private int age;
	// 클래스변수는 자동으로 초기화가 된다.
	// 
	
	
	public MyClass() { //생성자 함수 : 리턴타입이 없음, 클래스 이름과 같다.
		name = "가길동";
	}
	public MyClass(String n){
		name = n;
	}
	
	public MyClass(String n,int a){
		age = a;
		name = n;
	}
	public MyClass(int n,String a){
		age = n;
		name = a;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

  	
	
	
}

public class MyClassEx {// 실행 클래스

	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass("아루치");
		MyClass mc3 = new MyClass("아루치",46);
		MyClass mc4 = new MyClass(23, "오자바");
				
		System.out.println(mc1.getName() + ", "+mc1.getAge());
		System.out.println(mc2.getName() + ", "+mc2.getAge());
		System.out.println(mc3.getName() + ", "+mc3.getAge());
		System.out.println(mc4.getName() + ", "+mc4.getAge());
	}

}
