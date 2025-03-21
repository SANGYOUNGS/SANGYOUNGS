package com.array2;

/* 
 *  5명의 학생이 새과목 점수를 더해서 각 학생별  총점과 평균을 계산하고 
 *  , 과목별 총점을 계산하는 프로그램을  구현하시오 .
 * 
 * 
 * 
 */

public class ArrayEx02 {

    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        int korTot = 0, engTot = 0, matTot = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("========================");

         for(int i = 0; i < score.length; i++) {
            int sum = 0; 
            float avg = 0.0f; // 개인별 평균

            // 과목별 총점 누적
            korTot += score[i][0];
            engTot += score[i][1];
            matTot += score[i][2];

            System.out.printf("%3d", i + 1);

            // 각 과목 점수 출력 및 개인별 총점 계산
            for (int j = 0; j < score[i].length; j++) { // 조건 수정 (i → j)
                sum += score[i][j]; // 세미콜론 추가
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum / (float) score[i].length; // 평균 계산
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("========================");
        // 총점 포맷 수정 (%3d → %3d %3d %3d)
        System.out.printf("총점: %3d %3d %3d%n", korTot, engTot, matTot);
    }
}
