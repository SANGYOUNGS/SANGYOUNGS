	package com.array2;

	public class ArrayEx03 {

	    public static void main(String[] args) {
	        int[][] score = {
	                {100, 100, 100, 100},
	                {20, 20, 20},
	                {30, 30},
	                {40, 40},
	                {50, 50, 50}
	        };
	        int korTot = 0, engTot = 0, matTot = 0;

	        System.out.println("번호 국어 영어 수학 총점 평균");
	        System.out.println("========================");

	        for (int i = 0; i < score.length; i++) {
	            int sum = 0;
	            float avg = 0.0f;

	            // 각 과목별 점수 합산 (인덱스 확인)
	            if (score[i].length > 0) korTot += score[i][0];
	            if (score[i].length > 1) engTot += score[i][1];
	            if (score[i].length > 2) matTot += score[i][2];

	            System.out.printf("%3d", i + 1);

	            // 모든 과목 점수 출력 및 총점 계산
	            for (int j = 0; j < score[i].length; j++) {
	                sum += score[i][j];
	                System.out.printf("%5d", score[i][j]);
	            }

	            avg = sum / (float) score[i].length; // 평균 계산
	            System.out.printf("%5d %5.1f%n", sum, avg);
	        }

	        System.out.println("========================");
	        System.out.printf("총점: %3d %3d %3d%n", korTot, engTot, matTot);
	    }
	}