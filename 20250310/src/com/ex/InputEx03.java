package com.ex;

import java.io.*;

/* InputStramReader is =new InputStreamReader(System.in);
 * BufferedReader br = new BufferedReader(is);
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * java.util.Scanner
 * 		
 * 		String na = br.readLine(); 문자열을 입력할때
 * 
 */



public class InputEx03 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner(System.in)
		// char c = sc.next().charAt(0); //
		System.out.print("이름을 입력 : ");
		String name = br.readLine();
		//name = sc.next(); 
		System.out.print("전화번호를 입력 :");
		String tel = br.readLine();
		System.out.print("주소를 입력 :");
		String addr =br.readLine();
		System.out.printf("당신의 이름은 %s 이고 전화번호는 %s 주소는 %s 입니다", name,tel,addr);

	}

}
