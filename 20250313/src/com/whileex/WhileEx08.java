package com.whileex;
/* 
 * 		문] 
 * 			콜라, 사이다 , 마운틴 , 초코송이 , 에이스 , 웨하스가 나오는 자판기
 * 			프로그램을 구현하시오.
 * 
 * 
 */

import java.util.*;
public class WhileEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 1;
		String str ="";
        do {
            System.out.print("메뉴를 선택해주셍: (콜라 , 사이다 , 마운틴, 초코송이, 에이스, 웨어하우스 , 종료)");
            str = sc.nextLine(); // 사용자 입력 받기

            switch (str) {
                case "콜라":
                case "사이다":
                case "마운틴":
                case "초코송이":
                case "에이스":
                case "웨하스":
                    System.out.println(str + "입니다");
                    break; // switch문 종료
                case "종료":
                    System.out.println("프로그램을 종료합니다.");
                    sc.close(); // Scanner 닫기
                    return; // 프로그램 종료
                default:
                    System.out.println("잘못된 입력입니다.");
                    break; // switch문 종료
            }
        }while (true);
    }
}
