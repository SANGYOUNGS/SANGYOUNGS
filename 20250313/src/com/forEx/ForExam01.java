package com.forEx;

							 // j = 1 j < 10 
/* 	 별이 빛나는에 
 *	**********
 *	**********
 *	********** 		
 *	********** 
 * **********
 * 
 *  for( ){
 *  for(){}}
 * 
 */




public class ForExam01 {

	public static void main(String[] args) {
		//System.out.println("**********");
		for(int i = 2; i <= 9; i++) {
			for(int j= 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d%n",i,j,i*j);
			}
			System.out.println(" ");
			}
		}

}
