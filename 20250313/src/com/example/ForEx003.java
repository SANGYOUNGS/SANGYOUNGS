package com.example;

// 문] 무한대로 두 정수의 합을 구한느 프로그램을 작성하시오 ;
// 단 ,종료 0 종료하시오
import java.util.*; 
public class ForEx003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		for(;;) {
			System.out.print("첫번째 정수를 입력하세요.");
			a = sc.nextInt();
			if(a == 0) {
				System.out.print("0 을 입력하였습니다 프로그램을 종료합니다.");
				break;
			}
			System.out.print("두번째 정수를 입력하세요");
			b = sc.nextInt();
			System.out.printf("%d%n",a+b);
			}
		}	
	}
