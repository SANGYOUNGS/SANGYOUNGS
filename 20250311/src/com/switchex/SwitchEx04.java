package com.switchex;

/*  문 ] 
 *        커피 메뉴의 가격을 알려주는 프로그램을 작성
 *  		에소프레소 , 카푸치노, 카페라떼 -> 3500원 
 * 			아메리카노 = > 2000원
 * 			우의 메뉴가 아니면 => 메뉴에 없습니다.
 * 
 */
import java.util.*;

public class SwitchEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price = 0; 
		System.out.print("커피 선택");
		String coffee = sc.nextLine();
		if(coffee.equals ("에스프레소") || coffee.equals ("카페라떼") || coffee.equals ("카푸치노")) {
			price = 3500;
		} else if(coffee.equals ("아메리카노") ) {
			price = 2000;
		} else {
			System.out.print("메뉴에 없습니다");System.out.print("메뉴에 없습니다");
			return;
		}
		
		
		//		switch(coffee) {
//		case "에스프레소" :
//		case	 "카푸치노" :
//		case	 "카페라떼" :
//			price = 3500;
//		break;	
//		case "아메리카노" :
//			price = 2000;
//		break;
//		default :
//			System.out.print("메뉴에 없습니다");
//			return;
//		}
		System.out.println(coffee + " 는 " + price +" 원 입니다.");
	}
}
