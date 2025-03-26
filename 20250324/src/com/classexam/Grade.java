package com.classexam;

import java.util.*;

public class Grade {
	// 멤버 필드 선언;
	private int math;
	private int scinece;
	private int phy;
	
	public Grade(int math, int scinece , int phy){
		this.math = math;
		this.scinece = scinece;
		this.phy = phy;
	}
	 // 메소드
	public double average() {
        return (math + scinece + phy) / 3.0; // 괄호를 사용하여 올바르게 계산
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("과학 점수 : ");
		int scinece = sc.nextInt();
		System.out.print("물리 점수 : ");
		int phy = sc.nextInt();

		Grade me = new Grade(math, scinece, phy);
		System.out.printf("평균은 %.2f\n", me.average());
	}
}
