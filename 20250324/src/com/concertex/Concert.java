package com.concertex;

import java.util.*;

public class Concert {

	private String hallName;
	private Group[] group = new Group[3];
	private Scanner sc;

	public Concert(String hallName) {
		this.hallName = hallName;
		group[0] = new Group('S', 10);
		group[1] = new Group('B', 10);
		group[2] = new Group('C', 10);
		sc = new Scanner(System.in);
	}

	// 콘서트 예약
	public void reserve() {
		System.out.print("좌석 구분 S(1), A(2), B(3)");
		int type = sc.nextInt();
		if (type < 1 || type > 3) {
			System.out.println("잘못된 좌석 타입입니다.");
			return;
		}
		// 예약 성공
		group[type - 1].reserve();
	}

	public void search() {
		for(int i = 0; i < group.length; i++)
			group[i].show();
		System.out.print("===> 조회를 완료 하였습니다. <===");
	}

	public void cancel() { // 예약 취소
		
		System.out.print("좌석 구분 S(1), A(2), B(3)");
		int type = sc.nextInt();
		if (type < 1 || type > 3) {
			System.out.println("잘못된 좌석 타입입니다.");
			return;
		}
		// 예약 성공
		group[type - 1].cancel();
		
	}

	public void finish() {
		System.out.println("글로벌인 콘서트 예약 프로그램을 종료합니다.");
		System.exit(0);
	}

	public void run() {
		System.out.println(hallName + "예약 프로그램 입니다.");
		int menu = 0;
		while (menu != 4) {
			System.out.println("예약 :  1, 조회 : 2, 취소 : 3 , 종료 : 4");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				finish();
				break;
			default:
				System.out.println("잘못 입력 하였습니다.");
				break;
			}

		}
	}
}
