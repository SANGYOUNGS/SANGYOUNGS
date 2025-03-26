package com.classexam;

public class Dictionary {
	private static String[] kor = {"희망", "사랑" , "아기" , "돈", "미래", };
	private static String[] eng = {"hope", "love" , "baby" , "money", "future", };
	
	public static String kor2eng(String word) {
		for(int i = 0; i < kor.length; i++ ) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
			return null;
	}
}
