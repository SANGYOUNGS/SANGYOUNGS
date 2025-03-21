package com.exam;
import java.io.*;
public class DoWhileEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int subject = 0;
		do {
		System.out.print("점수 : ");
		subject = Integer.parseInt(br.readLine());
		} while(subject < 0 || subject > 100);
	
	}
}
