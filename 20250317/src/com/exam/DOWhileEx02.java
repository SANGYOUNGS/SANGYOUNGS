package com.exam;
import java.io.*;
public class DOWhileEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor=0, eng =0, mat=0 , sum= 0;
		char grade=' ';
		float avg = 0.0f;
		
		do {
			System.out.println("국어점수 ");
			kor = Integer.parseInt(br.readLine());
		}while(kor < 0 || kor > 100);

		do {
			System.out.println("영어점수 ");
			eng = Integer.parseInt(br.readLine());
		}while(eng < 0 || eng > 100);

		do {
			System.out.println("수학점수 ");
			mat = Integer.parseInt(br.readLine());
		}while(mat < 0 || mat > 100);
		
		sum = kor + eng + mat;
		
		avg = sum / 3.0f;
		
		switch((int)avg) {
		case 10 :
		case 9 	:
			grade  = 'A';
			break;
		case 8 :
			grade  = 'B';
			break;
		case 7 :
			grade = 'C';
		case 6 	:
			grade  = 'D';
			break;
		default : grade ='F';
			break;	
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n" , avg);
		System.out.println("학점 : " + grade);
	}
}
