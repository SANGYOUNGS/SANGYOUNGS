package com.whileex;
/*	문 ]
 * 		사용자가 입력하는 정수를 계속해서 더해 나간다
 *  	만약 0이 입력되면 지금까지의 정수의 입력된 정수의합을 
 *  	출력하는 프로그램을 구현하시오.
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;

public class WhileEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input; 

        input = sc.nextInt(); // 📌 첫 입력을 반복문 밖에서 받기
		/*
		 * while (input != 0) { // 0이 아니면 반복 sum += input; // 합계에 더하기 input =
		 * sc.nextInt(); // 다음 입력 받기 }
		 */
          do{
          		sum += input;
          		input =sc.nextInt();
          } while(input != 0);
        System.out.println(sum);
    }
} // do while 문을 이용한풀이