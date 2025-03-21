package com.array;


import java.util.*;
public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] subname = {"국어", 	"영어", "수학"}; // 과목 배열선언
//										0 			1		2					
		//System.out.println(subname.length);
		int sub[] = new int[subname.length+1];	// 
		// 						0 : 국어, 1: 영어, 2: 수학 ,3: 총점
		float avg = 0.0f;
		
		for(int i = 0 ; i < sub.length-1; i++) {
			do {
				System.out.print(subname[i]+"점수:");
				sub[i] = sc.nextInt();
			}while(sub[i] < 0 || sub[i] > 100); // 각 과목별 점수 입력 완료
			sub[sub.length - 1 ] += sub[i];	 // 합계
		} // 합계까지 구함
			avg = sub[sub .length -1 ] / (float)sub.length-1;
			System.out.println("총점 :" +sub[sub.length-1]);
			System.out.printf("평균 : %.2f", avg);		
	}
}
