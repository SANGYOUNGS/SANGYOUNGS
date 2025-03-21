package com.func;
/* 1: 두 개의 숫자를 입력받아 큰수를 출력하는 기능 aaa() 
 * 2: 두 개의 숫자를 입력받아 그 사이의 수의 합계를 출력하는 기능 bbb()
 * 3: 세 개의 숫자를 입력받아 큰 순서대로 출력하는 프로그램  ccc()
 * 
 * 
 * 
 */
import java.io.*;


class Func {
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두번째 수 :");
		int b = Integer.parseInt(br.readLine());
		
		if (b>a)
			return b;
		else
			return a;
	}
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두번째 수 :");
		int b = Integer.parseInt(br.readLine());
		int sum = 0;
		if(a > b) { // 5 //3
			int temp = a;
			a = b;
			b = temp;		
		}
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
	public static String ccc(int x, int y, int z) {
		if(y >= x && y >= z) {
			int imsi = x;
			x = y;
			y = imsi;
		}else if(z >= x &&  z >= y) {
			int imsi = x;
			x = z;
			z = imsi;
		}
 		if(z >= y) {
 			int imsi = y;
			y = z;
			z = imsi;
 		}
 		String abc =x + " >= " + y + ">= " + z;
 		return abc; 
	}
}

public class FuncEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Func ff = new Func();
		int x = 0;
		
		while(true) {
			System.out.print("1: 최대수, 2: 사이합계 3: 수열 0: 종료");
			x = Integer.parseInt(br.readLine());
			if(x == 0) {
				break;
			}else if(x == 1) {
				//함수 호출
				int k = Func.aaa();
				System.out.println("둘 중 큰 수는 "+k +" 입니다.");
			}else if(x == 2) {
				Func.bbb();
			}else if( x == 3 ) {
				System.out.println("첫번째 수 : ");
				int firstsu = Integer.parseInt(br.readLine());
				System.out.println("두번째 수 : ");
				int secondsu = Integer.parseInt(br.readLine());
				System.out.println("세번째 수 : ");
				int thirdsu = Integer.parseInt(br.readLine());
				// 함수 호출 시 값을 인자로 넘김
				String str = Func.ccc(firstsu, secondsu, thirdsu);
				System.out.println("큰 수 나열은 " + str);
			}else {
				System.out.println("잘못 입력하였습니다.");
			}
			System.out.println();
		}//end while
		System.out.println("프로그램을 종료합니다.");
	}
}
