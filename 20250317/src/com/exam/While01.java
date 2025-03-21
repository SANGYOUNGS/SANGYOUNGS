package com.exam;

import java.io.*;

public class While01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("여러분 사랑합니다. ^^");
			System.out.print("계속 진행 하시겠습니까? (y/n)?");
			char ch = (char)System.in.read();
			System.in.skip(2);
			//System.in.read();
			//System.in.read();
			if(ch =='n' || ch =='N') {
			System.out.println("프로그램을 종료합니다.");
			break;
			}
		}
	
		
	}

}
