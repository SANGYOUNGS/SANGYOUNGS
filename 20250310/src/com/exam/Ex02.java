package com.exam;
import java.util.*;
/* Scanner 클래스 사용
 *  초단위의 정수를 입력하고 , 몇시간, 몇분, 몇초인지를 출력하는 프로그램을 구현하시오.
 * 
 * 정수 입력 : 5000초
 * 1시간 , 23분, 20초 
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		int time ,second, minute, hour;
		System.out.print("정수를 입력하시오");
		time = sc.nextInt();
		hour = time / 3600;
		minute = (time % 3600) / 60;
		second = time % 60;
		
		System.out.print(time + "초는 \n");
		System.out.print(hour + "시간 \n");
		System.out.print(minute + "분 \n");
		System.out.print(second + "초 입니다.");
	}

}
