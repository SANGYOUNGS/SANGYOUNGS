package com.exam;
/* 문]
 * 		두 사람이 가위, 바위보를 하는 게임을 하고 있다. 
 *  	두 사람의 이름은 아루치와 마루치 
 * 		먼저 마루치가 먼저 가위 , 바위, 보 중 하나의 문자열로 받는다.
 * 		그리고 아루치가 마찬가지로 가위, 바위, 보 중 하나의 문자열을 입력 받는다.
 * 		두사람이 입력받은 문자열을  비교하여 누가 이겼는지를 판별하는 프로그램을
 * 		작성하시오.
 * 
 * 		출력
 * 		가위바위보중에서 입력 
 * 		마루치 : 가위
 * 		아루치 : 보
 * 		마루치가 이겼습니다.
 * 		equals . = 문자열 비교
 */

import java.util.*;

public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		System.out.print("마루치의 (가위,바위,보) 선택");
		String player1 = sc.nextLine();
		System.out.print("아추리의 (가위,바위,보) 선택");
		String player2 = sc.nextLine();
		if(player1.equals(player2)) {
			System.out.println("비겼습니다.");
		} else if((player1.equals("가위") && player2.equals("보")) ||
					  (player1.equals("바위") && player2.equals("가위"))||
					  (player1.equals("보") && player2.equals("바위"))){
			System.out.println("마루치가 이겼습니다");
			System.out.print("아추리가 졌습니다.");
		} else {
			System.out.println("마루치가 졌습니다.");
			System.out.print("아추리가 이겼습니다.");
		}
	}
	}
 /*
  *         if(m.equals("가위")){
  * 			if(a.equals("가위")){ 
  * 				System.out.println("비겼습니다.")'
  * 			
  * 
  * 
  * 
*/
