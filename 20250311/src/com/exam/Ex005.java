package com.exam;
/*
 *  문 ]
 * 			임의의 정수 두수를 입력받아 큰수를 알아 맞히는 프록램을 구현
 * 				
 * 
 */
import java.io.*;

public class Ex005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fir, sec;
		int max;
		System.out.print("첫번 째 수 ");
		fir = Integer.parseInt(br.readLine());
		System.out.println("두번 째 수");
		sec = Integer.parseInt(br.readLine());
		max =Math.max(fir, sec);
		System.out.println("큰수는" + max + "입니다.");
	/* 	// if( fir > sec) {
					System.out.println("첫번째 수 ("+firstsu+") 가 두번 쨰 수 )	
		
		
		
		
	*/	
	}
	}

}
