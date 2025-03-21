package com.array;
/*
 * 3과목별 점수 를 입력받고 
		그거에 대한 총점과 평균을 구하시오.
 * 
 * 
 * 
 */
import java.util.*;
public class ArrayExam01re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		int sum = 0;
		float avg = 0.0f;
		for(int i = 0; i < score.length; i++) {
			score[i] += sc.nextInt();
			sum += score[i];
		}
		avg = sum/(float)score.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
