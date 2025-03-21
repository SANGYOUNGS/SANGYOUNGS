package com.objectEx;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Tv t; // Tv인스턴스를 참조하기위한 변수 선언 
			t = new Tv(); // Tv인스턴스를 생성
			Tv t2 = new Tv();
			System.out.println("t의 channel 값은 " + t.channel + " 입니다.");
			System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
			
			t2 = t; // t 가 저장하고 있는 값(주소값 )을 t2에 저장한다.
			
			t.channel = 7; // Tv 인서턴스의 멤버변수 channel의 값을 초기화
			
			System.out.println("t의 channel값은 7로 변경되었습니다.");
			t.channelDown(); //Tv 인스턴스의 멤버 메소드 호출
			System.out.println("t 현재 채널은" + t.channel + "입니다");
			System.out.println("t2 현재 채널은" + t2.channel + " 입니다.");
			
	}
}
