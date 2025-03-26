package com.inhereex;

public class MP3PhoneMain {

	public static void main(String[] args) {
		
		MP3Phone mp = new MP3Phone("Apple","010-1234-5678",70,256);
		System.out.println("제조사: "+ mp.getModel());
		System.out.println("전전 : " + mp.getNumber());
		System.out.println("화음 : "+mp.getChord());
		System.out.println("저장 용량 : " + mp.size);
	}
}
