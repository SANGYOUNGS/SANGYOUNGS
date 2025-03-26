package com.classexam;

import java.util.*;
public class PhoneBook {
	
	private Scanner sc; // 스캐너
	private phone[] pArray; // 객체 배열
	

	public PhoneBook() {
		sc = new Scanner(System.in);
		
		
	}
	// 인원수 정보 입력 및 저장
	void read( ) {
		System.out.print("인원수 : ");
		int n = sc.nextInt();
		
		pArray = new phone[n];
		// 입력 받은 저장할 배열 을 선언
		for(int i = 0; i < pArray.length; i++) {
			System.out.println("이름과 전화번호(이름 과 전화번호는 빈칸없이 입력) :");
			String name = sc.next();
			String tel = sc.next();
			pArray[i] = new phone(name,tel);
			
			
		}
		System.out.println("저장되었습니다.");
	}
	
	String search(String name) {
		for(int i = 0; i <pArray.length; i++) {
			//배열에
			if(pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
        return null;  // 검색 실패 시 null 반환
    }
	
	
	void run() {
		// 정보를 읽어온다.
		read();	
		
		while(true) {
			System.out.print("검색할 이름 : ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			String tel = search(name);
			if(tel == null)
				System.out.println(name +"이 없습니다.");
			else
				System.out.println(name + "의 번호는 " + tel +"입니다.");
		}	
	}
	Scanner sc
	public static void main(String[] args) {
		new PhoneBook().run();
	}
}
