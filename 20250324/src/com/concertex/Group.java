package com.concertex;

import java.util.*;

public class Group {
	// S A B 석 을 나타내는 문자 변수
	private char type;
	//  등급좌석 객체배열
	private Seat[] seats;
	// 스캐너
	private Scanner sc;
	
	public Group(char type, int num) {
		this.type = type;
		seats = new Seat[num];
		for(int i = 0; i < seats.length; i++)
			seats[i] = new Seat();
		sc = new Scanner(System.in);
	}
	
	public boolean reserve() { // 현재 등급의 좌석 예약
		int no;
		String name;
		show(); // 호출 
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("번호 : ");
		no = sc.nextInt();
		// 좌석 범위
		if(no  < 1  || no > seats.length) {
			System.out.println("잘못된 좌석입니다.");
			return false;
		}
		// 이미 예약된 좌석 번호 인지 활용
		if(seats[no - 1].isOccupied()) {
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		}
		// 예약 실행 (이름저장)
		seats[no-1].reserve(name);
		return true;
	}
	
	public void search() {
		
	}
	
	
	// 현재 그룹의 좌석의 취소하는 기능
	public boolean cancel() {
		//예약자의 이름을 입력받아 취소를 진행한
		show();
		System.out.print("이름 : ");
		String name = sc.next();
		if(name != null) { // 이름이 존재 한다면
			for(int i = 0; i < seats.length; i++) {
				if(seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("예약자의 이름을 찾을 수 없습니다.");
		}
		//예약된 이름이 존재 하지 않으면 
		return false;	
	}
	
	public void show() {
		System.out.println(type + " - >");
		for(int i = 0; i < seats.length; i++) {
			if(seats[i].isOccupied()) {
				System.out.print(seats[i].getName());
			} else {
				System.out.print("---");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
