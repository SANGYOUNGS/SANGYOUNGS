package com.switchex;
// 점수를 입력받아 학점을 판정하는 프로그램
// 국어 영어 수학 사회 과학의 각 과목의 점수를 입력받아
/*
 *  국어 영어 수학 사회 과학의 각 과목의 점수를 입력 받아
 *  총점, 평군을 계산하고 ,
 *  평균 을 활용하여 학점을 판정하는 프로그램을 구현하시오.
 * 
 */

import java.util.*;
public class SwitchEx05 {

	public static void main(String[] args) {
		char grade = ' ';
		int gk , en, ma, sa , si ;
		int total;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수입력");
		gk = sc.nextInt();
		
		System.out.print("영어점수입력");
		en = sc.nextInt();
		
		System.out.print("수학점수입력");
		ma = sc.nextInt();
		
		System.out.print("사회점수입력");
		sa = sc.nextInt();
		
		System.out.print("과학점수입력");
		si = sc.nextInt();
		
		total = gk + en +ma + sa + si;
		
		avg = total / 5.0 ;	
		
		System.out.println("총점은" + total +"입니다.");
		System.out.printf("평균은 %.2f%n입니다." , avg);
		switch((int)avg / 10) {
		case 10 : 
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			break; //return 을 치면  {} 빠져나와서 안되는 
		}
		System.out.println("당신의 학점은 " + grade +  "입니다.");
	}
}
