package com.objectEx;

public class Tvtest2 {

	public static void main(String[] args) {
		
		
		
		
//		Tv[] tvArr = new Tv[3];
//		// 객체 배열 선언
//		// 객체를 생성하고 각 인덱스 저장
//		tvArr[0] = new Tv();
//		tvArr[1] = new Tv();
//		tvArr[2] = new Tv();
		
		//Tv[] tvarr ={new Tv(),new Tv(),new Tv()};
//		Tv[] tvArr = new Tv[100];
//		for(int i =0; i< tvArr.length; i++) {
//			tvArr[i] = new Tv();
//		}
		// 베열의 길이 3인 객체배열을 생성
		Tv[] tvArr = new Tv[3];
		//11, 12 , 13
		// Tv객체를 생성해서 Tv 객체 배열의 각 요소에 저장
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		//출력
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i,tvArr[i].channel ) ;
		}
		
		/* 변수 : 하나의 데이터를 저장하는 공간
		 * 배열 : 같은 종류의 여러데이터를 하나의 집합으로 저장할수 있는 공간
		 * 클래스 : 데이터와 함수(메서드)의 결합 
		 * 
		 */
	
	
	}
	

}
