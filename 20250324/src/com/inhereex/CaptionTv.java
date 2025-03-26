package com.inhereex;

public class CaptionTv extends Tv{
		
		boolean caption; // 캡션상태(on/ off)
		
		void displaycaption(String text) {
			if(caption) {// 캡션 기능이 on 상태일 때를 의미함
				System.out.println(text);
			}
		}
	}
