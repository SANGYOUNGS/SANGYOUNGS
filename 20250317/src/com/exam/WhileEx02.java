package com.exam;
import java.io.*;
public class WhileEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int subject = 0;
		while(true) {
			System.out.print("점수 : ");
			subject = Integer.parseInt(br.readLine());
			
			if(subject < 0 || subject > 100) {
				System.out.println("점수는 0에서 부터 100 점 사이를 벗어날 수 없습니다.");
			} else {
				break;
			}
		}
	}

}
