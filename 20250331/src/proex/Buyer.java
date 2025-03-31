package proex;

import java.util.*;
//Vector 클래스

public class Buyer {
	
	int money = 1000; //소유 금액
	int bonusPoint = 0; // 보너스 점수

	
	/*	
	// 여러 종류 의 객체를 배열로 만들기 
	Product p1 = new Tv();
	Product p2 = new Computer();
	Product p3 = new Audio();
	
	// 배열로 처리하면
	Product p[] = new Product[3];
	p[0] = new Tv();
	p[1] = new Computer();
	p[2] = new Audio();
	*/
	
	
	
	
	//Product item[] = new Product[10];
	// 구입한 제품을 저장하기 위한 배열
	Vector item = new Vector() ;// 10
	
	int i = 0; // 배열에 사용될 카운트 변수
	
	
	void buy(Product p) {
		
		if(money < p.price) {
			System.out.println("금액이 부족하여 물건을 살수 없습니다.");
			return ;
		}
		money -= p.price; // 소유한 금액에서 구임한 제품 가격을 뺀다.
		bonusPoint += p.bonusPoint;  // 제품의 포인트 점수는 추가된다.
		// 구입한 제품을 product 배열에 저장한다.
		//item[i++]  = p;
		item.add(p);
		
		System.out.println(p + "을 /를 구입하였습니다.");
		}
		void summary () { // 구입한 제품에 대한 정보를 요약해서 보여주는 기능
			// 제품한 제품을 합계 
			int sum = 0;
			String itemList = "";
			
			if(item.isEmpty()) { // Vector 가 비어 있는지 확인한다.
				System.out.println("제품이 없습니다.");
				return;
			}
			
			//반복문 을 이용해서 구입한 제품을 총가격과  목록을 만들기 
			/*
			 * for(int i = 0; i < item.length; i++) { if(item[i] == null) break; sum +=
			 * item[i].price; itemList += item[i] + ", "; }
			 */
			for(int i = 0; i < item.size(); i++) {
				Product p = (Product)item.get(i);
				sum += p.price;
				itemList += (i == 0) ? " " + p : " , "+p;
			}
			
			System.out.println("구입한 물품의 총금액은 " + sum + "입니다.");
			System.out.println("구입한 제품은 " + itemList + "입니다.");
		}
		
		void refund(Product p) {
			
			if(item.remove(p)) {
				money += p.price;
				bonusPoint -= p.bonusPoint;
				System.out.println(p +  "을/를 반품하셨습니다.");
			} else {
				System.out.println("구매하신 제품은 존재하지않습니다.");
			}
			
		}
	}
