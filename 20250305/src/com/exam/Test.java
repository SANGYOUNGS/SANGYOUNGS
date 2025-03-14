package com.exam;

/*자바 클래스 파일 기본구조 
	class 이름과 파일 이름과 동일하게 가야됨
	; (세미클론), {}(블레이스, 중괄호)  입력시  세미클론은 문장의 끝을 의미하고 
	블레이스는 여러개의 문장을 그룹으로 묶어 놓은 것을 의미함
	public  
		- 함수 (기능)에 대한 접근이 어떤 패키지든 클래스든 가능하다는 것을 의미함
		main 함수에 붙은 이유
		어떤 인터프리터도 접근 할 수 있게 하기 위함이다.
		인터프리터 --> 고급언어를 한줄씩 기계어로 변환해주는 해석기
		.class 
		import 패키지명.* 은 모두  ;
		마무리는 Retrun ; return 밑에는 적지 않음
	static 
		- 객체들과 값을 공유하게 하는 예약어임
	void
	 	- 함수의 리턴값(돌려줄 값)이 없다.
	 	
	main(String[] args) 
		파라미터 (구멍) -> 
		-파라미터가 변수이면 -->매개 변수
		-파라미터가 값이면 --> 인자값이라고 함
		
*/
public class Test {
	public static void main(String[] args) {
			System.out.println(args[0]);
	}
}

/* crtl + shift + / = 주석  처리;  해제는 crtl + shift +  \  */
// <-한줄 주석 
// sysout <- crtl + shift 
