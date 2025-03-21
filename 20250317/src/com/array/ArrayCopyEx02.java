package com.array;
/*
 *  System.arraycopy() 메소드 를 이용함
 *  api  
 * 
 * 	메소드 형식
 * public static(공유하다)void.arraycopy(Object src, int srcPos,
 * 												 Object dest,  int destPos, int length) 
 * 
 * src: 원본 배열(소스 배열) 
 * srcPos: 원본 배열의 복사 시작 위치(인덱스)
 * dest: 복사될 배열 (복사본) 0, 1
 * destPos: 복사 시작 위치(2)
 * length: 복사되는 배열의 인덱스 수를 의미
 * 
 * 
 * 
 */
import java.util.*;
public class ArrayCopyEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]src = {"Java", "DataBase", "JSP", "NetWork"};
		// 4 + 2 개의 과목 6개
		String[] dest = new String[6];
		dest[0] ="Spring";
		dest[1] ="Python";
//		dest[2];
//		dest[3];
//		dest[4];
//		dest[5];;
		System.arraycopy(src, 0, dest, 2, 4);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		for(String s : dest) {
			System.out.print(s + "\t");
		}
		}
	}
