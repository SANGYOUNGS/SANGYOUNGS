package com.forEx;
// 3단 씩 출력해보기
/*2 3 4
  5 6 7 
	8 9
*/	

/* 디버깅 모드
 * 단축기 
 * 	F5 : 한줄 씩 진행하되 함수안이면 함수안으로 들어갑니다. 
 * F6 : 한줄 씩 진행하되 함수를 만나면 건너뛴다.
 * F7	: 현재 함수 끝까지 바로가서 리턴 후 함수를 호출한 곳으로 돌아온다.
 * F8	: 다음 break 포인트 까지 건너뛴다.
 * 
 */
public class WhileEx01 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2 , j; // 초기값
		
		do {
			j=1;
			do { 
				System.out.printf("%d x %d = %d%n",i,j,i*j);
				j++;
			}while(j <=9);
			System.out.println();
			i++;
		} while(i <=9 );
	}

}
