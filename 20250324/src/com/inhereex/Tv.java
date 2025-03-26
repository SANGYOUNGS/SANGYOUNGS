package com.inhereex;

public class Tv {
	
	boolean power; // 전원 상태
	int channel;
	
	//메소드 , 기능, 행위
	void power() {
		power = !power;
		/*
		 * if (power) { power = false; }else power = true;
		 */
	}
	void channelUp() {
		channel ++;
	}	
	void channelDown() {
		channel --;
	}	
}
