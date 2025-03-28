package com.wordapp;

import java.util.*;

public class WordGameApp {
		
	private Scanner sc; 
	private String startWord = "아버지"; // 시작단어
	private Player[] players; //  게임참가자 배열 객체
	
	public WordGameApp() {
		sc = new Scanner(System.in);
		
	}
	// 게임 참가자 수를 입력 받고 객체 배열을 생성하는 메소드
	public void createPlayers() {
		int nPlayes = sc.nextInt();
		players = new Player[nPlayes];
		// 참가자의 이름과 객체를 생성한다.
		for(int i = 0; i < players.length; i++) {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			players[i] = new Player(name);
		}
	}
	
	// 게임을 실행하는 메소드
	public void run() {
		System.out.println("게임 시작 .......");
		createPlayers();
		String lastWord = startWord;
		System.out.println("시작 하는 단어 는 "+ lastWord + "입니다.");
		
		int num = 0; 
		while(true) {
			// 다음 참가자가 입력한 단어를 가져오는거 
			String newWord = players[num].getWordFromUser();
			
			if(!players[num].checkSucces(lastWord)) {
				// 참가자 성공하지 못했을 경우
				System.out.print(players[num].getName() + "이 게임에서 졌습니다.");
				break; // 게임 오버;
			}
			num++; // 다음 타자 
			//  num 게임하고 있는 사람 보다 많을 경우을 대비해야한다.
			 num %= players.length;
			 lastWord = newWord;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new WordGameApp().run();

	}
}
