package com.array2;


import java.util.*;
public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		for(int i =0 ; i < words.length; i++) {
			System.out.printf("질문%d. %s의 뜻은 ?", i + 1 , words[i][0]);
			String str = sc.nextLine();
			
			if(str.equals(words[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다 %n%n" , words[i][1]);
			}
		}
	}
}
