package com.classexam;
import java.util.*;
public class DicApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.println("단어를 입력해주세요");
			String kor = sc.next();
			if(kor.equals("그만")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			Dictionary di = new Dictionary();
			String eng = di.kor2eng(kor);
			if(eng == null) {
				System.out.println(kor + "  사전에 없는 단어 입니다");
			}
			else
				System.out.println(kor + " 는 영어로 " + eng + " 입니다");			
		}
	}

}
