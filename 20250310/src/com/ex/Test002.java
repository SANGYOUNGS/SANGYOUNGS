package com.ex;
/*
 * 
 *  자바의 기본 입출력 : BufferedReader 클래스
 *   
 */
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test002 {

	public static void main(String[] args) throws IOException {
		//BufferedReader 객체(인스턴스: instance) 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r;
		double a,b;
		final double p = 3.141592;
//		char name;
		String name;
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
		
		System.out.print("이름 입력 : ");
		name = br.readLine(); //-> 문자열 처리
//		name = (char)System.in.read(); -> 
		a = r * r * p; // 반지름
		b = r * 2 * p;
		System.out.println(name);
		System.out.println("반지름이 " + r + "인 원의 넓이 : " + a);
		System.out.println("반지름이 " + r + "인 원의 둘레 : " + b);
		System.out.println();
		
		
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f%n",r , a);
		System.out.printf("반지름이 %d인 원의 반지름 : %.2f%n",r , b);
	}

}
