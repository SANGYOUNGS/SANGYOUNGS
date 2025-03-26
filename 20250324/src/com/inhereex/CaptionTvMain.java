package com.inhereex;

public class CaptionTvMain {

	public static void main(String[] args){
		CaptionTv ctv = new CaptionTv(); // 객체 생성
		ctv.channel = 10; // 조상 클래스부터 상속받은 멤버 필드
		ctv.channelUp(); // 조상클래스부터 상속받은 멤버 메소드
		
		System.out.println(ctv.channel);
		ctv.displaycaption("여러분 사랑합니다. ^^");
		ctv.caption= true;
		ctv.displaycaption("여러분 사랑합니다. ^^");
	}

}
