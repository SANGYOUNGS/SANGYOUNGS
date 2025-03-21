package com.whileex;
/*
 * 	입력된 정수으 ㅣ평균을 구하는 프로그램
 *  	입력할 정수의 개수를 사용자로 부터 입력 받는다.
 * 		그 수만큼 정수를 입력받아 평균 값을 구한다.
 * 		단 , 평균 값은 실수 처리하시오.
 * 
 * 	 입력할 정수 개수 : 4
 * 		점수입력 : 2
 * 		점수입력 : 3
 * 		점수입력 : 4
 * 		점수입력 : 5
 * 		평균값
 * 
 * 
 * 
 */
import java.util.*;
public class WhileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0, num1, num2, sum =0 ;
		System.out.println("입력할 정수 갯수");
		num1 = sc.nextInt();
		double avg = 0;
		/*
		 * while(i < num1) { System.out.print("점수입력"); num2 = sc.nextInt(); sum += num2;
		 * // 점수를 누적시킨다. i++; } avg = sum / (double)num1; // 평균 구함
		 * System.out.println(sum); // 합계 System.out.printf("평균 : %.2f",avg);
		 */
		 do {
		  		System.out.print("점수입력");
		  		num2 = sc.nextInt();
		  		sum += num2;
		  		i ++;
		  } while(i < num1);
		  avg = sum / (double)num1;
		  System.out.println(sum);
		  System.out.printf("평균 : %.2f",avg);
		  
	}
}
