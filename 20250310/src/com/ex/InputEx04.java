package com.ex;
/*
 *  숫자 1 자리 이상 (숫자열 : 두자리 이상) 
 * 
 * 	String im = br.readLine();  <- 123 입력
 * 						"123"
 * 						Integer.parseInt(im);
 * 			int i =	Integer.parseInt(br.readLine()); 123 <- "123"
 * 
 * 문 ] 국어 , 영어 , 수학 점수를 입력 받아, 총점과 평균을 출력하는 프로그램을 구현하시오 
 * 			단 평균은 소수점 이하 2자리까지
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputEx04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int kor , eg , ma, total = 0;
		double total1 = 0;
		System.out.print("국어 점수 :"); // 입력 안내 메세지 출력
		kor = sc.nextInt();
		System.out.print("영어 점수 :");
		eg =sc.nextInt();
		System.out.print("수학 점수 :"); 
		ma =sc.nextInt();
		total = kor + eg + ma; 
		total1 = total / 3.0;
		System.out.println("총점: " + total);
		System.out.printf("평균 : %.2f" , total1);
		
	}

}
