package com.ex;
/* byte : 1byte 정수형
 * 				값의 범위 : -128 ~ 127
 * 				
 * 
 * 
 */
public class ByteEx {

	public static void main(String[] args) {
		
		byte bb;// 초기화를 안했음 
		bb = 0; // 자바에서는 초기화를 안했을 경우 컴파일시 에러가 발생됨
					// 안정성 때문임
					// 초기화 후 안전하게 사용 가능함
		System.out.println("byte 변수 bb : " + bb);

	}

}
