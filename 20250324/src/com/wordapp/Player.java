package com.wordapp;

import java.util.*;
// 참가자를 의미하는 클래스
public class Player {
	private Scanner sc;
	private String name;
	private String word; 

	public Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
		
	}

	public String getName() {
		return name;
	}
	
	public String getWordFromUser() {
		System.out.println(name + " : ");
		word = sc.next();
		return word;
	}
	// 마지막 단어와 참가자가 입력한 단어를 비교 하여 끝말잇기가 맞았는지 판단하는 \
	// 맞았으면 true 를 반환 , 아니면 false 를 반환

	public boolean checkSucces(String lastWord) {
		// 단어 마지막 문자를 추출
		int lastIndex = lastWord.length()-1;
		// 마지막 단어의  맨 마지막 문자와 다음 참가자가 입력한 단어의 첫 문자가 같은지 비교해야함
		if(lastWord.charAt(lastIndex) == word.charAt(0)){
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
}
