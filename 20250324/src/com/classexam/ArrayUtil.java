package com.classexam;

public class ArrayUtil {
	public static int[] concat(int[] a, int[] b){
		int[] arr3 = new int[a.length + b.length];
		// 배열 a 와 배열 b를 크기의 배열을 생성
		
		// 배열 b 를 imsi 로 복사
/*		for(int i = 0; i< a.length; i++) {
				arr3[i] =a[i];
		}
		for(int i =0; i <  b.length; i++) {
				int k = a.length + i;
				arr3[k] = b[i];
				
		}
		return arr3;
	}*/
		System.arraycopy(a, 0, arr3, 0, a.length);
		System.arraycopy(b, 0, arr3, a.length, b.length);
		return arr3;
	}
	public static void print(int[] a) {
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
