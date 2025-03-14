package com.exam;
import java.util.*;
import java.io.*;

/*
 *  문제 ] 아래의 문제를 Scanner 와 BufferedReader 로 각각 처리하시오.
 *     	이름, 도시 , 나이, 체중 ,독신 여부를 입력받고 출력하는 프로그램을 작성하시오.
 * 
 */

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String name, city;
		int age = 0;
		double weight =0.00;
		boolean isSingle;
		System.out.print("이름 :");
		//name = br.readLine();
		name = sc.next();
		System.out.print("도시 :");
		//city = br.readLine();
		city = sc.next();
		System.out.print("나이 :");
		//age = Integer.parseInt(br.readLine());
		age = sc.nextInt();
		System.out.print("체중 :");
		//weight = Double.parseDouble(br.readLine());
		weight =sc.nextDouble();
		System.out.print("독신 여부 :");
		//isSingle = Boolean.parseBoolean(br.readLine());
		isSingle = sc.nextBoolean();
		System.out.println("이름은 " + name+ "이고, 도시는" + city);
		System.out.println("나이는 " + age + "이고 체중은"+ weight);
		System.out.printf("이름: %s 도시: %s 나이: %d 체중 : %.2f 독신여부 : %b" ,name , city , age , weight , isSingle);
	}
}
