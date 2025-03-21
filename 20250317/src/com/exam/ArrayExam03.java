package com.exam;
// 길이가 10인 배열을 생성하고 0 ~ 9 까지의 숫자로 초기화 한다.
// random()함수를 이용해서 배열의 임의의 위치에 있는 값과 
// 배열에 첫번째 값에 값을 바꾼다. 

//
public class ArrayExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 길이 10인 배열 선언
		int[] shuffle = new int[10];
		
		// 배열을 0 ~9 까지 초기화한다.
		for(int i=0; i < shuffle.length; i++) {
			shuffle[i] = i;
			System.out.print(shuffle[i] + " ");
		}
		System.out.println();
		for(int i =0 ; i < 100 ; i ++ ) {
			int n = (int)(Math.random() * 10);
			// 0 ~ 9 까지의 수중 임의 값을 얻는다.
			// System.out.print(n);
			int temp = shuffle[0];
			shuffle[0] = shuffle[n];
			shuffle[n] = temp;
		}
		
		for(int i =0 ; i < shuffle.length; i++) {
			System.out.print(shuffle[i]+ " ");
		}
	}

}
