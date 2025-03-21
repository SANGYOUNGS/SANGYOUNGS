package com.whileex;
/*
 *  문] 
 * 		 - 50 에서 1까지 출력하는 프로그램을 구현하시오.
 * 		단 , 한줄에 5 개 씩 만 출력하고 수들 사이를 탭 간격으로 띄시오
 * 			
 * 			- 50  -49  - 46
 
 */
public class WhileEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -50;
		int b = 1;
		/*
		 * while(a <= b) { 
		 * System.out.print(a + "\t"); 
		 * a ++; 
		 * if(a % 5 == 0) {
		 * System.out.println(); System.out.println(); 
		 * 		} 
		 * }
		 */
		do { 
		  		System.out.print(a + "\t");
		  		a++;
		  if(a % 5 == 0 ) {
		  			System.out.println();
		  			System.out.println();
		  		}
		  }while(a <= b) ;
		  
	}

}
