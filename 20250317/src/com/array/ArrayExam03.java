package com.array;

public class ArrayExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"사과" ,"배" , "바나나", "체리", "딸기", "포도"};
		String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		for(int i =0 ; i < day.length; i++) {
			System.out.print(day[i] + "\t");
		}
		System.out.println();
		
		for(String s : day) {
			System.out.print(s+"\t");
		}
	}

}
