package com.exam;
/* 
 * 문 ]
 *  		점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
 * 			단, 4학년인 경우 70점 이상이여야 합격
 * 
 * 			if 문을 이용해서 구현하시오.
 * 
 * 			결과
 * 			점수 입력 (0~ 100): 65
 * 			학년 입력 (1 ~4): 4
 */
import java.util.*;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		int student;
		System.out.println("숫자를 입력해주세요");
		score = sc.nextInt();
		System.out.println("학년을 입력해주세요");
		student = sc.nextInt();
		if(score > 60) {
			if(student != 4) {
				System.out.println("합격입니다.");
			} else if(score >= 70) {
				System.out.print("합격입니다.");
			} else {
				System.out.print("불합격입니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}
		
					
}
}
