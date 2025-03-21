package com.example;
/*
 * 		세명의 각 과목별 점수를 입력받아 총점, 평균 , 석차
 * 		를 구하는 프로그램을 구현
 * 
 * 
 */
import java.util.*; 
public class Ex06 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String[] subname = {"국어", "영어", "수학"};
	        // 0: 국어, 1: 영어, 2: 수학, 3: 합계, 4: 석차
	        int[][] sub = new int[3][subname.length + 2]; // 3명의 학생, 각각 5개의 데이터 (국어, 영어, 수학, 합계, 석차)
	        float[] avg = new float[3]; // 평균을 저장할 배열

	        // 입력 받기
	        for (int k = 0; k < sub.length; k++) { // 학생 수만큼 반복 (0, 1, 2)
	            for (int i = 0; i < subname.length; i++) { // 과목 수만큼 반복 (0, 1, 2)
	                do {
	                    System.out.print((k + 1) + "번 학생의 " + subname[i] + " 점수 : ");
	                    sub[k][i] = sc.nextInt(); // k번 학생의 i번 과목 점수 입력
	                } while (sub[k][i] < 0 || sub[k][i] > 100); // 점수는 0~100 사이만 허용
	                sub[k][subname.length] += sub[k][i]; // 합계 계산 (subname.length는 3, 합계는 3번 인덱스)
	            }
	            avg[k] = sub[k][subname.length] / (float) subname.length; // 평균 계산
	            sub[k][subname.length + 1] = 1; // 초기 석차는 1로 설정 (석차는 4번 인덱스)
	        }

	        // 석차 계산
	        for (int k = 0; k < sub.length; k++) {
	            for (int j = 0; j < sub.length; j++) {
	                if (sub[k][subname.length] < sub[j][subname.length]) { // 합계 비교
	                    sub[k][subname.length + 1]++; // k번 학생의 석차 증가
	                }
	            }
	        }

	        // 결과 출력
	        for (int k = 0; k < sub.length; k++) {
	            System.out.println();
	            System.out.println((k + 1) + "번 학생의 합계 : " + sub[k][subname.length]);
	            System.out.printf((k + 1) + "번 학생의 평균 : %.2f\n", avg[k]);
	            System.out.println((k + 1) + "번 학생의 석차 : " + sub[k][subname.length + 1]);
	        }
	    }
	}
