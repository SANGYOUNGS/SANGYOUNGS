package com.exam;

/* 로또 번호를 생성하는 프로그램을 구현
 * 
 * 
 * 
 * 
 */

import java.util.*;
public class ArrayExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[45];
		// 1~ 45 까지의 값을 배열에 저장
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		// 두값을 바꾸는데 사용할 변수 
		int temp = 0;
		// 임의의 값을 얻어서 저장할 변수 
		int j = 0; 
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45); // 0 ~44
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
		}//  lotto [i] 번째 값들이 j 값으로 반복할때마다 바뀐다.
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}
}
