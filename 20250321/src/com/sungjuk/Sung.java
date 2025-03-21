package com.sungjuk;
/*
 *  	인원 수를 입력받아, 입력받은 인원 수만큼 
 * 		이름 , 각과목별점수 , 총점 , 평균 ,석차를 계산하는 클래스
 * 
 * 		속성 : 인원 수 , 객체 배열(Record 배열)
 * 		기능 : 인원수 , 입력, 데이터 입력기능 ,총점 , 평균 , 석차 계산, 결과 출력
 * 
 */
import java.util.*;

public class Sung {
    Scanner sc = new Scanner(System.in);
    // 속성(변수 선언)
    int inwon; // 인원 수
    Record[] re; // Record 배열 배열 선언

    // 1. 인원수 입력
    public void set() {
        System.out.println("인원수 를 넣어 주세요.");
        do {
            System.out.println("인원수 입력(1~100)");
            inwon = sc.nextInt();
        } while (inwon < 1 || inwon > 100);
        // 객체 배열 선언
        re = new Record[inwon];
    }

    // 2. 데이터 입력
    public void input() {
        String[] title = {"국어점수", "영어점수", "수학점수"};
        // 인원수만큼 데이터를 입력 받는다.
        for (int i = 0; i < inwon; i++) {
            // 인스턴스 생성
            re[i] = new Record();
            System.out.println((i + 1) + "번째 이름 입력 :");
            re[i].name = sc.next();

            // 총점 초기화
            re[i].tot = 0;

            for (int j = 0; j < title.length; j++) {
                // 안내 메시지 출력
                System.out.println(title[j]);
                // 입력받은 데이터를 score 배열에 저장합니다.
                re[i].score[j] = sc.nextInt();
                // 총점 누적
                re[i].tot += re[i].score[j]; // 수정: score[j] 사용
            }
            re[i].avg = re[i].tot / 3.0;
        }
    }

    // 3. 석차 계산    
		// 석차계산 
		public void ranking() {
		    // 모든 학생의 석차를 1로 초기화
		    for (int i = 0; i < inwon; i++)
		        re[i].rank = 1;
		    
		    
		    // 모든 학생 쌍을 비교하여 석차 조정
		    for (int i = 0; i < inwon-1; i++) {
		        for (int j = 0; j < inwon; j++) {
		            if (re[j].avg > re[i].avg) {
		                re[j].rank++;
		            } else if(re[i].avg < re[j].avg)
		            	re[i].rank++;
		        }
		    }
		}

    // 4. 결과 출력
    public void display() {
    	ranking();
        System.out.println();
        // 학생 별로 반복해서 출력
        for (int i = 0; i < inwon; i++) {
            // 이름 출력
            System.out.printf("%s", re[i].name);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", re[i].score[j]);
            }
            // 총점, 평균, 석차 출력
            System.out.printf("%7d", re[i].tot);
            System.out.printf("%10.2f", re[i].avg);
            System.out.printf("%5d", re[i].rank);
            System.out.println();
        }
        System.out.println();
    }
}