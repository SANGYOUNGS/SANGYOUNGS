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
		int i;
		for (int j = 1; j<=10; j++) {
		 for (i =2 ; i <= 10; i ++ ) {
			 for(int k=j; k < 4; k++) { 
			System.out.print(i + "x" + j + "="+ (i*j) + "\t");
			 }
		 }
		 	System.out.println();
		}
			System.out.println();
	}

}
