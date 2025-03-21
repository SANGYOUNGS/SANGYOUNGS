package com.example;
/*
 * 		세명의 각 과목별 점수를 입력받아 총점, 평균 , 석차
 * 		를 구하는 프로그램을 구현
 * 
 * 
 */
import java.util.*;
public class Ex06re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[]arr = {"국어","영어","수학"};
		int[][] sub = new int[3][arr.length+2];
		float[] avg = new float[3];
		for(int i =0; i < sub.length; i++) { // 사람 반복
			for(int j =0; j < arr.length; j++) { // 과목 반복
				do {
					System.out.print((i + 1) + "번 학생의" + arr[j] +"점수입력" );
					sub[i][j] = sc.nextInt();
				} while(sub[i][j] > 100 || sub[i][j] < 0);
				sub[i][arr.length] += sub[i][j];
				sub[i][arr.length + 1] = 1; // 초기 석차는 1로 설정 (석차는 4번 인덱스)
			}
			avg[i] = sub[i][arr.length] /	(float)(arr.length);
		}
		for(int i =0; i < sub.length; i++) {
			for(int j=0; j <sub.length; j++) {
				if(sub[i][arr.length] < sub[j][arr.length]) {
					sub[i][arr.length+1]++;
				}
			}
		}
		for(int i = 0; i < sub.length; i++) {
			System.out.println(i +"번학생의 총점 :" + sub[i][arr.length]);
			System.out.printf("%d + 번학생의 평균%.2f%n :" ,i , avg[i]);
			System.out.println(i +"번학생의 석차 :" + sub[i][arr.length+1]);
		}
}
}