package com.ifex;
import java.util.*;
/*
 *  주민번호  7번째 자리를 입력받아 연대와 성별을 출력하는 
 *  1800 0 남자 9 여자 1800 -> 9 , 여성 -> 0
 * 	 1900 1남자  2 여자         -> 1 ,            2
 * 	 2000 3남자  4여자              3               4
 *  7번째 자리 입력 : 4 
 * 	당신은 2000년대생 여성입니다.
 * 
 */
public class ifEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("주민번호 7번째입력");
		int a;
		int year = 0;
		String gender ="";
		a = sc.nextInt();
		gender = (a % 2 == 0) ? "여자" : "남자" ;
		switch(a) {
		case 1:
		case	2:
				year = 1900;
		break;
		case 3:
		case	4:
				year = 2000;
		break;
		case 0:
		case	9:
				year = 1800;
		break;		
		default:
			System.out.println("잘못입력했습니다.");
			System.exit(0);
		};
		System.out.println("당신은" + year +" 년대생" + gender + " 입니다") ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a; //7번째 입력
//		int year = 0;
//		String gender ="";
//		a = sc.nextInt();
//		gender = a % 2 == 0 ? "여성":"남성";
//		switch(a) {
//			case 1:
//			case 2:
//				year = 1900;
//			break;
//			case 3:
//			case 4:
//				year = 2000;
//			break;
//			case 0:
//			case 9:
//				year = 1800;
//			break;
//			default:
//				System.out.println("잘못 입력 하셨습니다.");
//				System.exit(0); //프로그램 종료
//		};
//		System.out.println("당신은" + year + " 년대생입니다"+ gender + " 입니다");
	}

}
