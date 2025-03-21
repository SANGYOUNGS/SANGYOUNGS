package com.whileex;

/*	문] 
 * 		-1 ^ 2 + 2 ^ -3 ^ 2 + 4 ^ 2- 5^ 2 + ........... + 100^ 2의 합계를 
 * 			구하는 프로그램으 구하시오.
 * 	홀수 일떄  -
 * 짝수 일때  +
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
public class WhileEx06 {

	public static void main(String[] args) {
	    int a = 100, i = 1, sum = 0;
/*	    while (i <= a) {
	    	if(i % 2 == 0) {
	    		sum = sum + i * i; // 짝수일 때 (i % 2 == 0): sum에 i * i(제곱값)을 더합니다.
	    	} else {
	    		sum = sum - i * i; // 홀수 일 때 sum에 i * i(제곱값)을 뺍니다
	    	}
	    	i++;
	    }*/
	    do {
	      	 	if (i  % 2 == 0) {
	      			sum = sum + i * i;
	      }	else {
	      			sum = sum -  i * i;	
	      } i++;
	    }while ( i <= a);
	    System.out.println(sum);
	}
}
