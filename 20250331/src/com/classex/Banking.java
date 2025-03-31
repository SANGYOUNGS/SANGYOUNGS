package com.classex;

import java.io.*;
public class Banking {
	
	public static void main(String[] args) throws IOException {
		
		
		Account na = new Account("홍길동");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1번 입금 2. 출금 3. 잔액조회 0 . 종료
		String strWork;
		int menu;
		do {
			System.out.println("\n 작업하실 내용을 선택하세요.");
			System.out.println("================");
			System.out.println("입   금  ======== >     1");
			System.out.println("출   금  ======== >     2");
			System.out.println("잔액 조회 ======== >    3");
			System.out.println("종   료  ======== >    0");
			System.out.println("================");
			
			System.out.println("업무를 선택하세요");
			strWork = br.readLine();
			menu = 0;
			
			if(strWork  != null) {
				menu  = Integer.parseInt(strWork);
			}else {
				System.out.println("업무내용이 입력되지 않았습니다.");
				System.exit(0);
			} 
			
			switch(menu) {
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				break;
			case 1:
				System.out.println("\n================");
				System.out.println("입금 할 금액을 입력해주세요");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;
			case 2 :
				System.out.println("\n================");
				System.out.println("출금 할 금액을 입력해주세요");
				String strwidthdrawIn = br.readLine();
				long widthdrwaInLong = Long.parseLong(strwidthdrawIn);
				na.withdraw(widthdrwaInLong);
				break;
			case 3 :
				System.out.println(na.getName() + "님의 현재 잔액은"  + na.getBalance() + "원 입니다." );
				break;	
			default : System.out.println("0 ~ 3 숫자를 입력해주세요.");
			}
		}while(menu != 0);
	}
}
